# Premier Graphique

## Mise en forme des données et utilisation de l'index 

**``Enter``** fonctionne vraiment comme un tableau avec les **``EnterNode``** chaque élément du tableau a un **index** et grâce à cette index **il est possible de manipuler des choses** 

```js
    rects.enter()
         .append('rect')
         .attr('width', 50)
         .attr('height', function(d){return d.prix})
         .attr('fill', 'teal')
         .attr('x', function(d,i){return i * 75});
         
```
Dans cet exemple grâce à l'index **``i``** il est possible de **gérer là marge en chaque éléments du tableau**


## Créer une échelle avec "scaleLinear"


Le **``ScaleLinear``** permet de gérer l'échelle d'affichage, c'est super important sur un graphique.

```js
d3.json('data.json').then(donnee => {
    const y = d3.scaleLinear()
                .domain([0, 1000])
                .range([0, 500]);
    
    
    const rects = svg.selectAll('rect')
                     .data(donnee);
    
    rects.attr('width', 50)
         .attr('height', function(d){return y(d.prix)})
         .attr('fill', 'teal');
```

**``domain``** est calculé de 0 à la plus grande valeur 

**``range``** est calculé à la hauteur du cadre de travail "svg" 
Pour avoir le résultat il faut retourné y sur les fonctions des attr


## Créer l'échelle pour l'axe "X"

Concernant l'axe des x nos données seront **placer en fonction du nombre placer dans la range**

Le calcul effectué est là valeur **" maxRange / le nombre d'élément dans le Json "** (Le calcul se fait automatiquement)

```js
    const x = d3.scaleBand()
                .domain(donnee.map(item => item.nom))
                .range([0, 600])
                .paddingInner(0.3)
                .paddingOuter(0.2)
```
**600/4 = 150**

Dans cette exemple pour notre json contenant 4 élément il y aura 1 élément tout les 150 jusqu'à valeur 600 du **range**.

et pour l'utiliser il suffit de le return dans un **attr** avec nom car contrairement à l'axe des y qui s'exécue en fonction de là valeur, **l'axe s'exécute en fonction du nom**.

```js
    rects.enter()
         .append('rect')
         .attr('width', x.bandwidth())
         .attr('height', function(d){return y(d.prix)})
         .attr('fill', 'teal')
         .attr('x', function(d){return x(d.nom)});
```

là méthode **``bandwidth()``** permet au élément json de s'étendre et d'**occupé l'espace disponible dans là valeur max du range**. remplir les 600px en prenant chacun 150px.

Afin que ça puisse être harmonieux il faut utiliser des paddings : 

Les paddings vont de 0 à 1

**``paddingInner``** : marge entre les éléments 

**``paddingOuter``** : marge sur les cotés


**Voir Exercice 4 : "Scale"**



## Min, Max et Extent

**``Min``** permet de récupérer la plus petite valeur

**``Max``** permet de récupérer la plus grande valeur

**``Extent``** permet de récupérer la plus petite valeur là la plus grande valeur **(sous forme de tableau)**

```js
    const min = d3.min(donnee, d => d.prix);
    const max = d3.max(donnee, d => d.prix);
    const extent = d3.extent(donnee, d => d.prix);
```

Cela peut être pratique dans le cas des données du **domain** afin qu'il puissent d'actualiser automatiquement plutôt que en fonction des valeur des éléments ajouté ultérieurement dans la BDD

**Voir Exercice 5: "Min Max Extend"**

## Ajouter un cadre SVG directement dans le Javascript

```js
const svg = d3.select('.box')
              .append('svg')
              .attr('width', 600)
              .attr('height', 600)
              .style('background', 'AntiqueWhite');
```

## Mettre nos éléments dans un groupe et le décaler 

mettre les éléments dans un groupe permet de pouvoir tous les gérer d'un coup, **comme si on avait créé une div qui englobe nos éléments**.

grâce à **``margin``** on va pouvoir **établir les dimensions et les marges nécessaire pour notre graphique**.

```js
const margin = {top: 20, right: 20, bottom: 100, left: 100};
const graphWidth = 600 - margin.left - margin.right;
const graphHeight = 600 - margin.top - margin.bottom;
```

Ensuite le mieux pour l'utiliser et de le lier directement au **``svg``** et ensuite au moment ou on sélectionne les données de faire directement appel à la notre groupe ou " div " enfin qu'il puisse englober les données

```js
const graph = svg.append('g')
                 .attr('width', graphWidth)
                 .attr('height', graphHeight)
                 .attr('transform', `translate(${margin.left}, ${margin.top})`);
const groupeX = graph.append('g')
                     .attr('transform', `translate(0, ${graphHeight})`);
const groupeY = graph.append('g')
```

```js
    const rects = graph.selectAll('rect')
                     .data(donnee);
    
```

Pour créer un groupe il faut utiliser **``'g'``** en paramètre de la méthode **``append``**

```js
const groupeX = graph.append('g')
```

**Voir Exercice 6 : "Dimensions"**

## Création des Axes

Dans un premier temps il faut lier le graph au groupes d'axes 

```js
const groupeX = graph.append('g')
                     .attr('transform', `translate(0, ${graphHeight})`);
const groupeY = graph.append('g')
```

ici **``attr``** permet **d'inverser l'axe horizontal** de haut en bas 

La création des axes se fait grâce a des méthodes d3 pour l'axe x (horizontal)  **``d3.axisBottom()``** et pour l'axe y (vertical)  **``d3.axisLeft()``**

**Création :**
```js
const axeX = d3.axisBottom(x)
const axeY = d3.axisLeft(y)
```

**Mise en place :**
```js
groupeX.call(axeX);
groupeY.call(axeY);
```

## Inverser nos éléments et l'axe Y

Alors pour inverser l'axe y il faut dans un premier faire un calcul mathématique logique, Pour avoir un rectangle là taille voulu il faut prendre là **``Hauteur du graphique - le paramètre``** 

```js
    rects.attr('width', x.bandwidth())
         .attr('height', function(d){return graphHeight - y(d.prix)})
         .attr('fill', 'teal')
         .attr('x', function(d){return x(d.nom)})
         .attr('y', function(d){return y(d.prix)});
```

Dans ce cas là, c'est là **Hauteur du graphique - le prix** mais c'est pas tout.

Il faut ajouter avec **``attr``** une fonction prenant en compte le prix pour faire démarrer le **``svg``** de là **valeur max à 0 (là valeur de départ de y)**.

**Voir Exercice 7 : "Inversion"**

## Styliser les "Ticks"

Les **``ticks``** c'est les valeurs afficher sur les axes 

Il est possible de les styliser, mettre une fréquence, un format... 

```js
const axeX = d3.axisBottom(x)
const axeY = d3.axisLeft(y)
               .ticks(5)
               .tickFormat(d => d + ' Euros');
```

Pour ajouter sur style sur les axes il faut le faire au moment de l'appel des axes 

```js
groupeX.call(axeX)
.style('font-size', "14px");
groupeY.call(axeY)
.style('font-size', "13px");
}
```

**Voir Project : Graphique**