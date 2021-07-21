/*
Ecrire un algorithme qui demande un nombre de départ, et qui ensuite écrit la table de multiplication de
ce nombre,présentée comme suit (cas où l'utilisateur entre le nombre 7) :

7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
.....
7 x 12 = 84
*/


/*

ALGO TableMulti

Variables R, i : numérique

DEBUT
    Ecrire "Entrez un nombre"
    Lire R

	POUR i de 1 à 12    PAS = 1
		Ecrire R & "x" & i & "=" & R*i
	FINPOUR
FIN
*/

import java.util.Scanner; // import de la classe scanner---> dynamique

public class TableMulti {

  // Methode main = demarre le programmer
  public static void main(String[] args) {

   	  int R, i ; // déclaration des variables

   	  // demander à l'utilisation d'entrer un nombre entier
	  System.out.println("Entrez un nombre R : ");
	  Scanner Sc = new Scanner(System.in);
	  R = Sc.nextInt();
	  
	  for (i=1 ; i<13 ; i++){
	       System.out.println(R + " x " + i + " = " + (R*i));
	    }  
	}
}

