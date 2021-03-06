# Les Commandes

## L'installation

```bash
sudo apt-get install vim
```

Pour lancer le tutorial **(fortement recommandé)**

```bash
vimtutor
```

ouvrir ou créer un fichier avec vi 

```bash 
vi nom_du_fichier
```

## Le déplacement

Pour se déplacer dans l’éditeur on peut utiliser les flèches ou **`h`**-**`j`**-**`k`**-**`l`**

|  Touche | Direction  |
|---|---|
| h  | aller à gauche  |
| j  | aller en bas |
| k  | aller en haut |
| l  | aller à droite  |


**`0`** et **`$`**: se déplacer en début et fin de ligne

**`0`** = Origine, début
**`$`** = fin

**`w`** = se déplacer de mot en mot


**``Echap *G``** = Raccourci pour se rendre à une ligne précise en remplaçant **``*``** par un nombre

Exemple: **``Echap 28G``** permet de se rendre directement à la ligne 28

Il est important de faire **``Echap``** casi avant chaque action afin de se remettre en mode commande

**``Echap :!``** = lancer une commande externe

**``Echap :q``** = quitter

**``Echap :q!``** = quitter absolument

**``Echap :w``** = enregistrer le fichier

**``Echap :w``** = nom_du_fichier pour faire enregistrer-sous nom_du_fichier

**``Echap :wq``** = enregistrer le fichier et quitter 


## Opérations de bases


### 1. Insertion

**`i`** = insérer | 
**`I`** = insérer début de ligne

**`a`** = insérer aprés le caractére courant | 
**`A`** = insérer à la fin de ligne 

**`o`** = insérer sur une nouvelle ligne en dessous | 
**`O`** = insérer sur une nouvelle ligne au dessus



### 2. Suppresion

**`x`** = effacer des lettres 

**`d:`** effacer des mots, des lignes…

De la même manière, on utilise la touche **`d`** pour supprimer des mots et des lignes.

**`dd`** = supprimer une ligne

Appuyez deux fois sur d (dd) pour supprimer toute la ligne sur laquelle se trouve le curseur.

**`dw`** = supprimer un mot

Placez le curseur sur la première lettre d'un mot. Tapez ensuitedw(delete word) : cela supprime le mot complet !

**`d0`** et **`d$`** : supprimer le début ou la fin de la ligne

**`d0`** = supprimez du curseur jusqu'au début de la ligne.

**`d$`** = supprimez du curseur jusqu'à la fin de la ligne.



### 3. Copier-Coller

**`yy`** = copier une ligne en mémoire 

**`ym`** = copier 1 mot 

**`y$`** = copier du curseur jusqu'à la fin de la ligne

**`p`** = coller

**`*p`** = coller plusieurs fois une phrase en remplaçant **`*`** par un nombre, Exemple **`8p`** pour coller 8 fois

Pour Effectuer un copier coller il faut donc faire **`yy`** puis **`d`** ou **`*d`**



### 4. Interaction

**`u`** = annuler les modifications

**`r`** = remplacer une lettre

**`G`** = sauter à la ligne n°X



## Opérations avancées (split, fusion, recherche…)

**`/`** = rechercher un mot

**`:s`** = rechercher et remplacer du texte

Exemple: **``:s/ancien/nouveau``** remplace la première occurrence de la ligne où se trouve le curseur 

**``:r``** = fusion de fichiers

**`:vsplit`** = permet d'ouvrir un nouvel onglet

Pour changer de fenêtre la même procédure s'applique : **``Ctrl``** + **``w``** + **``w``**

**``:sp``** = permet de découper l'écran horizontalement 
**``:vsp``** = permet de découper l'écran verticalement





