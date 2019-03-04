/*
 * IntModifiable.java                      6/2/2019
 * IUT info1 2018-2019
 */
package info1.methodes;

/**
 * Encapsulation d'une valeur primitive int par un objet
 * dont l'état (valeur entière) est modifiable publiquement.
 * <p>
 * Illustrer les principes de contrôle de l'état des objets 
 * depuis un passage de paramètre référence par valeur.
 * </p>
 */
public class IntModifiable {

    /** la valeur encapsulée par cet (this) IntModifiable */
    private int valeur;

    /**
     * IntModifiable dont la valeur est définie par valeurInit
     * @param valeurInit valeur de cet (this) IntModifiable
     */
    public IntModifiable(int valeurInit) {
        valeur = valeurInit;
    }

    /**
     * @return valeur entière encapsulée par cet objet 
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * Change la valeur encapsulée par cet objet
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