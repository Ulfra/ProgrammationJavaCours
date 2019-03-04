/*
 * TestsManipTableau.java			04/03/2019
 * Pas de copyright
 */
package info1.tableaux.tests;

import info1.tableaux.ManipTableau;

/**
 * Test Unitaire des outils statiques et tris de info1.tableaux.ManipTableau.java
 * @author Jean-Charles Luans
 */
public class TestsManipTableau {

    /** 
     *Test de indiceMinimum
     */
    public static void testsIndiceMin() {
    
        double[] jeu0 = {};
        double[] jeu1 = {Double.NaN};
        double[] jeu2 = {12, Double.NaN, 3.2};
        double[] jeu3 = {-0.0, 0.0, Double.NaN};
        double[] jeu4 = {1, 2.4, -7};
        double[] jeu5 = {Double.NaN, Double.NaN, Double.NaN};
    
        if (ManipTableau.indiceMin(jeu1) == 0) {
            System.out.println("Succés de jeu 1");
        } else {
            System.out.println("Echec de jeu 1");
        }
    }

} 