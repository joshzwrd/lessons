# Les formulaires HTML


**formulaires html ?**

Les formulaires sont les principaux moyens d’interaction entre un utilisateur et un site web ou une application. Ils permettent à l’utilisateur d’envoyer des données au site web qui seront traiter par le serveur.

Un formulaire Html est composé d’un ou plusieurs elements comme par exemple : les cases à cocher, les champs de texte, les boutons etc…..

La déclaration d’un formulaire se fait par la balise form et dans cette balise on precise les attributs comme par exemple: **name, method, action** etc….

Un formulaire est un element important pour un site web lorsqu’on veux avoir les avis des différentes utilisateurs de votre site. Si vous voulez un système de quiz pour vote site on aura besoin de formulaire. C’est un element qu’il ne faut pa négliger.
	
    <form name="formulaire" action="" method="post">
    </form>

L’attribut **name** : Pour attribuer un nom au formulaire

L’attribut **action** : Contient le nom de la page contenant le script qui va se charger de traiter les données provenant du formulaire. Une page php par exemple.

## Méthode GET ou POST ?(formulaires html)

Les données du formulaire peuvent envoyées de deux façons différentes en GET ou en POST

- En GET, les données du formulaire seront transmises via l’URL de la page.
- En POST, les données du formulaire seront transmises via l’entête de la page WEB. 

Les différents elements d’un formulaire doivent être placer a l’intérieur du formulaire.

Si on veut intégrer par exemple un champs de texte dans uns formulaire vous avez besoin sans doute la balise input.
	
    <input type="text" name="" id="">

## La Balise input

Une balise **input** permet de saisir du texte sur une seule ligne comme par exemple: un nom, un prénom ou un login etc…. Mais tout les balise input ne fait pas reference seulement au texte, il peut être un champs **password**, **file** ou un **bouton** etc. C’est l’attribut **type** qui va se charger de faire la difference.

L’attribut **type**: Une chaîne de caractère qui indique le type de champs représenté par l’élément <input>

**L’attribut type d’un input peut être:**

- **password :** Qui permet d’avoir un champs mot de passe avec des caractères masqués.

- **text :** Pour avoir un champs de texte normal

- **submit :** Pour la soumission d’un formulaire

- **file :** Pour la création d’un champs qui permet de charger une image

- **reset :** Pour vider les données saisir d’un formulaire

- **radio :** Créer un bouton radio qu’on peut cocher. Il permet de faire un choix unique

- **checkbox :** Qui permet d’avoir une case qu’on peut cocher ou décocher
    
- **hidden :** Pour avoir un champs masqué, c’est a dire un champs qui ne sera pas visible dan le navigateur
    
- **date :** Qui permet de saisir une date composée d’un jour, d’un mois et d’une année
    
- **number :** un contrôle qui permet de saisir un nombre.
    
- **color :** permet de définir une couleur.
    
- **email :** un champ qui permet de saisir une adresse éléctronique.

Il existe d’autre attribut pour un champs de texte comme name, value.

L’attribut **name** : permet d’identifier un champs de texte le nom doit etre unique.

L’attribut **value** : permet d’initialiser un champs de texte avec une valeur par default. Si le champs est un bouton, alors le texte de l’attribut **value** constitue l’étiquette ou label. C’est le texte visible sur le bouton.

L’attribut **size**: définir le nombre de caractère qu’on peut voir dans un champs de texte.

## La balise textarea (formulaires html)

C’est un grand champs de texte qui permet d’écrire des paragraphes. Texte su plusieurs lignes

Un textarea dispose des attributs suivants:

- rows : définir le nombre de caractères que contient chaque ligne dans le champs. Lorsque le nombre de caractères dépasse, un retour se fait de manière automatique.

- cols: définir la hauteur du champs, cela désigne le nombre de ligne visible dans le champs. Lorsque le texte dépasse le nombre de lignes, une barre de defilement fait son apparition automatiquement.

**Syntaxe :**
	
    <textarea name="" id="" cols="30" rows="10"></textarea>

## La Balise select

La balise select permet de declarer une liste déroulante qu’on peut remplir avec des option.
	
    <select name="" id="">
            <option value=""></option>
    </select>

La balise option dispose d’un attribut booléen selected. Lorsque cet attribut est déclaré, c’est l’option qui le contient qui sera sélectionnée lors du chargement de la page.

**Exemple d’un code pour la création d’un simple formulaire :**

    <form name="formulaire" method="post" action="">
            Sexe<br>
            <input type="radio" name="sexe"> Masculin<br>
            <input type="radio" name="sexe"> feminin <br>
            Nom et prénom<br>
            <input type="text" name="nom" value=""><br>
            Email<br>
            <input type="text" name="email" value=""><br>
            Mot de passe<br>
            <input type="password" name="pass" value=""><br>
            Pays<br>
            <select name="pays">
                <option>France</option>
                <option>USA</option>
                <option>Japon</option>
            </select><br>
            <input type="button" name="soumet" value="Soummision">
    
    </form>