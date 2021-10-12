# Commandes Linux


## Les commandes pratiques 

Les 2 commandes indispensable afin de pouvoir se documenter sur linux sont **man** et **help**, Ils permettent d'afficher les pages du manuel système.

Quelle est la différence entre man et help ?

**man :** commande extérieur
**help :** commande interne au bash

Naviguer dans man : 
/ permet de rechercher quelque choses
n permet de descrendre et N remonter

**which :** permet de trouver un chemin

**file :** permet de savoir quel est le type fichier 
    Exemple « file $(which cp) »


**type :** permet de déterminer le type d’une commande (primitive, haché, autre)

**ldd :** permet de voir les librairies dynamique lier a cp 

**whereis :** permet de retrouver des fichiers d’un certains nom 

Exemple : whereis passwd 

**whatis :** permet de savoir quoi sert une commande
    Exemple « whatis cp »  
    cp = Copier des fichiers et des répertoires

**apropos :** permet de trouver une commande en fonction de ce qu’on veut faire
    Exemple « apropos renommer » 
    rename.ul 	-Renommer des fichiers

**less :** permet d’afficher un fichier et de le parcourir de haut en bas, il s’utilise comme le man pour naviguer.

### A savoir !!!

Shell = interpréteur de commande 

Toujours faire la distinction entre l'espace utilisateur et kernel(noyau)

Commande Pour passer en français :
```bash
Sudo apt install manpages-fr
Sudo apt install manpages-fr-extra
Sudo apt install manpages-fr-dev
```
