/*
 * Permut3V4.java
 * info1 groupe 3
 */

package info1.initiation;

/**
 * Etude des permutations de références d'objets de type "wrappers"
 * @author info1
 */

public class Permut3V4 {

    /**
     * Initialisation de variables
     * Affichage après permutation circulaire
     * @param args arguments non utilisés
     */
    public static void main(String[] args) {
    
        // variables à permuter
        Integer a,
                b,
                c;

        // sauvegarde pour permutation
//        Integer sauve;
// Attention : CHANGEMENT !!!
        int sauve;

        a = 10;  // auto-boxing <=> a = new Integer(10)
        b = 20;
        c = 30;

        System.out.println("a = " + a + " b = " + b + " c = " + c);
        /* Algorithme de permutation circulaire a -> b -> c -> a (schéma en Z) */
// TODO schéma mémoire
        sauve = a;    // unboxing
            a = c;
            c = b;
            b = sauve;

        System.out.println("a = " + a + " b = " + b + " c = " + c); 
// TODO schéma mémoire
    }
}