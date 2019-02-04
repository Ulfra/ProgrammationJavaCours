/*
 * Permut3.java
 * info1 groupe 3
 */

package info1.initiation;

/**
 * Etude des permutations
 * @author info1
 */

public class Permut3 {

    /**
     * Initialisation de variables
     * Affichage après permutation circulaire
     * @param args arguments non utilisés
     */
    public static void main (String[] args) {
    
        // variables à permuter
        int a,
            b,
            c;

        // sauvegarde pour permutation
        int sauv;

        a = 10;
        b = 20;
        c = 30;

        System.out.println("a = " + a + " b = " + b);
        /* Algorithme de permutation circulaire a -> b -> c -> a (schéma en Z) */
        sauv = a;
           a = b;
           b = sauv;

        System.out.println("a = " + a + " b = " + b); 
    }
}