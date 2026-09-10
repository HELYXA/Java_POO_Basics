/**
 * Classe enfant : herite de Caracteristiques (min/max) et ajoute
 * une fonctionnalite de recherche - illustration de l'heritage en Java.
 */
public class CaracteristiquesAvancees extends Caracteristiques {

    /** Recherche une valeur donnee dans le tableau. */
    public boolean rechercherEntier(int[] tableau, int valeur) {
        for (int num : tableau) {
            if (num == valeur) {
                return true;
            }
        }
        return false;
    }
}
