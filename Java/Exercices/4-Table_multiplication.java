/*
Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de 
multiplication de ce nombre, présentée comme suit (cas où l'utilisateur entre le nombre 7):
Table de 7 :
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
…
7 x 10 = 70
*/

/*
Variables N, i: Entier
Debut
    Ecrire "Entrez un nombre : "
    Lire N
    Ecrire "Table de multiplication de N : "
    Pour i ← 1 à 10
    Ecrire N, " x ", i, " = ", N*i
    i Suivant
Fin
*/

import java.util.Scanner; // import de la classe scanner---> dynamique

public class Table_multiplication {
    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);

        int i, n;

        // Fournir les données d'entrée
        System.out.print("Saisir un nombre : ");
        n = clavier.nextInt();
        System.out.println("   ");

        System.out.println("La table de " + n);

        for (i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        // fermer les ressources
        clavier.close();
    }
}