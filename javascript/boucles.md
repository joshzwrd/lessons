# Les boucles

## Comment utiliser les boucles avec JavaScript ? 

Les boucles (Structure répétitive) permettent de répéter plusieurs fois une ou plusieurs instruction en fonction d’une condition précise. Il existe deux types de boucles en générale: la boucle while et la boucle for.

### La boucle While

La boucle while permet d’exécuter une instruction tant qu’une condition est vérifiée. Si la condition est vérifiée on rentre dans la boucle pour l’exécution de l’instruction. Sinon on sort de la boucle.
	
```js
while (condition) {
    //instruction
}
```
Pour que cette boucle ne se déroule pas de manière infinie, il faut l’utiliser de comme ceci: On declare une variable compteur qui sert  à initialiser la boucle et l’incrémenter  à chaque tour de la boucle.

```js
var i = 0 
while (i < 3) {
    "Je compte " + i
    i = i + 1 // i++ 
}
```
On peut écrire aussi i++ qui permet d’incrémenter la valeur de i  à chaque tour de la boucle.

On peut forcer la sortie de la boucle en utilisant le mot clef **break**

```js
var i = 0 
while (i < 10) {
    "Je compte " + i
    if (i == 5) {
        break
    }
    i++
}
```
## La boucle For(les boucles en javascript)

La boucle for permet d’exécuter un code un certain nombre de fois . On utilise la boucle for lorsqu’on a une idée du nombre de tour que la boucle va faire.

```js
var i = 0 
for (var i = 0; i < 3; i++) {
    "Je compte " + i
}
```
On utilise aussi la boucle for lorsqu’on travaille avec les tableaux, c’est une boucle qui est indispensable quand on manipule les tableaux.

```js
var employe= ['Pierre', 'Herard', 'Jacques']
for (var i = 0; i < employe.length; i++) {
    employe[i] // contient le contenu du tableau
}
```