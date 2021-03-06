const svg = d3.select('.box')
              .append('svg')
              .attr('width', 1800)
              .attr('height', 650)
              .style('background', 'HoneyDew');


// Dimensions
const margin = {top: 20, right: 20, bottom: 100, left: 100};
const graphWidth = 800 - margin.left - margin.right;
const graphHeight = 600 - margin.top - margin.bottom;

const graph = svg.append('g')
                 .attr('width', graphWidth)
                 .attr('height', graphHeight)
                 .attr('transform', `translate(${margin.left}, ${margin.top})`)
                //  .on('mouseover', function(d){
                //      d3.select(this)
                //         console.log(d)

                //  })

const groupeX = graph.append('g')
                     .attr('transform', `translate(0, ${graphHeight})`);
const groupeY = graph.append('g')

// ma div tooltip 

var div = d3.select("body").append("div")   
            .attr("class", "tooltip")               
            .style("opacity", 0);


d3.json('data.json').then(donnee => {


    // donnée Max
    const max = d3.max(donnee, d => d.prix);
    const min = d3.min(donnee, d => d.prix);
//     const extend = d3.extend(donnee, d => d.prix);
    
    const y = d3.scaleLinear()
               //  .domain([0, max])
			    .domain(d3.extent(donnee, function(d){return d.prix;}))
                .range([graphHeight, 0]);
    
    const x = d3.scaleBand()
                .domain(donnee.map(item => item.nom))
                .range([0, 1500])
                .paddingInner(0.3)
                .paddingOuter(0.2)

    
    const rects = graph.selectAll('rect')
                    .data(donnee)
                    .enter()
                    .append('rect')
                    .attr("class", function(d){return d.prix < 0 ? "negative" : "positive";})
                    .on('mouseover', function(d){
                        d3.select(this)
                            .style("opacity", 0.2)
                            .style("stroke", "black")


                       div
                            .style("opacity", 1)
                            .style("left", (d3.event.pageX+10) + "px")
                            .style("top", (d3.event.pageY-30) + "px")
                            .text(d.nom)
                            .append("p")
                            .text(d.prix)                            
                            .transition()
                            .duration(500);
                    })
                    .on('mouseout', function(d){
                        d3.select(this)
                        .style("opacity",1)
                        .style("stroke", null);
                        div
                        .style("opacity", 0);
                    })
                    
                    .attr('width', x.bandwidth())
                    .attr('height', 0)
                    .attr('x', function(d){return x(d.nom)})
                    .attr('y', graphHeight)
                    .transition()
                    .duration(800)

                    .attr('y', function(d){return y(Math.max(0, d.prix))})
                    .attr('height', function(d){return Math.abs(y(d.prix) - y(0))})

                    

         


         
// Création et mise en place des Axes


const axeX = d3.axisBottom(x)
const axeY = d3.axisLeft(y).ticks(5)

groupeX.call(axeX);

groupeX.selectAll('text')
.attr('transform', 'rotate(-30) translate(0,10)')
.attr('text-anchor', 'end');

groupeY.call(axeY);

// L'axe central

var baseline = d3.axisBottom(x)
.tickSize(0)
.tickFormat('');

graph.append('g')
.attr('class', 'baseline')
.attr('transform', `translate(0, ${ y(0) })`)
.call(baseline);

// var valueLine = d3.line()
// .x(function(d) {return x(d.prix)})
// .y(function(d) {return y(d.nom)});

// // Ajout du Path
// graph.append('path')
// .attr("class", "line")
// .attr('d', valueLine(donnee));

})