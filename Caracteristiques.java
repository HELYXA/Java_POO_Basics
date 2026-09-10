/**
 * Classe parente : fournit les operations de base sur un tableau d'entiers.
 */
public class Caracteristiques {

    /** Cherche le plus petit element du tableau. */
    public int trouverMin(int[] tableau) {
        int min = tableau[0];
        for (int num : tableau) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /** Cherche le plus grand element du tableau. */
    public int trouverMax(int[] tableau) {
        int max = tableau[0];
        for (int num : tableau) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
