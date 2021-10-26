const dims = {height: 300, width: 300, radius: 150};

const svg = d3.select('.box')
              .append('svg')
              .attr('width', dims.width + 150) // pour les labels
              .attr('height', dims.height + 150);

const graph = svg.append('g')
                 .attr('transform', `translate(${dims.width / 2 + 5}, ${dims.height / 2 + 5})`);

const pie = d3.pie()
              .sort(null)
              .value(d => d.prix);

const arcPath = d3.arc()
                  .outerRadius(dims.radius)
                  .innerRadius(dims.radius / 2);

// couleur
const couleur = d3.scaleOrdinal((d3['schemeAccent']));

// légendes
const groupeLegendes = svg.append('g')
                          .attr('transform', `translate(${dims.width + 40}, 10)`);

const legendes = d3.legendColor()
                   .shape('circle')
                   .scale(couleur)

// fonction de mise à jour
const maj = (donnee) => {
    
    // domaine des couleurs
    couleur.domain(donnee.map(d => d.nom));

    // domaine
    groupeLegendes.call(legendes);
    groupeLegendes.selectAll('text')
                  .attr('fill', '#fff');
                  


    // liaison path->données
    const paths = graph.selectAll('path')
                       .data(pie(donnee));

    //console.log(paths.enter());
    
    // exit
    paths.exit().remove();

    // maj du dom
    paths.attr('d', arcPath);

    paths.enter()
        .append('path')
        //.attr('d', arcPath)
        .attr('stroke', '#fff')
        .attr('stroke-width', 3)
        .attr('fill', d => couleur(d.data.nom))
        .transition()
        .duration(700)
        .attrTween('d', animEnter);


        // evenements
        graph.selectAll('path')
             .on('click', deleteClick)
}

// appel de la db et rester à l'écoute

var donnee = [];

db.collection('dépenses').onSnapshot(res => {

    res.docChanges().forEach(change => {

        const doc = {...change.doc.data(), id: change.doc.id};

        switch(change.type) {
            case 'added':
                donnee.push(doc);
                break;
            case 'modified':
                const index = donnee.findIndex(item => item.id == doc.id);
                donnee[index] = doc;
                break;
            case 'removed':
                donnee = donnee.filter(item => item.id !== doc.id);
                break;
            default:
                break;
        }
    });

    maj(donnee);
})


// Animation enter 


const animEnter = (d) => {

    var i = d3.interpolate(d.startAngle, d.endAngle);

    return function(t){
        d.endAngle = i(t);
        // on actualise les coords du Path
        return arcPath(d);
    }

}


// fonction deleteclick

const deleteClick = (d) => {

    const id = d.data.id;
    db.collection('dépenses').doc(id).delete();
    
}