/*
Ecrire un algorithme qui demande à l’utilisateur un nombre compris 
entre 1 et 3 jusqu’à ce que la réponse convienne.
*/

/*
ALGO Tantque3
Variable N : numérique
DEBUT
  N ← 0
  TantQue N < 1 ou N > 3
    Ecrire “Entrez un nombre entre 1 et 3”
    Lire N

    Si N < 1 ou N > 3 Alors
        Ecrire “Saisie erronée”
    FinSi
  FinTantQue
  Ecrire "vous avez entré, N "
FIN
*/

import java.util.Scanner; // import de la classe scanner---> dynamique

public class Tantque3 {

  // Methode main = demarre le programmer
  public static void main(String[] args) {
    
    double N = 0;
    while ((N< 1) || (N> 3)) {
      System.out.println("Entrez un nombre compris entre 1 et 3 : ");
      Scanner Sc = new Scanner(System.in);
      N = Sc.nextDouble();
      if ((N<1) ||(N>3)) {
        System.out.println("Saison erronné.");
      }
    }
    System.out.println("Vous avez saisi: " + N);
  }

}
