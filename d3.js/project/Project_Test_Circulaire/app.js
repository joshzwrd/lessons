// Creer notre cadre 
 
var svg = d3.select('body')
            .append('svg')
            .attr('width', 700)
            .attr('height', 600)
            .style('background', 'antiqueWhite');

var items = [200, 300, 100, 300];

var data = d3.pie().sort(null)(items); // Permet de se mettre dans l'ordre du tableau

// console.log(data);

var segments = d3.arc()
                 .innerRadius(40) // le trou au milieu du camanbert 
                 .outerRadius(125) // la taille du graphique circulaire
                 .padAngle(0.02); // l'écart entre les sections
                 
// on va creer un groupe et y ajouter les éléments path

var sections = svg.append("g")
                  .attr('transform', 'translate(300,300)')
                  .selectAll('path')
                  .data(data)
                  .enter()
                  .append('path')
                  .attr('d', segments)
                  .attr('fill', 'crimson');