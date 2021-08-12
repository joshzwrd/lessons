# Tableaux 

## Les tableaux en JavaScript

Les tableaux permettent de stocker une liste d’information. Et dans cette liste on peut mettre n’importe quel autre type de variable. A l’intérieur d’un tableau on peut même stocker un autre tableau.
	
    var employe = ['Jacques', 'Herard', 'Pierre']
    var test= [true, 34, 'Melo']

Pour récupérer un élément dans un tableau on utilise cette notation [ i ]dans le cas où i est le nombre représentant l’index de l’élément qu’on veut récupérer dans le tableau (cet index commence toujours par 0). Dans le cas oùl’index n’existe pas cela s’affiche le message undefined.
	
    employe[0] // Jacques
    employe[2] // Jacques
    employe[8] // undefined


## Les objets (Les tableaux en JavaScript)

Les objets se sont des types qui nous permettent de stocker des informations plus complexes qu’une simple liste de données. Supposons qu’on veux stocker le nom, age et les notes d’un élève dans un tableau. On peut le faire de la manière suivant, mais il existe d’autre moyen de le faire.

    var eleve= ['Jacques', 22, 12,34, 20]

Pour cet exemple ce sera un peu difficile de différencier l’age et les notes de l’élève. Pour cela on a la possibilité de créer ce qu’on appelle des tableaux associatifs. Un tableau associatif permet tout simplement de définir une clef (propriétés) pour chaque valeur.

```js
var eleve = {
    nom: 'Jacques',
    age: 22,
    notes: [12, 34, 20] 
}
```

Les clefs sont appellés des propriétés dans un objet. Pour récupérer une valeur associée à une clef (propriété) on utilise le nom de l’objet suivit d’un point (.) suivit du nom de la clefs (propriété) comme ceci:
```js	
    eleve.nom // Jacques
    eleve.notes //Pour afficher les notes
    eleve.notes[1] // 34
```
On peut aussi utiliser une notation proche de celle des tableaux
```js	
    eleve['notes'] // Affiche le notes
```
Les objets peuvent contenir aussi des objets.
```js	
    var eleve = {
        notes: {
            histoire: 20,
            math: 14   
        }   
    }
```
Pour récupérer la note d’histoire de l’élève on peut alors faire comme ceci:
```js	
    eleve.notes.histoire// 20
    eleves.nom // undefined
```
## Types spéciaux
```js
    undefined // quand on essaie d'accéder qui n'est pas definir
    null // 
    NaN // 'not a number'
```