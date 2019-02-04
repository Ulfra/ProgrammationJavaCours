/* 
 * Acceuil.java				4 oct. 2018
 * IUT info1 2018-2019 groupe 3, pas de droit d'auteur
 */

package info1.initiation;

import java.util.Scanner;

/**
 * Acceuil personalisé de l'utilisateur
 * @author jeancharles.luans
 */
public class Acceuil {


    /**
     *Entrée sur une console texte de l'état civil de l'utilisateur
     *pour personnalisé son acceuil
     @param args inutilisé
     */
    public static void main(String[] args) {
        
	final int anneeActuelle;
	anneeActuelle = 2018;
	
        /* Etat civil de l'utilisateur */
        String prenom,       // prenom usuel
               nom,          // nom patronyme
               suite;
        
        int anneeNaissance,  // année de naissance
            age;

        /* Analyseur lexical de l'entrée texte standar */
        Scanner entree = new Scanner(System.in);
        
        /* Entrée du prenom */
        System.out.print("Quel est ton prenom ?");
        prenom = entree.next();
	prenom = prenom + entree.nextLine();

        /* Entrée du nom */
	System.out.print("Quel est ton nom ?");
        nom = entree.next();
	nom = nom + entree.nextLine();
	
	/* Entrée et calcul de l'age */
	System.out.print("En quelle année es tu né ?");
	anneeNaissance = entree.nextInt();
        age = anneeActuelle - anneeNaissance;
	
                
        /* Message de bienvenu personnalisé*/
        System.out.println("Bienvenue " + prenom + ' ' + nom + " (" + age + " ans)");

    }
    
}
