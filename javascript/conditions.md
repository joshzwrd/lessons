# Conditions


## Les conditions en JavaScript

- Les conditions permet de tester une expression et d’exécuter une ou plusieurs instruction. L’expression est basé sur une logique booléenne qui peut être soit vraie ou soit fausse. Si l’expression est vrai l’instruction sera exécutée si elle est fausse l’instruction sera ignore

Pour écrire les condition en JavaScript on procède de la manière suivant:

```js
if (expression) {
    //instruction a executer
}
```	
Supposons qu’on veut afficher la catégorie d’une personne à un utilisateur en fonction de son age en s’assurant que la Variable age est déclarée.
```js
var age = 18
if (age == 18) {
    "Il est Majeur!"
}
```	
Maintenant on veut afficher un autre message  à l’utilisateur dans le cas ou l’age de la personne n’est pas égale  à 18. C’est-a-dire l’expression est fausse.
```js	
var age = 20
if (age == 18 ) {
    "Il est Majeur!"
} else {
    "Il n'est pas Majeur!"
}
```	
Il existe ce qu’on appel les conditions multiples dans les cas plus complexes. Par exemple si on souhaite afficher la catégorie d’une personne pour chaque tranche d’âge.

```js			
    var age = 18
    if (age == 18) {
        "Il est Majeur!"
    } else if (age > 18) {
        "Il est Adulte!"
    } else {
       "Il est mineur!"
    }
```	
## Opérateur de comparaison(Les condition en JavaScript)

Lorsqu’on souhaite faire les conditions en JavaScript ou tester la valeur d’une variable, on utilise ce qu’on appel les opérateurs de comparaison.
```js	
    a == b // a égale à b
    a === b // a == b et a est de même "type" que b
    a >= b // a supérieur OU égal à b
    a > b   // a strictement supérieur à b
    a <= b // a inférieur OU égal à b
    a < b   // a strictement inférieur à b
```	
Parfois on veut combiner les condition pour trouver un résultat, par exemple : on veut accepter seulement les filles qui ont 20 ans dans un restaurant. Cela nécessite l’utilisation des opérateurs booléens.
```js	
var age = 18
var sexe = 'F'
if (age == 18 && sexe == 'F') {
    "Vous avez accès!"
} else if (age > 18) {
    "Accès refuse!"
} 
```	
## Quelques opérateurs booléens
```md
    // || OU
    true || true // true
    true || false // true
    false || true // true
    false || false // false

    // && ET
    true && true // true
    true && false // false
    false && true // false
    false && false // false

    // ! NON
    !true # false
    !false # true
```	
## Le switch / case (Les conditions en JavaScript)

Le switch case permet d’effectuer une opération en fonction de la valeur de l’expression en paramètre. Elle peut dans certains cas remplacer une série de if et else .On l’utilise lorsque les cas à gérer sont nombreux.

```js	
switch (expression) {
    case valeur1:
    //Instruction a executer si le résultat de 
        //l'expression correspond a la valeur1
    break
    case valeur2:
        //Instruction a executer si le résultat de 
        //l'expression correspond a la valeur2
    break
    default:
    //Instruction par défaut si les valeur necorrespond pas l'exp
    break
}
```


Exemple d’un petit calendrier qui va afficher un moi si la valeur d’une case correspond a la valeur de la variable moi passée en paramètre.

```js	
var mois = 2

        switch (mois) {
            case 1:
                "Janvier"
                break
            case 2:
                "Fevrier"
                break
            default:
                "Ce Mois n'existe pas"
                break
        }
```


## Le ternaire

Le ternaire **(opérateur conditionnel)** permet de rendre les conditions plus simples utiliser
	
    // condition ? <instruction a executer si vrai> : <instruction a executer si faux>
    sexe= 'M'
    "Je suis " + (sexe == 'M'? "Homme" : "Femme")