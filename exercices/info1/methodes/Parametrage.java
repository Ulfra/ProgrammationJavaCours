/*
 * Parametrage.java                        23 jan. 2019
 * IUT info1 2018-2019 groupe 3, pas de droits
 */
package info1.methodes;

import org.omg

/**
 * Classe utilitaire.
 * Etude des méthodes en java : paramétrage, convention d'appel...
 * avec compilation séparée et illustration du Test Driven Development.
 * @author info1G3
 */
public class Parametrage {

    /**
     * Minimum de deux entiers selon leur ordre naturel.
     * @param a entier à comparer à b
     * @param b entier à comparer à a
     * @return plus petit de a et b 
     */
    public static int minimum(int a, int b) {
        return a <= b ? a : b;
    }

    /**
     * valeur absolue d'un flottant
     * @param x flottant dont on calcule la valeur absolue
     * @return <ul><li>valeur absolue  de x si x est un nombre</li>
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
     * Permutation de deux variables entières a et b
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2Int(int a, int b) {

        int tempo = a;
        a         = b;
        b         = tempo;
    }

    /**
     * Permutation de deux variables entières a et b
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntegerV0(Integer a, Integer b) {

        Integer tempo = a;
        a             = b;
        b             = tempo;
    }

    /**
     * Permutation de deux variables entières a et b
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntegerV1(Integer a, Integer b) {

        int tempo = a;   // unboxing
        a         = b;
        b         = tempo;
    }

    /**
     * Permutation de deux variables entières a et b
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
    public static void permut2IntegerV2(Integer a, Integer b) {

        int tempo = a;   // unboxing
//#ERR#PRIVATE        a.value   = b.value;
//#ERR#PRIVATE        b.value   = tempo;

        a.intValue() = b.intValue();
        b.intValue() = tempo;
    }

    /**
     * Permutation de deux variables entières a et b
     * @param a à permuter avec b
     * @param b à permuter avec a
     */
     public static void permut2IntModifiable(IntModifiable a, IntModifiable b) {
         
        int tempo = a.getValeur();
	a.setValeur(b.getValeur());
        b.setValeur(tempo);
     }

    
    
}