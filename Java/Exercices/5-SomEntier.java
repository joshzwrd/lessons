/*
Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu’à ce
nombre. Par exemple, si l’on entre 5, le programme doit calculer :
1 + 2 + 3 + 4 + 5 = 15
NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.
*/


/*

ALGO SomEntier

Variable M, i, S : numérique (*on déclare 3 variables *)

DEBUT
  Ecrire "Entrez un nombre"
  Lire M

  (*initialisation de la somme S *)

  S<-0

  Pour i <- 1 à M

    (*calculons la somme S *)

    S<- S + i 

  FINPOUR

  (*affichons les resusltats*) 
  Ecrire "La somme des entiers est:", S

FIN


*/

import java.util.Scanner; // import de la classe scanner---> dynamique

public class SomEntier {

  // Methode main = demarre le programmer
  public static void main(String[] args) {

   int M, i, S ; // déclaration des variables

   // demander à l'utilisation d'entrer un nombre entier
    System.out.println("Entrez un nombre M : ");
    Scanner Sc = new Scanner(System.in);
    M = Sc.nextInt();
    
    // initialisation de S
    S = 0;

    for ( i=1; i <= M; i++){                   //init, condition, incrémentation
      //calcul de la somme
      S = S + i;
    }
    //afficher les resultats
    System.out.println("la somme des entiers est:" + S);
  }  
}


