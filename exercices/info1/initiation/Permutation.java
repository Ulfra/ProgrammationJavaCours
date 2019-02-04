/*
 * Permutation.java					17/10/2018
 * IUT info1 2018-2019 groupe 3, pas de droit d'auteur
 */

package info1.initiation;

import java.util.Scanner;

/**
 * Permute deux variables
 * @author Jean-Charles.Luans
 * @version 1.0
 */
public class Permutation {

    /**
     * Affiche deux variables, les permute puis réaffiche les deux variables
     * @param args non utilisé
     */
    public static void main(String[] args) {
 
         /* Création de l'obj Scanner */
         Scanner entree = new Scanner(System.in);    
   
        /*Définition des variables */
        int a,
            b,
	    permutation;
	    

        String poubelle;
            
        /*Saisie des variables */
        System.out.print("Saisissez la valeur de A");
        a = entree.nextInt();
	poubelle = entree.nextLine();
	System.out.print("Saisissez la valeur de B");
	b = entree.nextInt(); 
	poubelle = entree.nextLine();

	/*Permutation*/
	permutation = a;
        a = b;
        b = permutation;

        /* Affichage des resultat */
        System.out.print("La valeur de A est " + a + " et la valeur de B est " + b);
    }
     
}
 