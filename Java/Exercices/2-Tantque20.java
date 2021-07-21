/*
 Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce
 que la réponse convienne. En cas de réponse supérieure à 20, on fera
 apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si
 le nombre est inférieur à 10.
*/

/*

ALGO NombreCo
Variable M : numérique
DEBUT
  M <- 0
  TantQue M < 10 OU M > 20   (* 0 < 10 OU 0 > 20 VRAI OU FAUX = VRAI au moins une des conditions doit être vraies *)  
    Ecrire "Entrez un nombre compris entre 10 et 20"
    Lire M

    Si M  > 20 Alors
      Ecrire "Plus petit !"
    Sinon si M  < 10 Alors
      Ecrire "Plus grand !"
    FinSi
  FinTantQue
  Ecrire "vous avez entré, M "
FIN
*/
import java.util.Scanner; // import de la classe scanner---> dynamique
public class Tantque20 {

  // Methode main = demarre le programmer
  public static void main(String[] args) {
    
    double M = 0;
    while ((M < 10) || (M > 20)) {
      System.out.println("Entrez un nombre compris entre 10 et 20 : ");
      Scanner Sc = new Scanner(System.in);
      M = Sc.nextDouble();
      
      if ((M > 20)) {
        System.out.println(" Plus petit ! ");
      }
        else if ((M < 10)) {
           System.out.println(" Plus grand ! ");
      }
    }
    System.out.println("Vous avez saisi: " + M);
  }
}
