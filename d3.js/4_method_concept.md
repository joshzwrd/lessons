# Quelques méthodes et concepts de D3


## Projet : Créer un graphique à ligne

Une manière de gagner du temps sur la manière de gérer les marges 

dans le projet précèdent  

```js
const svg = d3.select('.box')
              .append('svg')
              .attr('width', 600)
              .attr('height', 550)
              .style('background', 'AntiqueWhite');

const graph = svg.append('g') 
                 .attr('width', graphWidth) 
                 .attr('height', graphHeight) 
                 .attr('transform', `translate(${margin.left}, ${margin.top})`);
```

Ici on append directement le graph 

```js
var svg = d3.select("body").append('svg')
            .attr('width', 960)
            .attr('height', 550)
            .style('background','antiqueWhite')
            .append('g')
            .attr('transform', "translate(" + margin.left + ", " + margin.top + ")");
```

C'est pas "mieux" c'est juste une autre manière de faire 

## Projet :  Création des axes

la méthode **``d3.timeParse(%d-%b-%y)``**  permet de créer un modèle de donnée date 

Projet : Mise en place de la ligue

```js
    // Création des coordonnées
var valueLine = d3.line()
.x(function(d) {return x(d.prix)})
.y(function(d) {return y(d.nom)});

    // Ajout du Path
graph.append('path')
.attr("class", "line")
.attr('d', valueLine(donnee));

```

## Utiliser des couleurs avec D3

**``fill``** est là méthode là plus simple pour injecter de là couleurs a nos **``svg``**

```js
         .attr('fill', '#82e0aa')
```

```js
         .attr('fill', 'teal')
```

```js
         .attr('fill', 'rgb(198,45,205)')
```

```js
         .attr('fill', 'rgba(199,0,57,0.5)')
```

## Utiliser des palettes 

```js
    const myColor = d3.scaleLinear()
                .domain([1, 15])
                .range(["white", "blue"]);

    svg.selectAll(".firstrow")
                .data(data)
                .enter()
                .append("circle")
                .attr("cx", function(d,i){return 30 + i*60})
                .attr("cy", 50).attr("r", 19)
                .attr("fill", function(d){return myColor(d) }) 
```

**Voir Project : Colors**

### Créer des aires 

```js
var points = [[0, 100], [130, 180], [260, 100], [390, 180], [600, 100]];
var svg = d3.select('body')
            .append('svg')
            .attr("width", 600)
            .attr('height', 500)
            .style('background', 'antiqueWhite');
            
var area = d3.area().y0(500);
svg.append('path')
   .attr('d', area(points));
```

`**Voir Project Circulaire**`