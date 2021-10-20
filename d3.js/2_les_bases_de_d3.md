# Les bases de D3

## mettre en place D3 

**le lien :**
```js
  <script src="https://d3js.org/d3.v5.js"></script>
  <script src="app.js"></script>
```

Pour le **script** il est mieux de créer un fichier **JavaScript** à par et de faire appel celui-ci après le lien de **d3.js**

## Select et SelectAll

Le **selector** fonctionne de là même manière que le querySelector pour rappel d3 est un framework js

**Exemple :**

js :

```js
const div = document.querySelector('.box');
const div = document.querySelectorAll('.box');
```

d3.js : 

```js
const d3div = d3.select('.box');
const d3div = d3.selectAll('.box');
```


## Ajouter avec "append"

**``append``** permet d'ajouter des éléments **dynamiquement**

**Exemple :** 

```js
const box = d3.select('.box');

const svg  = box.append('svg')

svg.append('rect');

svg.append('line');

svg.append('circle');
```


## Enchaîner les méthodes + la méthode  "attr"

La méthode **``attr``** permet d'ajouter des attributs au élément 

**Exemple :**

```js
const box = d3.select('.box');

const svg  = box.append('svg');

svg.attr('height', 500);
svg.attr('width', 600);
```

Mais il est favorable de privilégié la **method chaining** car c'est plus lisible, plus simple à écrire et fait gagner en performance.

**Exemple Method Chaining :**

```js
const box = d3.select('.box');
const svg  = box.append('svg')
        .attr('height', 500)
        .attr('width',600);

svg.append('rect') 
    .attr('width', 150)
    .attr('height', 75)
    .attr('fill', "red")
    .attr('x', 50)
    .attr('y', 200);
```


## les groupes de SVG

L'avantage d'ajouter des  groupes  c'est de pouvoir répertorier tout les append et pouvoir **leurs attribuer des données communes**

**Exemple :**

```js
const groupe = svg.append('g')
                  .attr('transform', 'translate(0,100)')

groupe.append('rect')
    .attr('width', 150)
    .attr('height', 75)
    .attr('fill', "red")
    .attr('x', 50)
    .attr('y', 200);

groupe.append('line')
    .attr('x1', 50)
    .attr('y1', 100)
    .attr('x2', 250)
    .attr('y2', 200)
    .attr('stroke', 'green');

groupe.append('circle')
    .attr('r', 100)
    .attr('cx', 350)
    .attr('cy', 150)
    .attr('fill', 'pink');
```

## Lier les données avec "data"

**Une des méthodes les plus importantes**

```js
var myData = ['50','45','40','35','30'];

d3.selectAll('p')
  .data(myData)
  .text(function(d){
      return d;
  })
  .style("font-size",function(d){
      return d + "px"
  })
```

Dans l'exemple précédent,  Les données du tableau **``myData``** sont afficher dans 5 balises **``<p>``** créer au préalable.

**``text``** est une méthode qui permet d'afficher du texte et son paramètre d'indique juste qu'il faut hydrater nos éléments **``<p>``** avec les valeurs du tableau **myData**

**Voir Exercice 1 :  "Cercle"**

## La méthode "enter"

Permet d'ajouter dynamiquement des éléments **html**

```js
var donnee = [{radius:20, x:50, y:50, color:"red"},
               {radius:25, x:150, y:50, color:"deeppink"},
               {radius:30, x:250, y:50, color:"indigo"},
               {radius:35, x:350, y:50, color:"pink"},
               {radius:40, x:450, y:50, color:"green"}];

const svg = d3.select('svg');

const circles = svg.selectAll('circle')
                   .data(donnee)
                   .attr('r', function(d){return d.radius})
                   .attr('cx', function(d){return d.x})
                   .attr('cy', function(d){return d.y})
                   .attr('fill', function(d){return d.color});

circles.enter()
       .append('circle')
       .attr('r', function(d){return d.radius})
       .attr('cx', function(d){return d.x})
       .attr('cy', function(d){return d.y})
       .attr('fill', function(d){return d.color});
```

dans cet exemple enter il n'y a qu'un seul élément circle dans le html mais lui **complète en fonction du nombres d'éléments dans le tableau**.

**Voir Exercice 2 : "Enter"**