/*
 * Minimum4.java                          24/10/2018
 * IUT info1 2018-2019 groupe 3, pas de droits ni copyright ni copyleft
 */

package info1.initiation;
import java.util.Scanner;

/**
 * Etude des structures conditionnelles.
 * Entrées avec gestion des erreurs de saisie, 
 * et calcul de minimum
 * @author info1 groupe 3
 */
public class Minimum4 {

    /**
     * Entrée de 4 entiers avec gestion des erreurs sur console texte.
     * Calcul et affichage du minimum des nombres entrés.
     * @param args arguments non utilisés
     */
    public static void main(String[] args) {
    
        /* nombres à entrer et comparer */
        int a,
            b,
            c,
	    d;

        /* minimum des nombres */
        int minimum;

        /* Analyseur de l'entrée texte */
	Scanner entree = new Scanner(System.in);

        /* Entrée des nombres et gestion des erreurs */
	System.out.print("saisir 1 premier entier : ");
	if (entree.hasNextInt()) {
	    a = entree.nextInt();
	    entree.nextLine();					// vidage tampon
	
	    System.out.print("saisir 1 deuxieme entier : ");
            if (entree.hasNextInt()) {
		b = entree.nextInt();
		entree.nextLine();

		System.out.print("Veuillez entrer un troisième entier : ");
		if (entree.hasNextInt()) {
		    c = entree.nextInt();
		    entree.nextLine();

		    System.out.print("Veuillez entrer un troisième entier : ");
		    if (entree.hasNextInt()) {
		        d = entree.nextInt();
		        entree.nextLine();

                    /* calcul du minimum des deux valeurs */
                    minimum = a;
		    if (minimum > b){
			minimum = b;
                    }
		    if (minimum > c){
			minimum = c;
                    }

		    if (minimum > d){
			minimum = d;
                    }

		    
                    System.out.println("min(" + a + ", " + b + ", " + c + ", " + d + ") = " + minimum);
		    } else {
			System.out.println("Saisir un nombre entier en base 10 (ex: 15 ou -10)");
		    }
          	} else {
		    System.out.println("Saisir un nombre entier en base 10 (ex: 15 ou -10)");
		}
            } else {
                System.out.println("Saisir un nombre entier en base 10 (ex: 15 ou -10)");
            }
        } else {
	    System.out.println("Saisir un nombre entier en base 10 (ex: 15 ou -10)");
	}
	
    }
}