/*
 * Parametrage.java                         23/01/2019
 * IUT info1 2018-2019 groupe 2, pas de droits
 */
package info1.methodes;

/**
 * Classe utilitaire
 * Etude du passage de paramètre par valeur en java
 * à travers la définition de différentes méthodes
 * @author info1G2
 */
public class Parametrage {

    /**
     * Minimum de deux entiers
     * @param a entier à comparer à b
     * @param b entier à comparer à a
     * @return minimum de a et b selon la relation d'ordre naturelle     
     */
    public static int minimum(int a, int b) {
        return a < b ? a : b;  
    }

    /**
     * Valeur absolue d'un flottant
     * @param x flottant dont on veut la valeur absolue
     * @return <ul><li>valeur absolue de x si x est un nombre</li>
     *             <li>POSITIVE_INFINITY si x infini</li>
     *             <li>NaN si x est NaN</li></ul>
     */
    public static double absolue(double x) {
        if (x < 0.0) {
            x = -x;
        }
        return x;  
    }

    /**
     * Permutation de deux variables entières
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2Int(int a, int b) {

        int tempo = a;
        a         = b;
        b         = tempo;
    }

    /**
     * Permutation de deux variables entières
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntegerV0(Integer a, Integer b) {

        Integer tempo = a;
        a         = b;
        b         = tempo;
    }

    /**
     * Permutation de deux variables entières
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntegerV1(Integer a, Integer b) {

        int tempo = a;
        a         = b;
        b         = tempo;
    }

    /**
     * Permutation de deux variables entières
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntegerV2(Integer a, Integer b) {

        int tempo = a;
//#ERREUR#private#       a.value   = b.value;
//#ERREUR#private#           b.value   = tempo;
    }

    /**
     * Permutation de deux variables entières
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntModifiable(IntModifiable a, IntModifiable b) {

        int tempo = a.getValeur();
        a.setValeur(b.getValeur());
        b.setValeur(tempo);
    }

    
    /**
     * Permutation de deux cases du tableau aPermuter qui sera modifié
     * @param aPermuter tableau contenant les cases à permuter
     * @param indice1 indice de la case à permuter avec la case d'indice indice2
     * @param indice2 indice de la case à permuter avec la case d'indice indice1
     * @throws ArrayIndexOutOfBoundsException si indice1 ou indice2 incorrect
     */
    public static void permut2Cases(int[] aPermuter, int indice1, int indice2) {

        int tempo = aPermuter[indice1];
        aPermuter[indice1] = aPermuter[indice2];
        aPermuter[indice2] = tempo;
    }



}