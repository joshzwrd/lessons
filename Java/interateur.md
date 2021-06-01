Utilisation Iterator en java
Itérateur Java

Un Iterator est un objet qu’on peut utilisé pour parcourir des collections, comme ArrayList et HashSet. On l’appelle un «itérateur» car le terme technique pour boucler est«itérer» .

Pour utiliser un itérateur, vous devez l’importer à partir du package java.util.
Obtenir un itérateur

Pour obtenir un Iterator pour n’importe quelle collection on doit utiliser la méthode iterator().


Exemple :

package collections_iterateurs;
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
class Personne {
    String nom;
 
    Personne(String nom) {
        this.nom = nom;
    }
 
    @Override
    public String toString() {
        return nom;
    }
}
 
public class Principale {
 
    public static void main(String[] args) {
 
        Personne p1 = new Personne("Jean");
        Personne p2 = new Personne("Herard");
 
        List<Personne> data = new ArrayList<>();
        data.add(p1);
        data.add(p2);
        //Obtention de l'iterator
        Iterator<Personne> it = data.iterator();
        //affiche le premier element
        System.out.println(it.next());
    }
}

Faire une boucle dans une collection

Pour parcourir une collection, utilisez les méthodes hasNext()et next()de Iterator:


Exemple :
	
while (it.hasNext()) {
            System.out.println(" Pers " + it.next());
        }
 
        for (Personne p : data) {
            System.out.println(" Pers " + p);
        }
    }