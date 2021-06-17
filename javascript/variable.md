
<h1>Variable

**Les variable en JavaScript**

Une variable est un espace alloué qui nous permet de stocker des informations de différentes types, de manière temporaire.

Comment Declarer une variable en Javascript?

Pour déclarer une variable en JavaScript on commence par le mot clef **var** suivi du **nom** de la variable. Une variable est constituée de deux parties : son **nom** et sa **valeur**.

**Syntaxe**
	
var age = 12
var nom = 'jean'
var monPrenom = 'Herard'

- Il n’est pas necessaire de préciser les fins de lignes en JavaScript c’est-à-dire de mettre des points virgules (;) à la fin de chaque ligne, mais on peut le faire si vous voulez. Les fins de lignes seront automatiquement détectées par l’interpréteur de JavaScript.

- La valeur et le type d’une variable peuvent être changer au cours de l’exécution du Script.
	
var nom = 'Pierre'
nom = 34

Le type de la variable **nom** devient une chaîne de caractère et sa **valeur** devient **34**.

Le **nom** d’une variable est unique, il permet d’identifier la variable. Le nom d’une variable ne doivent pas contenir de caractères spéciaux .
La **valeur** d’une variable représente le contenu de la variable qui peut être de différentes types.
Type de variable en JavaScript

<h2> Type de variable en JavaScript

- On peut stocker différentes types d’informations dans une variable comme: des entiers (int), des nombre réels (**float** ), des chaîne de caractères (**string** ) ou des booléens (**true or false**).

<h3> Les nombres
	
var nb = -34
var nb1= 3.14
var nb2c = 65

Lorsqu’on on manipule des réels, pour marquer la partie décimale on utilise un point.
Les chaines de caractère

<h3> Les chaines de caractère

- On utilise les chaines de caractères pour stocker des mots ou des phrases. Pour indiquer a l’interpréteur qu’on est entrain de travailler avec une chaîne de caractères, on entoure le text par des guillemets simples ‘ ‘ ou des guillemets doubles” “.

	
var nom = "Jean herard"
var phrase = 'bonjour comment ca va?'

- Si votre chaîne de caractère contient des ‘ ou “, il faut les écharper.
	
var chaine1 = "Ceci bon"
var chaine2 = 'C\'est bon aussi'
Les booléens

<h3> Les booléens

- Un booléen est un type de variable à deux états qui nous permet de stocker une information qui peut être vraie (**true** en anglais) ou fausse (**false** en anglais).

var vrai = true
var false = false

<h3> les opérateurs arithmétiques :

* += ou +
* -= ou -
* *= ou *
* /= ou /
* %= ou %
