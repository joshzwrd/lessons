/*
Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.
Par exemple,si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.
*/


/*

ALGO NombreDepa

Variables P, N : numérique

DEBUT

  (* P=24, l'affichage sera 25,26,27,28,29,30,31,32,34,35 *)

Ecrire "Entrez un nombre"
  Lire P

  (* initialiser N à 1 *)
  N <- 1
  TantQue N <= 10
    Ecrire P + N
    N <- N+1
  FinTantQue
FIN

*/

import java.util.Scanner; // import de la classe scanner---> dynamique

public class NombreDepa {

  // Methode main = demarre le programmer
  public static void main(String[] args) {

    int P , N ;   // déclaration de deux variables
  
    // demander à l'utilisateur de saisir un nombre entier
    System.out.println("Entrez un nombre : ");
    Scanner Sc = new Scanner(System.in);
    P = Sc.nextInt();

    // initialisation de N avant d'entrer dans la boucle
    N = 1;
    String texte = "";
    while (N <= 10) {
      // System.out.println(P + N); // ECRIRE 
      texte += (P + N) + " " ;
      N++;
    }
    System.out.println(texte);
  }  
}


