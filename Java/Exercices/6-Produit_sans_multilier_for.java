/*
Effectuez une multiplication de 2 entiers positifs en n'utilisant que l'addition, 
d’abord avec TANT QUE, puis avec POUR :
P := A x B <= = = > P := A + A + A + …..+ A, B fois
*/


/*
ALGO Produit_sans_multilier_for
Variables i, A, B, P:  entiers

Debut
    Ecrire "Veuillez entrer les entiers A et B"
    LIRE A et B
    P <- 0
    Pour i <- 1 à B Faire
        P = P + A
    Fin Pour
Fin
*/

import java.util.Scanner;
public class Produit_sans_multilier_for{

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);

        int i, A, B;
        int P = 0;

        // Fournir les données d'entrée
        System.out.println("Saisir le nombre A : ");
        A = Sc.nextInt();
        
        System.out.println("Saisir le nombre B : ");
        B = Sc.nextInt();


        for ( i = 0; i < B; i++) {
            P = P + A;
            System.out.println(P);
        }

        System.out.println("La multiplication de " + A + " par " + B + " donne: "+ P );
    }
}
