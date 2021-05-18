Premier cours sur Bootstrap


Afin que notre page soit responsive donc s'adapte a tout support il faut mettre :
<meta name="viewport" content="width=device-width, initial-scale=1" >
 dans le <head> du code html



Container : 

il en existe 2

1er Container reste centrez sur la page et sa meme si on etant la page

2er Container-fluid Prend toute la largeur de la page et s'etant avec.

Grid System = Système de grille 

Bootstrap a plusieurs catégorie de largeur de viewport afin de pouvoir détecter le fait d'etre sur PC , Portable ou Tablette 

xs : toutes largeur de viewport qui sont inférieur 768 px  ( Sera la largeur des phones)

sm (small) = toutes les largeurs qui sont supérieur ou égal a 768 px (largeur tablette)

md (medium) =toutes les largeurs qui sont supérieur ou égal a 992 px (largeur petit desktop)

lg (largeur) =toutes les largeurs qui sont supérieur ou égal a 1200 px (largeur grand desktop)

Updates Bootstrap 4: 

Ajout d’une nouvelle taille pour les largeurs d’écran inférieures à 576px. 

Cette nouvelle taille c’est xs qui était auparavant pour les largeurs d’écran inférieures à 768px. 

Ce changement fait que toutes les autres tailles sont décalees d’un rang. Par exemple .col-md-6 dans la version 3 devient .col-lg-6 dans la version 4 

Nouvelles tailles: o xs < 576px o sm >= 576px o md >= 768px o lg >= 992px o xl >= 1200px 

 Pour la taille xs, on peut se passer du préfixe xs, c’est-à-dire qu’au lieu d’écrire .col-xs-8, on pourra écrire directement col-8. Les autres tailles ont besoin du préfixe.
La largeur d'une ligne c'est 12 points

on peut gerer une ligne afin de mettre des block cote a cote a partir de la largeur qu'on veut 

Exemple : 

<div id="block-1" class"col-md-6"...............</div>
<div id="block-2" class"col-md-6"...............</div>

donc dans cette exemple les 2 div les unes sur les autres a partir de 992px V3 et 768 px en V4 Les 2 divs vont se mettre cote a cote en premier 50% de la ligne chacun car une ligne fait 12pts

Afin de pouvoir choisir de mettre plusieurs élément sur une ligne en fonction de la taille d'ecran on peut le faire en ajouter tout simplement l'information de la classe larguer de celui-ci

Exemple : 

<div id="block-1" class"col-sm-6 col-md-4"...............</div>
<div id="block-2" class"col-sm-6 col-md-4"...............</div>
<div id="block-3" class"col-sm-6 col-md-4"...............</div>

Dans cette exemples à partir de la classe sm(tablet) les div se mettront 2 par lignes et a partir de md(desktop) ils se mettront 3 par lignes 

Typography :

 La taille de la police globale est passée de 14px à 16px 
 Toutes les tailles de police de nos éléments (p, h1, h2, h3, etc…) ont été augmentées

Forms : 
Updates Bootstrap 4:

 Sur l’élément qui contient l’élément input , les classes .checkbox et .radio deviennent .form-check. Sur l’élément input, on ajoutera la classe .form-checkinput et sur l’élément label, on ajoutera la classe .form-check-label  Pour différencier un radio d’un input, on utilisera la propriété type de l’élément input (comme avec la version 3). C’est-à-dire type="checkbox" ou type="radio"  Les classes .checkbox-inline et .radio-inline deviennent .form-check-inline  Les classes .has-error, .has-warning, et .has-success sont remplacées par la validation des éléments HTML5 à l’aide des pseudo-classes :invalid et :valid  Les classes .input-lg et .input-sm deviennent .form-control-lg and .form-controlsm

Button : 

le css de bootstrap a configure plusieurs class btn 

btn-primary = bleu foncé
btn-succes = vert
btn-info = bleu clair
btn-warning = orange
btn-danger = rouge
btn-link = pour faire un lien

on peut les faires plus au moin grand en ajoutant les class largeur au button 

Exemple : 

<button type="button" class="btn-primary btn-lg"> Button1 </button>

ici le button sera plus large il y a plusieurs class de largeur 
btn-xs / btn-sm / btn-md / btn-lg / btn-xl
 
cela reprend un peu le principe des grid systeme

Pour que le bouton prenne toute la largeur de la ligne il faut ajouter la class btn-block :

<button type="button" class="btn-primary btn-block"> Button1 </button>

On peut aussi crée des groupe de bouton et cela les mettra coller cote a cote horizotalement.
il suffit de mettre tous les bouton dans une div et ajouter la classe btn-group à la div:

Exemple : 

<div class="btn-group ">

    <button type="button" class="btn-primary "> Button1 </button>
    <button type="button" class="btn-primary "> Button2 </button>
    <button type="button" class="btn-primary "> Button3 </button>

</div>

pour les mettres verticalement il suffit de remplacer la class de la div par btn-group-vertical


Updates Bootstrap 4:

 La classe .btn-default a été remplacée par la classe .btn-secondary  Il n’y a plus de classe .btn-xs car il y a la classe .btn-sm qui est proportionnellement bien plus petite qu’avec la version 3

Les images :

plusieurs classes permettent de personnalisé un peu les images

img-rounded permet d'arrondir un peu les bords de l'images 

img-circle m'est l'images dans un cercle

img-thumbnail m'est l'image sous forme de vignette avec un léger bord gris autour de l'image un petit peu arrondi ( intéressante pour faire des galeries photos )

img-responsive permet à l'image de toujours rester visible notamment sur un petit écran en le rapetissant plutôt que de la couper 


Dropdowns ( Listes déroulantes )

On l'insère dans un bouton grâce à la classe css "dropdown-toggle" il est succédé par datatoggle="dropdown"

et enfin pour config du menu il faut ajouter la classe "dropdown-menu" a la liste désordonné "lu"

class="caret" est le logo a qui montre qu'il s'agit d'une liste déroulante
class="divider" permet de mettre un trait au milieu pour difisé les informations de la listes 

class="dropup" pour mettre la liste vers le haut 

Updates Bootstrap 4: 
 Tous les éléments de la liste doivent porter la classe .dropdown-item 

 Plus besoin d’écrire pour afficher la petite flêche, ça se fait automatiquement sur l’élément qui porte la classe .dropdown-toggle  La classe .divider devient .dropdown-divider

Progress Bar ( barres de progression)

Updates Bootstrap 4:
 Les classes .progress-bar-* ont été remplacées par .bg-*. Par exemple class="progress-bar progress-bar-danger" devient class="progress-bar bgdanger"  La classe .active devient .progress-bar-animated

Tooltips :

Permet de mettre des informations lorsque l'on passe la souris sur un bouton par exemple, cela s'effectue avec javascript et JQuery


Modals

Genre de poppups qu'on peut générer sur un bouton ou text 


Navbar (bar de navigation)

il se trouve en général en haut pour faire un menu par exemple 

il commence par un tag <nav> en html

Scrollspy

permet de mettre a jour et sélectionne a quel endroit nos sommes sur la page et l'indique sur le menu

Carousel  

une animation qui permet de mettre des éléments les 1 à la suite des autres , on peut faire ça avec des images ou des textes 