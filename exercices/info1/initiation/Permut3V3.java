/*
 * Permut3V3.java
 * info1 groupe 3
 */

package info1.initiation;

/**
 * Etude des permutations de r�f�rences d'objets
 * @author info1
 */

public class Permut3V3 {

    /**
     * Initialisation de variables
     * Affichage apr�s permutation circulaire
     * @param args arguments non utilis�s
     */
    public static void main(String[] args) {
    
        // variables � permuter
        String a,
               b,
               c;

        // sauvegarde pour permutation
        String sauve;

        a = "10";
        b = "20";
        c = "30";

        System.out.println("a = " + a + " b = " + b + " c = " + c);
        /* Algorithme de permutation circulaire a -> b -> c -> a (sch�ma en Z) */
// TODO sch�ma m�moire
        sauve = a;
            a = c;
            c = b;
            b = sauve;

        System.out.println("a = " + a + " b = " + b + " c = " + c); 
// TODO sch�ma m�moire
    }
}