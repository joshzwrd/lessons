<h1> Variables 


<h2> Pour déclaré une variable

- Var
- Let 
- Const

<h2>Nommer les variables 

- On peut les appeler comme on veut sauf quelque règle a respecter 
Interdit = Espace, "-" , 1variable, "é,è,à"
Autoriser = " _" , variable1, $ 

- Typeof() est un operatueur permet de savoir le type de donnée stocker dans une variable 

<h1>Les chaines de caractères 

- Pour délimiter une chaîne de caractères il faut utiliser (" ") ou (' ')
en cas d'erreur il est possible d'utilisé (\' \') ou  il permet de pouvoir échapper au bug 


<h2> Opérateurs mathématiques


- Dans cette exemple il faut se rendre compte qu'il 2 opérations 
	D'abord le "+" donc ici "a + b"  donc on additionne la valeur de a et b   
	Puis il y a le "=" qui est une opération d'assignation c'est à dire result vaut là valeur de a et b additionné.
	

Dans cette exemple le résultat est 14
parce qu'il y a des priorité en mathématique donc le commence d'abord par "b * c" puis a+(b*c) /
(b*c)+a = result ----  (4*3)+2=  14

La multiplication et la division sont prioritaire par apport à l'addition et la soustraction 

Additionner et concaténer

Dans les exemples précédent le "+" servait à faire une addition c'est à dire "a + b" étant de nombre le résultat était un nombre

Dans le cas ou la valeur de b n'est pas un nombre result va renvoyer une "chaîne de caractère"

le résultat est donc un string c'est à dire "24"
C'est ça qu'on appelle une concaténation.

Autre exemple :

Ici notre variable sert à concaténer des chaines de caractères

le résultat est donc : 

Dans l'exemple suivante :
Une variable va pouvoir convertir là valeur d'une chaîne de caractère pour obtenir un nombre :

Ici le résultat est donc 6  /  Number (b) à permis de convertir la chaîne de caractère en Nombre .

Utiliser des Template Strings


Incrémenter et décrémenter des nombres


Mettre en oeuvre des opérateurs booléens 


Découvrir l'objet ARRAY ou Tableau


Travailler avec des objets 


Boucles et Conditions


Syntaxe conditionnelle 

var age = 43;

if(age >= 18){ 
	console.log(~ à  $(age) ans, vous êtes majeur.~);
}
else{
	console.log(~à  $(age) ans, vous êtes encore mineur ~);
}

dans le cas ou la valeur de age = +18 la console nous renvoie le if dans le cas ou la valeur de age = -18  à 18 la console renvoie else



L’opération ternaire 

simplifie en 3 partie 

// Question ? valeur si vrai : valeur si faux ;

age >= 18 ? console.log(~ à  $(age) ans, vous êtes majeur.~)  :  console.log(~à  $(age) ans, vous êtes encore mineur ~);

Opération de comparaison

=== veut dire strictement il vérifie aussi le type de la variables (Ex : Nombre ou String)
== compare sans le type

! = veut dire l'inverse    // Exemple  console.log ( ! true ) ;  = false

Boucles While / Do While

while = tant que 

var a = 1

while(a < 10){
	a++
	}
	console.log("Boucle terminé !);
Dans cette exemple tant là valeur de a sera inférieur à 10 on va ajouté une valeur.

do{
	a++
	}while (a < 10)
On peut lire ça : Fait un +1 tant que là valeur de a est inférieur a 10

Boucles For

for  en  3 partie ( initialisation (variables de contrôle ; condition à vérifier; script de modification)

For( Let i = 1;  i < 10;  i++){
	console.log(~La valeur de la variable i est $(i).~);
}
console.log("Boucle terminée !");

Dans les 3 cas ci-dessous le résultat est le même 


Les mots clés Continue et Break 

Continue :

For( Let i = 1;  i < 10;  i++){
	if(i  == 5){
		continue;
	}
	console.log(~La valeur de la variable i est $(i).~);
}
console.log("Boucle terminée !");

Continue permet donc de sortir de litteration de la boucle mais va continuer et afficher le reste 

dans la console il va sauter le valeur 5 et enchaîner directement 4-6.... jusqu’à . 

Break :

For( Let i = 1;  i < 10;  i++){
	if(i  == 5){
		break;
	}
	console.log(~La valeur de la variable i est $(i).~);
}
console.log("Boucle terminée !");

Break lui sort directement de la boucle et va afficher directement" Boucle terminée " après voir afficher 4.

Boucle For Each


color in colors : permet de ciblier les elements que contient l'array colors

$colors{color] : permet donc d'aller afficher les éléments index du tableau

color = index dans ce cas là


Les Fonctions 

le principe de la fonction : Définir dans premier temps puis l’exécuter

les fonctions simples 



une variable de type function 


ici le addNumber() permet d'excecuter là fonction


les fonctions peuvent être utilisé plusieurs fois 

Envoyer des données dans une fonction

Retourner les valeurs

Dans l'exemple précédent on défini la fonction, on lui affecté des donner puis on va les chercher pour en faire ce que l'on veut
dans l'exemple il envoi le résultat dans la console.

Exécuter immédiatement une fonction 

 il s'agit enfaîte de la fonction anonyme
une fonction anonyme est une fonction qu'on a pas besoin de  nommé car on va en avoir besoin qu'une seule fois a un moment de notre script.

comme ici ou on créer une fonction avec des données et on va directement avoir le résultat
 en 2 parentaises   /* (la fontion) +  ( ce qu'on veut d'elle) */

Appréhender les fonctions à flèche 


le résultat est le même dans les 2 exemples précédent 

Comprendre la portée des variables 

La variable result a une porté global car elle est déclaré à l'extérieur d'un fonction elle peut donc est lisible et modifiable dans le script entier 


Dans ses 2 exemples  le résultat sera là même 

Maintenant dans le cas ou la variable est directement dans la fonction elle sera visible uniquement à l’intérieur 
alors pour qu'elle puisse fonctionné correctement le console.log " l'action ou événement " dois être précisé à l’intérieur. 


Dans cet exemple le code fonctionne .

Utiliser LET

Let permet de déclarer des variables dont là porté est limité au bloc de code à l’intérieur du quel là variable est déclaré 


dans cette exemple Let est déclare dans le if , si le console.log avait été mis à l’extérieur du if là console aurai renvoyé ERROR 

Utiliser CONST

Une Constante est une variable dont la valeur ne peut jamais changer .
Il faut non seulement les déclarés mais aussi les initialiser (Donner une valeur).

Selon la convention il faut déclaré leurs non en majuscule .

Les Objets de JAVASCRIPT

Découvrez l'objet MATH

permet des travaillez avec les nombres

Math.random = choisir un nombre aléatoire 
Math.floor =  Arrondie au plus bas    Math.floor(4.7);    // returns 4
Math.ceil = Arrondie au plus haut    Math.ceil(4.4);     // returns 5
Math.round = Arrondi en fonction du chiffre après la virgule 
Math.round(4.7);    // returns 5  | Math.round(4.4);    // returns 4

Objet Date

L'objet Date est utilisé pour travailler avec des dates et des heures.

Les objets de date sont créés avec new Date().

Il existe quatre façons d'instancier une date:



var d = new Date();
var d = new Date(milliseconds);
var d = new Date(dateString);
var d = new Date(year, month, day, hours, minutes, seconds, milliseconds);

Revisiter les chaines de caractères

W3Schools JAVASCRIPT STRING

Objet Number

L'objet Number est un peu comme l'objet Math il est natif a JavaScript pas besoin de le créer il suffit de le manipulé.
Il à des propriété et des méthodes, Les méthodes en majuscules sont des constantes .

Documentation Complète sur W3Schools JAVASCRIPT Number Référence 


Objet Array 

Array = Tableau 

Ici Il y a des methodes interrésente comme le .Lengh qui permet de savoir la longueur de l'objet array et jouer avec
ou .push qui permet d'ajouter un élément a notre array  



Documentation Complète sur W3Schools JAVASCRIPT Array Référence 


S'initier a BOM


Les Objet Window & Navigateur

L'objet Window détient des méthodes et des propriétés 

Toutes les propriétés ont leurs propres propriétés et méthodes 

Window.location est une propriété de l'objet window et permet de d’interagir avec L’URL.

Window.Navigator est une propriété de l'objet window et permet de d’interagir avec Navigateur.

Window.document représente la page HTML .  C'est clairement le plus important on va être amener a l'utiliser très souvent 

Il est Tellement important que pour l'utiliser on peut directement noté "document." .


Globalement ceux qui faut retenir de ce chapitre c'est que tout en JavaScript est un Objet
Et qu'il est possible de jouer avec en fonction des paramètres et méthodes des différentes Variables.
Pour avoir la détail des propriétés il faut consulter www.W3School.com 

L’élément DOM

Qu'est ce qu'est le DOM

Document objet modèle

Le DOM est une convention, c'est vraiment l'essentiel pour comprendre le code.
Il permet de manipuler les éléments d'une page web en fonction des parents et enfants .





Les nœuds et Les éléments

Accéder aux éléments du DOM

Exemple 1 :

Ici le Header par le getElementById va chercher uniquement 1 seul élément car chaque ID est unique

Active par getElementsByClassName peut chercher 1 ou plusieurs éléments ayant la classe 'active' 

Et Enfin Links par getElementsByTagName va chercher un élément en fonction de son tag, dans l'exemple il va chercher un lien avec 'a'mais ça aurai pu être un'body' ou un 'h1'

L'exemple 1 a ses limites c'est pour cela que dans l'exemple 2 il y a une alternative .

Exemple 2 :

En allant chercher 'p' avec document. il allait afficher tout les éléments 'p' de la page alors que on à besoin uniquement de celui du footer alors dans ce cas là l'idée est d'utiliser l'objet 'footer' comme base pour aller chercher notre élément comme dans le cas ci-dessus.

Utiliser querySelector et querySelectorAll

Ce sont 2 nouvelles méthodes pour aller chercher nos éléments DOM mais via un Sélecteur à la manière de CSS

et pareil qu'en CSS pour aller chercher un élément enfant de notre sélecteur il faut indiquer le sélecteur puis l'élément enfant

Le querySelectorAllvous sera utile au quand ou vous voulez pointé plusieurs éléments en même temps. 
Pour un Tableau par exemple.

Contrairement à getElement qui renvoie un HTML Collection ici le Sélecteur renvoie une nodeList


https://www.w3schools.com/jsref/met_document_queryselector.asp

Modifier les éléments du DOM

Pour modifier un attribut il faut utiliser là méthode .setAttribute .

Cette méthode à besoin de 2 informations pour fonctionner 
Dans l'exemple précédent :
	Le nom de l'attribut ='Align'
	La valeur de l'attribut = 'Right'

Il y a aussi une 2e méthode pour faire la même action.

Dans les 2 cas le résultat est là même 


Créer de nouveaux élément dans le DOM

Pour Créer un nouvel élément directement de manière programmatif en JavaScript il faut faire appel appel à une méthode de document qui est .createElement()

Dans cette exemple on va ajouter un élément 'a' (lien)
à un tableau



	- D'abord il faut créer l'élément avec .createElement()
	- Ensuite il faut donner un attribut 'href' (vers/direction) à notre élément
	- Ensuite il faut créer un texte sur lequel on pourra venir cliquer pour cela il faut utiliser une autre méthode document.createTextNode() on utilise une autre méthode car le texte est un autre type d'élément
	- Ensuite il faut relié le label notre élément de base donc lui rajouter un enfant avec là méthode .appendChild() pour créer un nœud entre les 2
	- Ensuite il faut créer un élément 'li' pour pouvoir insérer notre objet au tableau 
	- puis insérer notre élément au 'li' pour pouvoir l'afficher dans le tableau
	- Ensuite il faut aller pointé notre tableau 'ul' qui lui existe déjà avec .querySeletor et lui ajouter un enfant.


Donc les méthodes suivantes servent à : 

.createElement : Créer un nouvel élément 

.createTextNode : Créer un nouvel élément texte

.appendChild : Permet créer un nœud entre 2 élément en ajoutant l'élément enfant 

Modifier les styles CSS en Javascript

Dans l'exemple ci-dessous on modifier le fond d'écran de la page 

dans un premier temps il faut pointé l'élément en question qu'il faut modifier puis aller dans la propriété dans laquelle on veut effectuer des modifications ici c'est .style.backgroundImage et lui injecter l'image que l'ont veut pour lui.

Afficher une image aléatoire 

Comprendre JSON

JSON = JavaScript Objet Notation

Le JSON est une chaîne de caractère qui représente , une Array/Tableau D'objet/index.

Cette objet a aussi des méthodes dont celle là qui est très utilisé 
JSON.Parse qui permet enfaîte de reprendre tout les informations JSON et le classer dans un Array

En Effectuant un console.log on obtient


Choisir un élément aléatoire dans un object ARRAY 

Il y a 14 élément dans notre Array noté de 0 à 13 index

Dans cette exemple Math.random() Permet de choisir un nombre aléatoirement, En respectant quoi ? la longueur de images d'ou le images.length sinon il aurai pu choisir aléatoirement mais à "l'infini"

Math.floor permet d'obtenir uniquement le chiffre avant là virgule en arrondissant vers le bas



Et enfin le fait de mettre images[Toutes les informations] permet d'afficher non le numéro de l'index mais bel et bien les informations qu'il y a justement à l’intérieur



Afficher l'image choisie 

Ici on va modifier là propriété de backgroundImage de l'endroit ou on veut insérer notre liste d'image aléatoire .
Et on lui met le lien vers lequel il faut faut aller chercher les images sans oublier notre propriété randomImage qu'on à créer précédemment 

Vider un élément de son contenu 


firstChild est une propriété de l'objet désignant le première de celui-ci
removeChild permet de retiré un enfant à un objet 

Donc le code ci-dessus nous dis :
Tant que notre objet à un première enfant, 
	il faut enlever ce premier enfant.
	
Afficher du contenu à l'écran 

Pour afficher du contenu il faut créer un élément dans lequel on insère des données à afficher

Dans cet exemple on créer un élément 'h1' puis un élément texte (name) que l'on va récupérer de notre Array aléatoire randomImage .
Ensuite on relie cette information à notre élément 'h1' en fessant un nœud puis l'ajoute à notre Variable pictInfo que je rappel supprime son première enfant à chaque fois que l'on recharge là page.

Ceux qui veut dire à chaque chargement de page pictInfo affiche les informations de l'Array randomImage puis le supprime et le remplace à chaque fois.

 C'est exactement le même procéder pour 

Propager le script aux autres pages 

Afin D'éviter le erreur si vous avez à mettre un script aussi complet sur plusieurs page, c'est bien de mettre des conditions 

Dans cet exemple on ajoute le ' if ' afin qu'il n'y ai pas d'erreur si sur une de nos pages il n'y a pas d'élément ou objet pictInfo

Les événement de JavaScript

Comprendre le rôle des événements 



Réagir à des événements

2 manières d'utiliser le Onclick 



pas forcement satisfaisante car elles ont beaucoup de limites et on appel ça du code sale car c'est mélanger le html et le javascript 

Utiliser addEventListener

En français c'est un écouteurs d'événements 

addEventListener à besoin de 3 paramètres pour bien fonctionner :
( 'le nom de l’événement' , la fonction => qui sera exécuté , un booléen " true ou false" en général c'est souvent false)

Notre événement est insérer dans une boucle afin que l'action se fasse a chaque fois cela permet d'ajouter par exemple un 2éme événement à la suite et faire fonctionner les 2 par étapes  ceux que le .onclick tout seul ne peut pas faire

Dans cet exemple au clique une alerte 'Bonjour !' apparaît puis une fois qu'on valide cette alerte une seconde apparaît 'Au Revoir !' Toujours dans le même ordre car c'est une boucle qui recommence à chaque fois 

Inspecter les propriétés des événements 

Même les événements sont des objets 

Dans cet exemple là fonction showSinglePict permet enfaîte d'aller plus loin et de voir les propriétés de l'objet événement et pouvoir le manipuler 

Rappel : Il y a 2 variables du même nom image , ça ne pose pas de problème justement car elles ont été créer avec le mot clé Let et donc là variable est visible uniquement dans le bloc de code dans lequel il est déclaré.

Utiliser l'événement CLICK


Ici grâce a là fonction showSinglePict on va pouvoir manipuler les paramètres 'click' du for 
En allant sélectionner les éléments à manipuler.
Ici on rend un élément invisible, visible avec .Toggle qui permet enfaîte de rendre visible et élément invisible et de rendre invisible un élément visible 

Pour pouvoir exploité l'objet événement dans cet exemple il s'agit de la fonction showSinglePict il faut le nommé d'ou le (e) il est souvent appeler ev ou event 

Employer ONLOAD

' load ' permet d'effectué une action au moment ou l'on charge là page

 Ici on met l'événement sur window car c'est l'objet le plus élevé de là hiérarchie, dans cette exemple là fonction utiliser est une fonction à flèche  

Récupérer les données de l'URL

Etant donner qu'on veut afficher des choses différentes sur une même page en fonction de l'endroit choisi, il faut attribuer un id alors pour la même page en fonction de l'id qui suivra l'url il affichera les demandés

dans cet exemple on va chercher les paramétres de l'url avec là propriété URLSearchParams(window.location.search)

ensuite on met une condition, si l'url de la page contient un id alors on affichera les information de l'id en question sinon renvoyer vers une autre page 

Afficher les galeries de photos

L'utilisation de javascript pour créer les li et remplir à chaque fois qu'on rajoutera une image dans notre json il sera ajouté automatiquement sans avoir besoin de toucher le html

Ici on utilise les classiques de ce qu'on a vu tout au long du chapitre .queryselector pour pointé, .appendChild pour créer les nœuds dom.... 

Utiliser ONSUBMIT et preventDefault()


Submit permet de valider le fait  d'avoir soumis les informations necéssaires
preventDefault() permet d'annuler toutes les actions par défaut de base 

Se servir des timers 


setTimeout Permet d'afficher en différé 

setInterval par contre envoie un quelque chose par interval de temps.

Dans cette exemple il envoie un message toutes les secondes jusqu'à l'infini, pour l’arrêter on a du donc l'a mettre dans une variable et créer une fonction permettant de l’arrêter au bout de 5 secondes  

On préfère l’éviter car elle pose des problème de performance...

Valider les formulaires coté client 

Valider automatiquement les navigateurs

Chaque navigateur peut avoir une validation automatique, elle n'est pas présenter de là même manière mais pour faire appel a elle il y a une méthode.

Pour faire appel à la validation automatique du navigateurs il faut ajouté required à la balise HTML en question.

Remarque : C'est assez puissant mais ça aussi des limites

Désactiver les validations automatique du formulaire 

Il suffit d'ajouter novalidate à la balise form

Valider coté client en JavaScript 

Dans un premier temps il est important d'aller chercher les éléments en question qui se mettront sous formes de NodeList 

ForEach va permettre d’exécuter une fonction pour chacun des éléments stocker dans la variable fields

la méthodes checkValidity retourne soit true soit false

Dans l'exemple ci dessus 

le (!) permet d'inverser le test du if donc le forEach dois être exécuté que losque validateField retourne false. 

Si validateField = true alors le (!) transforme le forEach en false donc le code n'est pas exécuter et valid garde ça valeur initial qui est true.

Si validateField =  false alors le (!) transforme le forEach en true donc la suite du code est exécuter et valid devient false.

e.target.submit(); permet de soumettre l'élément nommé que contient e c'est a dire ici le form

Générer des messages d'erreur

classList.add permet d'ajouter une classe css à un élément exemple changer de couleurs...

validationMessage permet d'afficher le message par défaut que le navigateur aurai mis en cas d'erreur 
prevriosElementSibling permet de sélectionner là balise juste avant celle que l'on veut modifie
et 'beforeend' permet de spécifier que 'on effectuer des modifications juste après ceux qu'il y a déjà dedans.

Permettre plusieurs validations

En cas plusieurs erreur enlevé l'erreur précédent pour mettre un autre à la place. 
cette fonction est à utiliser au moment de là validation.


Utiliser ONFOCUS et ONBLUR 

'focus' permet d’exécuter quelque chose lorsque l'on est sur un champs et 'blur' permet d'exécuter quelque chose lorsque l'on quitte un champ .

Aborder JQuery et les bibliothèques

Parcourir les bibliothèques de Javascript

Bibliothèque JavaScript : 
mootoos ( intermédirere, avancé ), 
Dojo, 
script.aculo.us ( Beaucoup d'effet )
React (Fait par Facebook, intéressant pour les applications web, interface utilisateur)
Angular ( c'est un Framework )
JQuery ( Outils populaire )


Intégrer JQuery à son site


En a ajoutant le lien CDN  dans  le  < head > 
CDN est un serveur qui héberge des scripts
Créer un menu déroulant avec jQuery
