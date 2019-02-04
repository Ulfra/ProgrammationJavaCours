/*
 * Permut2.java
 * info1 groupe 3
 */

package info1.initiation;

/**
 * Etude des permutations
 * @author info1
 */

public class Permut2 {

    /**
     * Initialisation de variables
     * Affichage apr�s permutation
     * @param args arguments non utilis�s
     */
    public static void main (String[] args) {
    
        // variables � permuter
        int a;
        int b;

        // sauvegarde pour permutation
        int sauv;

        a = 10;
        b = 20;

        System.out.println("a = " + a + " b = " + b);
        /* Algorithme de permutation (sch�ma en Z) */
        sauv = a;
           a = b;
           b = sauv;

        System.out.println("a = " + a + " b = " + b); 
    }
}