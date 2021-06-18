### Fonctions

## Les Fonctions en JavaScript?

- Une fonction désigne un « sous-programme » qui permet d’effectuer des opérations répétitives.

- Au lieu d’écrire le code complet à chaque fois, on crée une fonction que l’on appellera dès qu’on aura besoin, ce qui peut aussi alléger le code, le rendre plus lisible.

**Syntaxe**

- Les fonctions prennent en général des paramètres et retournent un résultat particulier.

- Les fonctions nous permettent d’assembler une certaine logique que l’on pourra utiliser à plusieurs reprises dans la suite de notre code.

- Exemple :

    function bonjour(nom) {
        return "Bonjour" + nom
    }
    // On appel ensuite notre fonction par son nom
    bonjour('Jean') // Salut Jean

On peut stocker une fonction en JavaScript dans une variable, sans lui donner de nom.

- Exemple :

    var bonjour= function (nom) {
        return "Bonjour" + nom
    }

Une fonction JavaScript qui ne retourne rien renverra la valeur undefined de manière automatique à la fin de son execution.

Lorsqu’on néglige certains paramètres d’une fonction ils prendront aussi la valeur undefined.

## Note Paramètre d’une fonction c’est une variable local à une fonction

- Exemple :
	
    var exemple = function (nom) {
        return "Bonjour" + nom
    }
    exemple() // nom prendra valeur undefined dans la fonction

## Supposons qu’on veut créer un fonction qui prend un nombre en paramètre et qui va se charger de multiplier ce nombre par 5.

- Exemple :
	
    var multiplier = function (nombre){
      return nombre * 5
    }
    multiplier(5)

- Il est possible de rendre un paramètre facultatif dans une fonction et lui assigner une valeur par défaut. Pour faire une telle chose il suffit d’ajouter une petite condition dans votre code.

- Exemple :
	
    var multiplier = function (nombre){
      if (nombre === undefined) {
        nombre = 1
      }
      return nombre * 5
    }
 
    multiplier(5) //cela donne 25
    multiplier() //1

## Les méthodes(Fonction en JavaScript)

On peut aussi stocker une fonction dans une propriété d’un objet.

exemple :
	
    var personne = {
        nom: 'Marc',
        age: 14,
        sexe: function () {
            return 'Masculin'
        }
    }
    personne.sexe() //Masculin

- Une fonction utilisée sur un objet est appéllé méthode. Les méthodes sont utilisés sur les types d’objet natifs du JavaScript comme les chaines de caractères ou les entiers.

Exemple
	
    "ok".toUpperCase() // OK
    "Je suis Jean".split(' ') // ["Je", "suis", "Jean"]
    1.toString() // '1'
    1.1312312312.toFixed(2) // '1.13'