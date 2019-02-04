/* 
 * Acceuil.java				4 oct. 2018
 * IUT info1 2018-2019 groupe 3, pas de droit d'auteur
 */

package info1.initiation;

import java.util.Scanner;

/**
 * Acceuil personalis� de l'utilisateur
 * @author jeancharles.luans
 */
public class Acceuil {


    /**
     *Entr�e sur une console texte de l'�tat civil de l'utilisateur
     *pour personnalis� son acceuil
     @param args inutilis�
     */
    public static void main(String[] args) {
        
	final int anneeActuelle;
	anneeActuelle = 2018;
	
        /* Etat civil de l'utilisateur */
        String prenom,       // prenom usuel
               nom,          // nom patronyme
               suite;
        
        int anneeNaissance,  // ann�e de naissance
            age;

        /* Analyseur lexical de l'entr�e texte standar */
        Scanner entree = new Scanner(System.in);
        
        /* Entr�e du prenom */
        System.out.print("Quel est ton prenom ?");
        prenom = entree.next();
	prenom = prenom + entree.nextLine();

        /* Entr�e du nom */
	System.out.print("Quel est ton nom ?");
        nom = entree.next();
	nom = nom + entree.nextLine();
	
	/* Entr�e et calcul de l'age */
	System.out.print("En quelle ann�e es tu n� ?");
	anneeNaissance = entree.nextInt();
        age = anneeActuelle - anneeNaissance;
	
                
        /* Message de bienvenu personnalis�*/
        System.out.println("Bienvenue " + prenom + ' ' + nom + " (" + age + " ans)");

    }
    
}
