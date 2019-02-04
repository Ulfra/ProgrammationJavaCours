/*
 * Factorielle.java                            7 jan. 2019
 * IUT info1 2018-2019 groupe 3, pas de droits
 */

package info1.mathematiques;

import java.util.Scanner;

/**
 * Factorielle d'un entier naturel n
 * cad produit des entiers de 1 à n avec 0! = 1! = 1 par convention
 * @author info1G3
 */
public class Factorielle {

    /**
     * Factorielle entière d'un entier naturel n (codage long 64 bits)
     * @param n entier naturel dont on veut la factorielle
     * @return <ul><li>n! si calculable en long</li>
     *             <li>0  si n négatif ou n! dépasse la capacité des long</li>
     *         </ul>
     */
    public static long factL(int n) {

        long factorielle;   // le résultat

        /* Calcul de la factorielle */
        factorielle = 1L;  // 0! = 1! = 1
	// TODO attention au n négatif 

	for (int rang =2; rang <= n; rang++) {
	    factorielle *= rang; // rang! = (rang -1)! *rang 
            // TODO détecter le dépassement
        }

        return factorielle;
    }

    /**
     * Factorielle flottante d'un entier naturel n (codage IEEE754 64 bits)
     * @param n entier naturel dont on veut la factorielle
     * @return <ul><li>n! si calculable en double</li>
     *             <li>0  si n négatif </li>
     *             <li>Infinity si n! dépasse la capacité des double</li>
     *         </ul>
     */
    public static double factD(int n) {

        double factorielle;   // le résultat

        /* Calcul de la factorielle */
        factorielle = 1.0;  // 0! = 1! = 1
	// TODO attention au n négatif

	for (int rang =2; rang <= n; rang++) {
	    factorielle *= rang; // rang! = (rang -1)! *rang 
            // TODO détecter le dépassement
        }

        return factorielle;
    }


    /**
     * demande de l'entier naturel dont on veut la factorielle 
     * sur la console texte 
     * puis calcul de la factorielle
     * @param args non utilisé
     */
    public static void main(String[] args) {
    
        int entier;           // entier naturel dont on calcule

        /* Analyseur de l'entree standard */
        Scanner entree = new Scanner(System.in);

        /* Entrée de l'entier */
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
                          factL(entier));  // appel de la méthode factL

        System.out.printf("fact(%d) = %15.14e \n", entier, factD(entier));
        
    }
}