# Les tableaux en Java

**Manipuler les tableaux en Java**

Un tableau est une structure de données comportant un certain nombre de valeurs, Il est nommé et indexé. L’index  d’un tableau n’est pas une valeur. C’est juste une position qui commence en générale à zéro qui permet de faire référence à une des valeurs du tableau.


## Utilisation d’un tableau(tableaux en Java)

Un tableau doit être déclaré avant son utilisation. La déclaration d’un tableau en java se fait de deux manières. L’opérateurs [] permet d’indiquer qu’on est entrain de travailler avec les tableaux.

    int tableau [];

    int [] tableau1;

Les tableaux qu’on a déclaré un tableau qui peut contenir que des entiers;

Lorsque les crochets [ ] suit le type, toutes les variables déclarées seront des tableaux, tandis que si les crochets [ ] suit le nom de la variable, seule celle-ci est un tableau :


## Création d’un tableau(tableaux en Java)

Les tableaux se déclarent et instancier comme des classes.

**Exemple :**

    int tableau [] = new int[20];

    int [ ] tableau= new int[10];

On a créé un tableau d’entier de taille 20. C’est a dire on peut stocker 20 éléments dans cet tableau.


## Initialisation d’un tableau(tableaux en Java)

**Initialisation du tableau se fait comme ceci:**

    int tab2 []= {34,9,90,12};

Pour accéder a un élément dans un tableau il suffit d’ajouter l’indice de l’élément entre crochets ([ et ]) à la suite du nom du tableau :

L’indice représente le numéro de la case à laquelle vous voulez accéder


## Taille d’un tableau

On obtient la taille d’un tableau à partir de son attribut length. Il s’agit du nombre maximum d’éléments qu’il peut contenir (nombre de “cases” du tableau) et non du nombre d’éléments qui y sont effectivement stockés.

**Exemple d’un code qui affiche la taille d’un tableau :**

    public class Principale {
        
            public static void main(String[] args) {
                int tab[] = { 34, 9, 90, 12 };
            System.out.println(tab.length);
        }
    }

## Affichage d’un tableau

Apres le remplissage d’un tableau il est bon de le parcourir pour voir ce qu’il contient

On va se servir de la boucle for pour afficher tous les éléments de notre tableau.

**Exemple :**
	
    public class Principale {
    
        public static void main(String[] args) {
            int tab[] = { 34, 9, 90, 12 };
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
            }
        }
    }

Un autre boucle très utile et facile à utiliser c’est le for améliorer

**Example :**

    public class Principale {
    
        public static void main(String[] args) {
            int tab[] = { 34, 9, 90, 12 };
    
            for (int element : tab) {
                System.out.println(element);
            }
    
        }
    }