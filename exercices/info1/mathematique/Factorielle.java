/*
 * Factorielle.java                            7 jan. 2019
 * IUT info1 2018-2019 groupe 3, pas de droits
 */

package info1.mathematiques;

import java.util.Scanner;

/**
 * Factorielle d'un entier naturel n
 * cad produit des entiers de 1 � n avec 0! = 1! = 1 par convention
 * @author info1G3
 */
public class Factorielle {

    /**
     * Factorielle enti�re d'un entier naturel n (codage long 64 bits)
     * @param n entier naturel dont on veut la factorielle
     * @return <ul><li>n! si calculable en long</li>
     *             <li>0  si n n�gatif ou n! d�passe la capacit� des long</li>
     *         </ul>
     */
    public static long factL(int n) {

        long factorielle;   // le r�sultat

        /* Calcul de la factorielle */
        factorielle = 1L;  // 0! = 1! = 1
	// TODO attention au n n�gatif 

	for (int rang =2; rang <= n; rang++) {
	    factorielle *= rang; // rang! = (rang -1)! *rang 
            // TODO d�tecter le d�passement
        }

        return factorielle;
    }

    /**
     * Factorielle flottante d'un entier naturel n (codage IEEE754 64 bits)
     * @param n entier naturel dont on veut la factorielle
     * @return <ul><li>n! si calculable en double</li>
     *             <li>0  si n n�gatif </li>
     *             <li>Infinity si n! d�passe la capacit� des double</li>
     *         </ul>
     */
    public static double factD(int n) {

        double factorielle;   // le r�sultat

        /* Calcul de la factorielle */
        factorielle = 1.0;  // 0! = 1! = 1
	// TODO attention au n n�gatif

	for (int rang =2; rang <= n; rang++) {
	    factorielle *= rang; // rang! = (rang -1)! *rang 
            // TODO d�tecter le d�passement
        }

        return factorielle;
    }


    /**
     * demande de l'entier naturel dont on veut la factorielle 
     * sur la console texte 
     * puis calcul de la factorielle
     * @param args non utilis�
     */
    public static void main(String[] args) {
    
        int entier;           // entier naturel dont on calcule

        /* Analyseur de l'entree standard */
        Scanner entree = new Scanner(System.in);

        /* Entr�e de l'entier */
        do {
            System.out.print("Entrez un entier naturel : ");
            entier = entree.hasNextInt() ? entree.nextInt() : -1; 
            if (entier < 0) {
                System.out.println("Erreur lors de la saisie veuillez"  
                                   + " entrer un positif tel que 5, 45, 10");
            }
            entree.nextLine(); 
        } while (entier < 0);

        System.out.printf("fact(%d) = %d \n", entier,
                          factL(entier));  // appel de la m�thode factL

        System.out.printf("fact(%d) = %15.14e \n", entier, factD(entier));
        
    }
}