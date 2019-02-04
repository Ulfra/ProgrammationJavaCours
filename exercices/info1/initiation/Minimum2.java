/*
 * Minimum2.java                          24/10/2018
 * IUT info1 2018-2019 groupe 3, pas de droits ni copyright ni copyleft
 */

package info1.initiation;
import java.util.Scanner;

/**
 * Etude des structures conditionnelles.
 * Entr�es avec gestion des erreurs de saisie, 
 * et calcul de minimum
 * @author info1 groupe 3
 */
public class Minimum2 {

    /**
     * Entr�e de deux entiers avec gestion des erreurs sur console texte.
     * Calcul et affichage du minimum des nombres entr�s.
     * @param args arguments non utilis�s
     */
    public static void main(String[] args) {
    
        /* nombres � entrer et comparer */
        int a;
        int b;

        /* minimum des nombres */
        int minimum;

        /* Analyseur de l'entr�e texte */
	Scanner entree = new Scanner(System.in);

        /* Entr�e des nombres et gestion des erreurs */
	System.out.print("saisir 1 premier entier : ");
	if (entree.hasNextInt()) {
	    a = entree.nextInt();
	    entree.nextLine();					// vidage tampon
	
	    System.out.print("saisir 1 deuxieme entier : ");
            // TODO g�rer l'erreur d'entr�e
	    b = entree.nextInt();

            /* calcul du minimum des deux valeurs */
            if (a <= b) {
                minimum = a; 
            } else {
               minimum = b;
            }
            System.out.println("min(" + a + ", " + b + ") = " + minimum);

        } else {
	    // TODO message d'erreur explicatif
	}
	
    }
}