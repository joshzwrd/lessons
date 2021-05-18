Premier cours de CSS


Il y a diffèrent moyen d’Écrite en CSS sur notre page HTML .

Il y a 

Le TAG <Style> qui se met dans le <head>

L'attribut <Style> qui se met directement sur le TAG  (EX ="<P") HTML. 

et Enfin 

le TAG <link> qui permet d'aller chercher une autre page en .css pour l'ajouter à notre page html. il se situe toujours dans le <head>


Syntaxe : 

/*  Exemple de commentaire en css */


Selector     // le tag ou l'attribut qu'on veut sélectionner sur la page .html
{
    property : value;   // ici la propriété et la valeur , on peut en avoir autant qu'on veut.
}

Exemple : 

p  // mon selector
{
    color : red;  // ma propriété : sa valeur 
}

Les couleurs en CSS : 

Encodage RGB ( Red , green, blue)

on peut donc mettre d'autre couleur en fessant " un melange des 3 couleurs " 
color : rgb(0,0,0)

Exemple : 

color : rgb (0,0,255)    // sur ce code la couleur affiché sera le bleu, les 2 autres sont à 0.

pour ajouter de la transparence il faut ajouter la valeur Alpha

Exemple : 

color : rgb (0,0,255,0,1)    // le bleu sera transparent à 0,1%

Hexadécimal : 

0 1 2 3 4 5 6 7 8 9 --> Base 10
0 1 2 3 4 5 6 7 8 9 A B C D E F --> Base 16
 permet de choisir la couleur en écrivant son code

Exemple : 

color : #30edf2  // ceci est le code de la couleur bleu ciel

Les unités de mesures en CSS :

Pixel = un point sur l'ecran
font = police de caractère 

font-size : permet de gérer ta taille 
il est suivi de px ou em

em permet de gérer la taille en fonction de la taille par défaut cela permet d'adapter la taille a n'importe quel support .


Les polices : 

3 sont intégrés au CSS

line-heigt: hauteur ligne pour aéré l'écrit

serif  = une police un peu arrondi sur les bords
sans-serif = pareil que serif mais sans arrondi sur les bords
cursive = une écriture qui se rapproche d'une écriture manuel , hyper simple 

font-family = permet de choisir la police avec lequel l'utilisateur va voir la page 

Exemple : 

font-family: Arial;

un système de rattrapage existe , permet de pouvoir mettre plusieurs police. cela permet au cas ou la police n'est pas installer sur l'ordinateur d'en utiliser une autre.

Exemple : 

font-family: Arial, Segoe UI;   // donc dans ce cas si l'ordinateur de l'utilisateur n'a pas Arial, il va essayer d'utiliser Segoe UI si il le possède et sinon il utilise une des 3 déjà intégré au css et qui ne dépendent d'aucun ordinateur  .

font-wight : bold; = permet de mettre le texte en gras 
text-align: center;  = permet de centrer le texte au milieu de la page.

Différents sélecteurs en CSS :

*= permet de tout sélectionné  

Dans le cas plusieurs selector on le même nom

dans 2 div différents il y a 2 <p mais je veut qu'il n'ai pas les même attribut .

Exemple :

div p   // il se trouve dans div
{
    color : grey;
    font-size 15px;
}

CLASS :

on peut sélectionné un paragraphe en lui donnant un nom de class qu'on revient cherché dans la page .css

en html : <h1 class"special"> 

Exemple 

.special  // mettre un "." avant le nom de la classe pour le pointé
{
    color : orange;
}

on peut appliqué le même style a plusieurs élément grâce a ça 

ID : 

on peut sélectionné un paragraphe en lui donnant un nom de ID qu'on revient cherché dans la page .css

en html : <p id="unique">

#unique  // mettre un "#" avant le nom de la ID pour le pointé
{
    font-size: 80px;
}

cela permet de pointé un seul tag ou paragraphe que l'on veut modifier les attributs 

les pseudos class :

Selector :pseudotclass     // le tag ou l'attribut qu'on veut sélectionner sur la page dans l’État dans laquelle il se trouve en  .html

{
    property : value;   // ici la propriété et la valeur , on peut en avoir autant qu'on veut.
}

Exemple : 

a: link   // Mon tag à dans l’état link pour faire un lien 
{
    color : blue;  // ma propriété : sa valeur 
}

a: hover   //Quand je passe ma souris dessus
{
    color : orange;  // ma propriété : sa valeur 
}

a: visited   // Quand j'ai déjà cliquer dessus
{
    color : red;  // ma propriété : sa valeur 
}

Donc dans mon exemple ci-dessus mon lien s'affiche en blue, lorsque je passe ma souris dessus il devient orange et lorsque je clique dessus et visité la page il passe en red .

Les propriétés Display : 
 
p
{
    display: 
}

display : block;   // permet de mettre tout les paragraphes les uns a la suite des autres 
, chaque élément repart à la ligne

display : inline   // permet de mettre chaque paragraphe les uns après les autres sur la même ligne.

display: inline-block  // permet de mettre un width: pour choisir la taille des block.

display: none  // permet de masqué nos paragraphes 

Modèle de la boite :


Margin: Gérer l'espace autour en fonction du parent 

margin peut etre suivi de top : top , bottom , left, right un peu comme sur Android Studio


margin: 100px auto;   // auto permet d'indiquer a l'élément de gérer automatiquement l'espace a gauche et a droit afin que l'élément puisse rester au centre de la page.

Border: créer une bordure a l’élément

pour gérer ses attributs il suffit de mettre un "-" et ajouter les attributs 

Exemple :
border- width 5px;
border-color green;

on peut mettre sur la même ligne comme : 

border: 10px solid green;

border-left: 5px solid green;    // la bordure sera uniquement a gauche


Padding : // espace a l’intérieur de l’élément 

il s’écrit avec 4 valeurs comme le margin 

padding: 50px 20px 30px 100px;    // l'ordre top(haut), right(droite) , bottom(bas), left(gauche) . 

on peut aussi mettre 2 valeurs 

padding: 50px 20px   // dans ce cas la les conditions changent et 50px vaut Top/Bottom et 20px vaut Left/Right.

Propriété Float : 

Float permet de faire flotter un élément on peut choisir de quel coté le faire flotté.

Exemple : 

Float: Left;   // pour le faire flotter a gauche 

Pour les éléments qui ne se rendent pas compte que d'autres éléments flotte autour d'eux il faut leurs ajouté un clear

footer
{
    background-color: grey;
    clear:left ;  // cela lui indique qu'un élément flotte a ça gauche donc il peut passer au dessus
}

pour qu'il puisse savoir des 2 coté il faut écrire 

clear: both;   // Both veut dire tous les deux 


La Propriété positon : 

permet de scotché des éléments à la page 

position: static;   // ne sert à rien parce que c'est la position par defaut

position: relative; donne le pouvoir de gerer la position de l'élément .

Exemple :

position:relative
top: 20px, left: 5px;   // l'élément restera à 20ctm en et 5 a gauche .

position: fixed  
bottom:0px;
right:0px                    // l'élément va rester fixé en bas à droite là page et cela même si on scroll de haut en bas de notre page 

position: absolute;     // s'exprime par apport au premier parent qui n'est pas de postion static