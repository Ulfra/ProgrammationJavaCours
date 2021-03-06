/*
 * TestParametrage.java                        23 jan. 2019
 * IUT info1 2018-2019 groupe 3, pas de droits
 */
package info1.methodes.tests;

import info1.methodes.IntModifiable;
import info1.methodes.Parametrage;

/**
 * Tests unitaires des m�thodes de info1.methodes.Parametrage
 * (en TDD)
 * @author info1G3
 */
public class TestParametrage {

    /**
     * Tests unitaires de Parametrage.minimum(int, int)
     */
    public static void testMinimumIntInt() {
        /* jeux d'essai */
        int[] gauche = { 
           -1, 12345678, 0, Integer.MIN_VALUE, 110, -123456789, Integer.MAX_VALUE
        };
        int[] droite = { 
           10, 12345677, 5, Integer.MIN_VALUE,  99, -123456788, 123456789
        };

        int[] attendu = { 
           -1, 12345677, 0, Integer.MIN_VALUE,  99, -123456789, 123456789
        };

        int echecs; // nombre de tests incorrects

        echecs = 0;
        for (int noJeu = 0; noJeu < droite.length; noJeu++) {
             int calcule = Parametrage.minimum(gauche[noJeu], droite[noJeu]);
             if (calcule != attendu[noJeu]) {
                 echecs++;
                 System.err.printf("Erreur sur minimum(%d, %d) = %d \n", 
                                   gauche[noJeu], droite[noJeu], calcule);
             }
        }
        System.out.println("Bilan de testMinimumIntInt : "
                           + (attendu.length - echecs) + " tests Ok,  "
                           + echecs + " tests incorrects");
    }

    /**
     * Tests unitaires de Parametrage.absolue(double)
     */
    public static void testAbsolueDouble() {

        double jeu = -3.14;
        double calcule;

        System.out.print("abs(" + jeu + ") = ");

        calcule = Parametrage.absolue(jeu);

        System.out.println(calcule);
    }

    /**
     * Tests unitaires de Parametrage.permut2Int(int, int)
     */
    public static void testPermut2Int() {

        int n = 1,
            p = 2;

        Parametrage.permut2Int(-3*n, 4);  // ???

        Parametrage.permut2Int(n, p);

        if (n == 2 && p == 1) {
            System.out.println("Succes de Permut2Int");
        } else {
            System.out.println("Echec de Permut2Int");
        }
    }

    /**
     * Tests unitaires de Parametrage.permut2IntegerV0(Integer, Integer)
     */
    public static void testPermut2IntegerV0() {

        Integer n = 1,
                p = 2;

        Parametrage.permut2IntegerV0(-3*n, 4);   // ????
        Parametrage.permut2IntegerV0(n, p);

        if (n == 2 && p == 1) {
            System.out.println("Succes de Permut2IntegerV0");
        } else {
            System.out.println("Echec de Permut2IntegerV0");
        }
    }

    /**
     * Tests unitaires de Parametrage.permut2IntegerV1(Integer, Integer)
     */
    public static void testPermut2IntegerV1() {

        Integer n = 1,
                p = 2;

        Parametrage.permut2IntegerV1(-3*n, 4);   // ????
        Parametrage.permut2IntegerV1(n, p);

        if (n == 2 && p == 1) {
            System.out.println("Succes de Permut2IntegerV1");
        } else {
            System.out.println("Echec de Permut2IntegerV1");
        }
    }

    /**
     * Tests unitaires de Parametrage.permut2IntModifiable(IntModifiable, IntModifiable)
     */
    public static void testPermut2IntModifiable() {

        IntModifiable n,
                      p;

        n = new IntModifiable(1);
        p = new IntModifiable(2);

        System.out.println("Avant Permut2IntModifiable : n = " + n
                           + " et p = " + p);

        Parametrage.permut2IntModifiable(n, p);

        System.out.println("Apres Permut2IntModifiable : n = " + n
                           + " et p = " + p);

        if (n.getValeur() == 2 && p.getValeur() == 1) {
            System.out.println("Succes de Permut2IntModifiable");
        } else {
            System.out.println("Echec de Permut2IntModifiable");
        }
    }

    /**
     * Test unitaires de Parametrage.permut2Cases(int[], int, int)
     */
    public static void testPermut2Cases() {

        int[] suite = {12, 45, 0, -56, -566};

        Parametrage.permut2Cases(suite, 1, 4);
        
        if (suite[1] == -566 && suite[4] == 45) {
            System.out.println("Succes de Permut2Cases");
        } else {
            System.out.println("Echec de Permut2Cases");
        }

// #test indice incorrect#       Parametrage.permut2Cases(suite, 6, 1);  
    }

    /**
     * Lancer les diff�rentes m�thodes de tests
     */
    public static void main(String[] args) {
        
//        testMinimumIntInt();
        testAbsolueDouble();
        testPermut2Int();
        testPermut2IntegerV0();
        testPermut2IntegerV1();
        testPermut2IntModifiable();
        testPermut2Cases();

    }
}