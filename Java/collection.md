Les collections en Java


Les collections en java se sont des objets qui permettent de regrouper et gérer plusieurs objets. Les classes de collections sont organisées en trois grandes catégories

    List : Collection des éléments ordonnées qui accepte les doublons.
    Set : Collection des éléments non ordonner qui n’accepte pas les doublons.
    Map : Collection sous forme d’association

Dans cet tutoriel Nous allons nous intéresser aux listes.
C’est quoi une List (Collections en Java)

List en Java est une interface et est implémentée par ArrayList, LinkedList, Vector et Stack. Elle fournit une collection ordonnée d’objets.
Création d’une List

Pour créer une liste on commence par utiliser le nom de l’interface puis on va donner le nom de la classe utilisé pour stocker les données.




List list = new ArrayList() ;
ArrayList lists= new ArrayList();

Les listes peut être génériques ou non génériques c’est à dire dans un ArrayList on peut spécifier quel type de valeurs qu’on va stocker dedans.

L’exemple ci-dessus est non générique, car il peut stocker n’importe quel type de valeurs.
List génériques



List<String> lists= new ArrayList<>();
ArrayList<String> lists= new ArrayList();

List dans laquelle on peut stocker que de String
Ajouter un élément

La classe ArrayList a de nombreuses méthodes très utiles. Par exemple pour ajouter des éléments à la classe ArrayList, on utilise la méthode add();



Exemple :

import java.util.*;
 
public class LesList {
 
    public static void main(String[] args) {
 
        List list1 = new ArrayList<>();
        list1.add(12);
        list1.add(45.5);
        list1.add("Hello");     
        ArrayList<String> lists = new ArrayList();
        lists.add("Orange");
        lists.add("Citron");
        lists.add("Cerise");
 
        System.out.println("Non générique" + list1);
        System.out.println("Générique" + lists);
    }
}
Accès a un élément

Pour accéder à un élément dans un ArrayList, On utilise la méthode get() en référant au numéro d’index .

Pour savoir le nombre d’éléments d’une ArrayList on utilise la méthode size()

    Nb : L’index d’un tableau commence par zéro.
    Le premier élément d’un tableau se trouve à la position zéro

Parcourir une liste

Parcourir les éléments d’une ArrayList avec une boucle for, et utilisez la méthode size() pour specifier combien de fois la boucle doit s’éxécuter


	
import java.util.*;
 
public class LesList {
 
    public static void main(String[] args) {
 
        ArrayList list1 = new ArrayList<>();
        list1.add(12);
        list1.add(45.5);
        list1.add("Hello");
 
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Element n0:" + i + "" + list1.get(i));
        }
    }
}
Modifier un élément

Pour modifier un élément utiliser la méthode set() en référant au numéro d’index.
set(0,"valeur");
On a modifié le premier élément du tableau.