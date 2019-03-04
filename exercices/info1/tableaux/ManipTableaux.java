/*
 * ManipTableaux.java                    9 jan. 2019
 * IUT info1 2018-2019 groupe 3, pas de droits
 */
package info1.outils;

import java.util.Scanner;
import info1.methodes.Parametrage;

/**
 * Utilitaires de manipulations de tableaux de flottants double précision
 * permettant de réaliser différentes opérations : Entrées/Sorties, calcul de statistiques, 
 * recherches et tris.
 * @author info1G3
 */
public class ManipTableaux {

     /**
      * Conversion du contenu d'un tableau de flottants
      * au format texte [ elt0 elt1 ... eltk ]
      * @param aConvertir référence du tableau à convertir en texte
      * @return texte représentant le contenu du tableau
      */
     public static String enTexte(double[] aConvertir) {

         StringBuilder resultat = new StringBuilder("[ ");
         for (double valeur : aConvertir) {   // itération automatique "foreach"
             resultat.append(valeur).append("  ");
	 }
         return resultat.append(']').toString();
     }

     /**
      * Saisie d'un entier sur console texte
      * avec redemande de la valeur si elle est incorrecte
      * @param valMin valeur minimale acceptable
      * @param valMax valeur maximale acceptable
      * @param libelle nom de la donnée à entrer
      * @return valeur correcte saisie
      * @throws IllegalArgumentException si valMin supérieure à valMax
      */
     public static int saisieEntier(int valMin, int valMax, String libelle) 
     throws IllegalArgumentException {

         int aEntrer;  // valeur saisie par l'utilisateur

         /* Analyseur de l'entrée standard */
	 Scanner entree = new Scanner(System.in);

         boolean nok;                    // Vérification de saisie incorrecte

         do {
             System.out.print("Entrez " + libelle + " : ");
             aEntrer = entree.hasNextInt() ? entree.nextInt() : valMin-1;
	     nok = aEntrer < valMin || valMax < aEntrer;
             if (nok) {
                 System.out.println("Erreur, veuillez saisir un entier entre "
                                    + valMin + " et " + valMax);
             }
             entree.nextLine();
         } while (nok);

         return aEntrer; 
     }

     /**
      * Indice de la premiere occurrence de la valeur minimale
      * @param aParcourir tableau dont on cherche le minimum
      * @return <ul>
      * <li> 0 si aParcourir ne contient que des NaN </li>
      * <li> indice de -0.0 si la valeur minimale est 0 (et que 0.0 est rencontré avant)</li>
      * <li> indice de la premiere occurrence du minimum </li>
      * </ul>
      * @throws IllegalArgumentException si aParcourir est vide
      */
     public static int indiceMin(double[] aParcourir) 
     throws IllegalArgumentException {
     
        int indice;  // indice du minimum
	double min;  // minimum du tableau

	if (aParcourir.length == 0) {
	    throw new IllegalArgumentException("Pas de min dans le vide");
	}
        // else : au moins une valeur
	indice = 0;
	min = aParcourir[indice];
	for (int i = 1; i < aParcourir.length; i++) {
	    if (Double.compare(aParcourir[i], min) < 0) {
		indice = i;
		min = aParcourir[indice];
	    }
	}
	return indice;
     }

     /**
      * Indice de la premiere occurrence de la valeur maximale
      * @param aParcourir tableau dont on cherche le maximum
      * @return <ul>
      * <li> 0 si aParcourir ne contient que des NaN </li>
      * <li> indice de 0.0 si la valeur maximale est 0 (et que -0.0 est rencontré avant)</li>
      * <li> indice de la premiere occurrence du maximum </li>
      * </ul>
      * @throws IllegalArgumentException si aParcourir est vide
      */
     public static int indiceMax(double[] aParcourir)
     throws IllegalArgumentException {
	
	return 0; // Stub
     }
     
     /**
      * Moyenne arithmètique du tableau aParcourir
      * @param aParcourir tableau dont on cherche la moyenne
      * @return <ul>
      * <li> NaN si aParcourir ne contient que des NaN </li>
      * <li> la moyenne de aParcourir sans tenir compte des NaN</li>
      * </ul>
      * @throws IllegalArgumentException si aParcourir est vide
      *
      */
     public static double moyenne(double[] aParcourir)
     throws IllegalArgumentException {
 
         return 0; // Stub
     }
     

     /**
      * <ul>
      * <li>Entrée console d'une série de flottants mémorisée dans un tableau</li>
      * <li>Sortie texte d'un tableau au format [ elt0 elt1 ... eltk ]</li>
      * <li>Calcul d'indicateurs statistiques : min, max, moyenne arithmétique</li>
      * <li>Recherches séquentielles</li>
      * </ul>
      * @param args non utilisé
      */
     public static void main(String[] args) {

	 final int TAILLE_MIN = 1;      // Nombres d'éléments minimum et
	 final int TAILLE_MAX = 10;     // maximum du tableau
	 final int IMPOSSIBLE = 0;      // Valeur impossible en cas d'erreur de saisie

	 /* Série de flottants à manipuler */
	 double[] serie;	 
	 int nbElem;			// Taille du tableau
	 int parcours;                  // Indice de parcours

         /* serie vide pour tests */
         double[] serieVide = {};

	 /* Indicateur statistique */
	 double min,                    // Minimum du tableau
	        max,
		moyn;

	 boolean nok;                    // Vérification de saisie incorrecte

	 /* Analyseur de l'entrée externe */
	 Scanner entree = new Scanner(System.in);
         
         /* Entrée console d'une série de flottants mémorisée dans un tableau */
         /* demande de la taille */
         nbElem = saisieEntier(TAILLE_MIN, TAILLE_MAX, "nombre d'elements");
	 
         /* demande des éléments un par un du premier au dernier */
         serie = new double[nbElem];
	 parcours = 0;
	 while (parcours < serie.length) {
             System.out.print("Entrez la valeur N°" + parcours + " : ");
             nok = !entree.hasNextDouble(); 
             if (nok) {
                 System.out.println("Erreur, veuillez saisir un flottant "  
                                    +"(Ex: -12,5)");     
                 /* On redemande le même élément à l'utilisateur */                     
             } else {
                 serie[parcours] = entree.nextDouble();
	         parcours++;     // Demande de l'élément suivant
             }
             entree.nextLine();
	 } 
	 
         /* Sortie texte d'un tableau au format [ elt0 elt1 ... eltk ] */
         System.out.println("serie :\n " + enTexte(serie));

         /* Calcul d'indicateurs statistiques : min, max, moyenne arithmétique */
         min = serie[indiceMin(serie)];
         max = serie[indiceMax(serie)];
         moyn = moyenne(serie);

         System.out.println("Min = " + min + ", Max = " + max + " et Moyenne = " + moyn);

//#types tableaux incompatibles#         Parametrage.permut2Cases(serie, 0, 1);
     }
}