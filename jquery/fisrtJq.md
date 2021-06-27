# L'essentiel de Jquery

## Les selectors


    $(document).ready(functon(){   // cette ligne veut dire " lorsque ma page (document) est prêt(ready) lancer cette fonction
           
    });


pour selectionner une class c'est avec un "."
pour sélectionner un id c'est avec un "#"

## Events ( les événements )

mouseenter : cacher un élément lorsque l'on passe la souris dessus

mouseleave : pour faire apparaître lorsque l'on passe dessus

hover : cache quand t'es dessus

**Exemple :**

    $(functon(){

           $("#p1)
           
    });

## Effects ( effets)

elles peuvent être utiliser dans les fonctions hide et show mais aussi avec les fade

notamment le temps pour fermer paragraphe , exprimé en string ou chiffre  //  .hide(1000)
on peut y ajouter des callback pour exécuter une action après l'action de l’élément

**Exemple :**

    "$('#p2') .hide(3000, function() {
       "$('#p3') .hide(3000);
    }

Dans cette exemple une fois que le paragraphe 2 se ferme en 3 secondes, le paragraphes se fermera lui aussi à la suite .

    toggle : permet de d’exécuter l'inverse de l’élément si il est visible il va le rendre invisible et à l'inverse il peut le rendre visible si il est invisible

    fadeout : permet de faire disparaître un élément en le floutant

    fadein : ouvre en flottant

    fadeto : il permet de flouter jusqu’à quelque chose dans se cas là il faut lui ajouter une caractéristique de 0.0 a 1.0 sachant qu'à 0 il le floute entièrement donc invisible

    Slideup : fait disparaître vers le haut

    Slidedown : fait apparaître vers le bas

## Animations

se met dans une fonction en utilisant un selector

    $(selector).animate (arg1);  la fonction animate cette fonction prend des arguments
       
arg1 le premier est un objet qui correspond au propriété qu'on veut animé du selector

on peut gerer ici les marges avec left/right , opacity pour la transparence, width pour la taille.....

    width: +=150 veut qu'on ajoute 150 à la valeur initial

il y a 2 facon d'executer tout ca , soit tout d'un coup soit chaque propriété à la suite

**Exemple 1 : Tout d'un coup**

    $("div") .animate( { left: '60px'} , opacity: 0,2, width: '50px', height: '50px  }, 3000 // vitesse // );

**Exemple 2 : A la Suite**

    $("div") .animate( { left: '60px' } , 3000 );
    $("div") .animate( { opacity: 0,2 } , 3000 );
    $("div") .animate( {  width: '50px' } , 3000 );
    $("div") .animate( {height: '50px }, 3000 );

       arg2 correspond a la vitesse
ici la vitesse se fait en ms il suffit de mettre entre 0 et 10000+ sachant que 10000=10sec

       arg3 correspond au callback

les arg2 et 3 sont optionnels

## JQuery et HTML

4 fonction  Text , html , Val et att les 4 fonctions permettent de changer des éléments html


la fonction **append** permet d'ajouter des éléments dans le selector à la suite  

la fonction **prepend** permet d'ajouter des éléments dans le selector mais au rebut

la fonction **after** permet d'ajouter un élément mais a la suite de l’élément selector à l’extérieur

la fonction **before** permet d'ajouter un élément avant le selector à l’extérieur  

la fonction **remove** permet d'enlever des éléments

la fonction **empty** permet d'enlever le contenu d'une div par exemple


## JQuery et CSS

addclass permet d'ajouter une class a un élément

removeclass permet de retirer une class a un élément 

toggleclass permet de mettre et enlever en fonction de si la class y est ou n'y est pas

**Exemple :**

    $(selector) .addclass ("red");
    $(selector) .removeclass ("red") ; 

en utilisant la fonction css on va pouvoir infiltrer les informations du selector et ajouter et modifier les attributs css 

**Exemple :**

    $(selector) .css ({ "color: "red", font-weight: "blod", background: "yellow" );


## Arborescence des éléments 

en ajoutant     ".parent().css à la fonction css on va pouvoir configurer l’élément parent selector

**Exemple :**

    $(selector) .parent().css ({ "font-weight: "blod" );

pour pouvoir modifier le parent et le grand parent il faut ajouter un s au parents()

**Exemple :**

    $(selector) .parents().css ({ "font-weight: "blod" );

pour pouvoir modifier uniquiment le grand parent il faut lui attribuer une class et le faire savoir a parent(special)

**Exemple :**

    $(selector) parents(.special).cs ({ "font-weight: "blod" );

pour modifier l'enfant du selector c'est la même chose mais en utilisant la fonction children.

    find("p") permet de selectionné tout les descendant qui correspond a un paragraphe 

    sibling() est une fonction qui permet de ciblé les frères du selector

    next() permet de ciblé le frère qui viens juste après le selector 

    first() permet de choisir le tout premier élément  du selector

    filter() permet de filtrer et selectionné uniquement les élément qu'on veut il s'aide des class.  filter( #special )

## AJAX

permet de rafraichir une partie de page en allant chercher les informations sur un serveur par exemple 