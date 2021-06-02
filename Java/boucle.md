Les boucles en java


Boucle (instruction de repetition) permet d’exécuter plusieurs fois un mème bloc d’instruction. La repetition s’effectue tant que la valeur de l’expression booléenne est vraie.

Il existe deux types de boucles : la boucle while et la boucle for

La boucle while (tan que en français)

La syntaxe de la boucle tant que est simple. Cette boucle permet de controller la repetition de l’exécution d’un bloc. Elle exécute une instruction tant qu’une condition est vérifiée.

Syntaxe : 

while(condition) {
        //bloc d'instruction à exécuter
    } 

On utilise la boucle tant que lorsque le programme doit effectuer plusieurs fois le mème traitement.



exemple d’une affichage des 5 premiers entiers :
	
public class Boucle {
 
    public static void main(String[] args) {
//initialisation du compteur
        int compteur = 1;
//condition de poursuite
        while (compteur <= 5) {
//instruction à executer
            System.out.println(compteur);
//incremetation du compteur
            compteur++;
        }
    }
}

On initialise le compteur à 1 pour qu’il commence par 1

La boucle for (pour en français)

On utilise la boucle for pour réitérer une exécution un nombre de fois connu a l’avance.

syntaxe :

for (val1; condition ; compteur) {
    //instruction;
}



        La boucle foreach en Java


La boucle foreach (boucle for avancée) est une boucle très pratique en java. On utilise la boucle foreach pour parcourir les tableaux ainsi que les collections d’objets. La boucle foreach lit les elements un par un.

Syntaxe :

for(type variable : tableau){
   .
}

On peut l’interpréter de cette façon: “pour chaque valeur(variable) de ce tableau” on execute une instruction entre les accolades ouvrante et fermante.


Exemple :

package boucles_foreach;
 
public class Principale {
 
    public static void main(String[] args) {
 
        int[] tab = new int[4];
 
        tab[0] = 9;
        tab[2] = 10;
        tab[3] = 56;
        tab[1] = 23;
 
        for (int v : tab) {
            System.out.println(v);
        }
 
    }
 
}