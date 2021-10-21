# Comprendre les SVG 

## Que sont les SVG ?

- **SVG = Scalable Vector Graphics**
- Ne perdent pas en qualité lorsqu'on les Zoom
- Petites tailles contrairement aux JPG, PNG.
- Possèdent des tas de fonctionnalités (Taille, couleurs, formes ... ).


## Créer des formes en SVG

Pour créer un SVG il faut l'initier de la manière suivante 

```html
<svg width="500" height="400"> 

<!-- On peut mettre du texte dedans  -->

<text x="100" y="80" fill="white">Du texte en svg</text>


<!-- dessiner une ligne -->

<line x1="50" y1="150" x2="200" y2="220" stroke="red"/>


<!-- dessiner un cercle -->

<circle cx="350" cy="100" r="50" fill="pink"></circle>


<!-- dessiner un rectangle -->

<rect x="50" y="300" width="100" height="50" fill="crimson"></rect>


<!-- dessiner une ellipse -->

<ellipse cx="250" cy="250" rx="50" ry="100" fill="white"></ellipse>


<!-- dessiner un polygone -->

<polygon points="200,10 250,190 160,210" fill="white"></polygon>
</svg>
```

**``fill``** permet de mettre une couleur à un élément

**``x``** et **``y``** définissent le positionnement à l'intérieur de l'élément svg afin de pouvoir positionné les enfants

**``cx``** et **``cy``** définissent au le positionnement mais en partant du du centre le l'élément enfant pratique pour les cercles

**``rx``** et **``ry``** permettent de modifier le rayon d'un cercle ou une ellipse

**``stroke``** c'est comme une bordure

pour le polygon chaque doublette de nombres défini son placement x et y dans **``points``**  


## Créer des formes 2 + Path

**Path = chemin**

Dans 90% des cas c'est D3 lui même qui génère les paths pour faire les formes avancé
```html
<svg width="500" height="400" style="background: rgb(28,24,83)">

  <path d="M 150 50 L 75 200 L 225 200 Z" fill="orange"></path>
    
</svg>
```

**M** = le début 

**L** = line to

**Z** = fin