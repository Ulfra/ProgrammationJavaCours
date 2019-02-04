/*
 * Datation.java                          14/11/2018
 * IUT info1 2018-2019 groupe 3, pas de droits ni copyright ni copyleft
 */

package info1.initiation;
import java.util.Scanner;

/**
 * Contrôle d'une combinaison grégorienne
 * pour déterminer si c'est une date valide
 * @author info1 groupe 3
 */
public class Datation {

    /**
     * Entrée de 3 entiers jour, mois, an sur console texte.
     * Contrôler la validité de jour/mois/an
     * @param args arguments non utilisés
     */
    public static void main(String[] args) {

        System.out.println("Etudiant no " + Math.abs(new java.util.Random().nextInt())%28);
    
        /* combinaison jour/mois/an à entrer et vérifier */
        int jour,
            mois,
            an;
 
        /* indicateur de date valide */
        boolean ok,
                dateOk;

        /* Analyseur de l'entrée texte */
	Scanner entree = new Scanner(System.in);

        
        /* Entrée du jour */
        jour = 0;
        do {
            System.out.print("Entrez un numero de jour : ");
            ok = entree.hasNextInt();
            if (ok) {
                jour = entree.nextInt();
            } else {
                System.out.println("Veuillez entrer un jour (entier en base 10, ex = -12)");
            }
            entree.nextLine();
        } while (!ok);

        /* Entrée du mois */
        mois = 0;
        do {
            System.out.print("Entrez un numero de mois : ");
            ok = entree.hasNextInt();
            if (ok) {
                mois = entree.nextInt();
            } else {
                System.out.println("Veuillez entrer un mois (entier en base 10, ex = -12)");
            }
            entree.nextLine();
        } while (!ok);

        /* Entrée de l'annee */
        an = 0;
        do {
            System.out.print("Entrez un numero d'annee : ");
            ok = entree.hasNextInt();
            if (ok) {
                an = entree.nextInt();
            } else {
                System.out.println("Veuillez entrer une annee (entier en base 10, ex = -12)");
            }
            entree.nextLine();
        } while (!ok);

        System.out.println("La combinaison entree est : " + jour + "/" + mois
                            + "/" + an);
    }
}

   