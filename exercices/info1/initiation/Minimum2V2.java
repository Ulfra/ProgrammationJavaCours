/*
 * Minimum2V2.java                          24/10/2018
 * IUT info1 2018-2019 groupe 3, pas de droits ni copyright ni copyleft
 */

package info1.initiation;

/**
 * Etude des structures conditionnelles.
 * Entrées avec gestion des erreurs de saisie, 
 * et calcul de minimum
 * @author info1 groupe 3
 */

public class Minimum2V2 {

    /**
     * Entrée de deux entiers avec gestion des erreurs sur console texte.
     * Calcul et affichage du minimum des nombres entrés.
     * @param args arguments non utilisés
     */
    public static void main(String[] args) {
    
        /* nombres à entrer et comparer */
        int a;
        int b;

        /* minimum des nombres */
        int minimum;

        /* Analyseur de l'entrée texte */

        /* Entée des nombres et gestion des erreurs */
        a = -20;  // Bouchon (stub)
        b = 10;

        /* Comparaison des nombres */
        System.out.print("min(" + a + ", " + b + ") = ");
        /* calcul du minimum des deux valeurs */
        if (a <= b) {
           System.out.println(a);
        } else {
           System.out.println(b);
        }
    }
}