/* MinimumTableau.java			13/02/2019
 * Pas de copyright
 */

/**
 * Etude des methodes et de la java doc
 * @author Jean-Charles Luans
 */
public class MinimumTableau {

    /**
     * Trouve le minimum d'un tableau
     * @param don't use
     */
    public static void main(String[] args) {

    int test[] = {0,1,2,3}; 
    indiceMinimum(test);
    //TODO afficher la fonction
    }
        
    /**
     * Indices de la premiere valeur minimal d'un tableau de valeur
     * @param serie est le tableau dont on veux le minimum
     * @return 0 si serie ne contiens que des NaN
     * @return de -0.0 si c'est la plus petite valeur (0.0 compris)
     * @return indice de la premiere occurance du minimum
     */
    public static int indiceMinimum(double[] serie) {

         int indice;
        
         for (int i=1; i++; i< serie.length) {
             
	     
             if (Double.compare(serie[i-1], serie[i]) <= 0) {
		indice = i;
             }
         }
         return indice;
    }
}