/*
 * FactorielleV2.java                            7 jan. 2019
 * IUT info1 2018-2019 groupe 3, pas de droits
 */

package info1.mathematiques;

import java.util.Scanner;

/**
 * Factorielle d'un entier naturel n
 * cad produit des entiers de 1 à n avec 0! = 1! = 1 par convention
 * @author info1G3
 */
public class FactorielleV2 {

    /**
     * calcul de la factorielle en long de n
     * @param n
     * @return n! si calculable ou 0 si non calculable
     */
    public static int factL(int n) {
	          
	long factorielle;
        for (int rang = n; rang >= 2; rang--) {
            factorielle *= rang;
        }
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