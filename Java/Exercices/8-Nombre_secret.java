
/* Ecrire un algorithme qui demande à l'utilisateur de deviner un nombre secret. 
S'il trouve le nombre en question, on lui précise en combien de coups il a trouvé la réponse. 
S’il abandonne, on divulgue le secret.*/


/*
ALGORITHME Nombre_secret

Var : a, n, t : entiers

DEBUT

        n <- random(1, 100)
        t <- 0
        a = 0
        TANTQUE a <> n
                t <- t + 1
                ECRIRE "Veuillez deviner le nombre secret : "
                Lire a

                Si a > n Alors 
                        ECRIRE "Nombre cherché plus petit que ", n
                Sinon 
                        ECRIRE "Nombre cherché plus grand que ", n
                FINsi
        FINTANTQUE

        ECRIRE "le nombre cherché est:" ,n, " trouvé en ", t, " tentatives"
*/

import java.lang.Math;
import java.util.Scanner;
public class Nombre_secret {
        public static void main(String[] args) {
                // le nombre d'essais permi
                int a = 0; // Le nombre entré par le joueur
                int n = (int)(1+100*Math.random()); // Nombre généré aléatoirement par l'ordinateur
                int t = 0; // Nombre de tentatives
                boolean sortie = true;
                // System.out.println("le nombre généré est :" + n);
                while (a!= n){
                        t = t+1;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Veuillez deviner le nombre secret :" );
                        a = sc.nextInt();
                        if(a>n){
                                System.out.println("le nombre cherché doit être plus petit que " +a);
                        }
                        else if (a<n){
                                System.out.println("le nombre cherché doit être plus grand que " +a);
                        } 
                        else{
                                sortie = false;
                                break;
                        }
                               
                        // si l'utilisateur veut sortir prématurement
                        System.out.println("Voulez vous sortir Y/N :" );

                        Scanner sc1 = new Scanner(System.in);
                        String Reponse = sc1.nextLine();
                        
                        if (Reponse.equals("YES")){     // tester si dans l'objet Reponse de type String on a stocké "YES" 
                                sortie = true;
                               //  System.out.println("On va sortir");
                                break;
                        }
                        else {
                                sortie = false;
                        }                
                }

                if (sortie == true) {
                        System.out.println("désolé, vous êtes un fainéant , le nombre était: " + n + " et vous avez effectué " + t +" tentatives");
                }
                else{
                        System.out.println("Bravo, vous avez trouvé " + n + " en " + t + " tentatives");
                }
        }
}

