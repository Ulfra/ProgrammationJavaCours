/*
 * SuiteReelle.java                17/12/2018
 * IUT info1 Groupe TP5, pas de droits
 */

package info1.tableaux;

import java.util.Scanner;

/* Etudier la saisie de tableau
 * @authorJean-Charles Luans
 */

public class SuiteReelle {

    /* Entré dans la console un nombre inferieur a 30 qui serra le nombre de
     * double saisie. Creer un tableau de la taile choisie. Rentrer la suite
     * de nombre puis l'afficher.
     * @param args non utilisé
     */
    public static void main(String[] args) {

        final int TAILLE_MIN = 1;
        final int TAILLE_MAX = 30;
        final int IMPOSSIBLE = 0;
    
        int taille,     // Taille du tableau
            indice;     // Position dans le tableau

        double[] suite; // Va contenir la suite de double entré

        boolean ok;     // Validateur de saisie

        taille = 0;

        /* Objet d'analyse lexicale */
        Scanner entree = new Scanner(System.in);
          
        /* Saisie de la taille de la suite */
        do {
            System.out.print("Saisissez une taille compris entre 1 et 30 : ");
            taille = entree.hasNextInt() ? entree.nextInt() : IMPOSSIBLE;
            ok = TAILLE_MIN <= taille && taille <= TAILLE_MAX;

            if(!ok) {
                System.out.println("Veuillez rentrez une valeur entre 1 et 30");
                entree.nextLine();
            }
        }while (!ok);

        /* instanciation du tableau suite */
        suite = new double[taille];

        /* Entrée des éléments de la suite */
        indice = 0;
        while(indice < taille) {
             do {
                 System.out.print("Saisissez une valeur a metre dans le tableau");
                 if(entree.hasNextDouble()) {
                     suite[indice] = entree.nextDouble();
                 } else {
                     ok = false;
                     System.out.println("Saisissez une valeur réelle : ");
                 } 
                 entree.nextLine();
             } while(!ok);
             indice ++;
        }

        /* Affichage de la suite entrée */
        indice = 0;
        while(indice < taille) {
            System.out.println(suite[indice]);
            indice ++;
        }
    } 
}