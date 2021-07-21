

/*  
Effectuez une multiplication de 2 entiers positifs en n'utilisant que l'addition, 
d’abord avec TANT QUE, puis avec POUR :
P := A x B <= = = > P := A + A + A + …..+ A, B fois
*/


/*
ALGO Produit_sans_multilier_while
Variables i, A, B, P:  entiers
Debut
    Ecrire "Veuillez entrer les entiers A et B"
    LIRE A et B
    P <- 0
    i <- 0
    TantQue i<B, ECRIRE
        P = P + A
        i <- i + 1
    FinTantQue
Fin
*/

import java.util.Scanner;
public class Produit_sans_multilier_while {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int i, A, B;
        int P = 0;

        // Fournir les données d'entrée
        System.out.print("Saisir le nombre A : ");
        A = Sc.nextInt();
        
        System.out.print("Saisir le nombre B : ");
        B = Sc.nextInt();
      
        i = 0;
        while (i < B) { // condition
            P = P + A;
            System.out.println(P);
            i++; // mise à jour
        }
        System.out.println("La multiplication de " + A + " par " + B + " donne : " + P );

    }
}
