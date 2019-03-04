/*
 * IntModifiable.java                      6/2/2019
 * IUT info1 2018-2019
 */
package info1.methodes;

/**
 * Encapsulation d'une valeur primitive int par un objet
 * dont l'�tat (valeur enti�re) est modifiable publiquement.
 * <p>
 * Illustrer les principes de contr�le de l'�tat des objets 
 * depuis un passage de param�tre r�f�rence par valeur.
 * </p>
 */
public class IntModifiable {

    /** la valeur encapsul�e par cet (this) IntModifiable */
    private int valeur;

    /**
     * IntModifiable dont la valeur est d�finie par valeurInit
     * @param valeurInit valeur de cet (this) IntModifiable
     */
    public IntModifiable(int valeurInit) {
        valeur = valeurInit;
    }

    /**
     * @return valeur enti�re encapsul�e par cet objet 
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * Change la valeur encapsul�e par cet objet
     * @param nouvelleValeur nouvel entier valeur de cet objet
     */ 
    public void setValeur(int nouvelleValeur) {
        valeur = nouvelleValeur;
    }

    @Override
    public String toString() {
        return Integer.toString(valeur);
    }
}