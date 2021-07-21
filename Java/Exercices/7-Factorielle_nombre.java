
/*
Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle.
NB : la factorielle de 8, notée 8!, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8
*/


/*
ALGO FActorielle
Variables N, i : entier
F : réel
DEBUT
    ECRIRE ("Veuillez entrer un nombre : ")
    LIRE N
    Si N > 0 Alors
        F <- 1
        Pour i <- 1 à N pas 1 faire 
            F <--F * i
        FinPour
        Ecrire (" La Factorielle est : " F)
    Sinonsi N = 0 alors
            ECRIRE (" La Factorielle est : 1")
    FINSI

*/


import java.util.Scanner;
import java.lang.Math;

public class Factorielle_nombre {
    public static void main(String[] variables) {
        Scanner clavier = new Scanner(System.in);

        int i, N;
        int F = 1;

        // Fournir les données d'entrée
        System.out.print("Veuillez entrer un nombre : ");
        N = clavier.nextInt();

        if (N > 0){
            // Exécutez la boucle de 1 à N 
            for (i = 1; i <= N; i++) {
                F = F * i;
            }
            System.out.println(" La Factorielle est : " + F);
        }
        else if (N ==0) {
                System.out.println(" La Factorielle est : 1" );
        }
    }
}