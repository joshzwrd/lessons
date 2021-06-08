Les tableaux HTML

Tableaux htm: Un tableau html se compose d’une partie d’en-tête représente le titre de chaque colonne et une partie corps représentant les données. Les données d’un tableau html sont représentées sous forme de ligne et de colonne.

La déclaration d’un tableau html se fait par la balise <table></table> qui indique le debut et la fin du tableau.

Les contenus des tableaux html doivent être placer à l’intérieur de la balise <table></table>.

Exemple :

<table> 
//place réservée au contenu du tableau
</table>

Pour insérer du contenu dans un tableau html, on commence chaque ligne de données par la balise <tr></tr>. A l’intérieur de cette balise <tr></tr> on peut y mettre les informations  à partir de la balise <td><td>.

Exemple :

Si on souhaite avoir 3 ligne d’informations dans des tableaux html. On doit declarer 3 fois la balise <tr></tr> en utilisant la balise <td></td> pour chaque cellule d’une ligne d’information comme ceci:

<tr>
    <td>ligne 1</td>
</tr>
<tr>
    <td>ligne 2</td>
</tr>
<tr>
    <td>ligne 3</td>
</tr>

Chaque balise <td></td> représente une cellule d’une ligne dans laquelle on peut mettre du contenu.

Une ligne dans un tableau se compose d’un ensemble de cellules tandis que une cellule est un composant d’une ligne d’un tableau.
En-tête des tableaux html

l’en-tête d’un tableau html est déclaré comme une ligne ,C’est-à-dire une balise <tr></tr> mais  à l’intérieur de cette ligne on ne met pas de <td><td> mais plutôt de <th></th> comme dans l’exemple ci-dessous.

Exemple :

<tr>
    <th>col 1</th>
    <th>col 2</th>
    <th>col 3</th>
    <th>col 4</th>
</tr>

Maintenant on à tout ce qu’il faut, on peut commencer avec la création d’un vrai tableau html, avec une partie en-tête qui va représenter les titres de chaque colonne et une partie représentant nos données.

<table>
    <tr>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Sexe</th>
        <th>Age</th>
    </tr>
    <tr>
        <td>Jean</td>
        <td>Charles</td>
        <td>Masculin</td>
        <td>25 ans</td>
    </tr>
    <tr>
        <td>Jackson</td>
        <td>Louis</td>
        <td>Masculin</td>
        <td>24 ans</td>
    </tr>
    <tr>
        <td>Pierre</td>
        <td>Wesly</td>
        <td>Masculin</td>
        <td>25 ans</td>
    </tr>
    <tr>
        <td>Junia</td>
        <td>Pierre</td>
        <td>feminin</td>
        <td>25 ans</td>
    </tr>
</table>