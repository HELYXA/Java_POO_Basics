import java.util.Scanner;

/**
 * Petit programme de démonstration de l'héritage en Java.
 * L'utilisateur saisit 3 entiers, puis peut trouver le min, le max,
 * ou rechercher une valeur dans le tableau via un menu interactif.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarer un tableau de 3 entiers
        int[] tableau = new int[3];

        // Remplir le tableau avec 3 valeurs saisies par l'utilisateur
        System.out.println("Choisir 3 entiers.");
        for (int i = 0; i < 3; i++) {
            System.out.print("Entrez l'entier " + (i + 1) + ": ");
            tableau[i] = scanner.nextInt();
        }

        // Instancier la classe avancee pour utiliser ses methodes (heritees + propres)
        CaracteristiquesAvancees ca = new CaracteristiquesAvancees();

        // Menu permettant d'effectuer 4 actions : min, max, recherche, sortir
        int choix;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Afficher le min");
            System.out.println("2. Afficher le max");
            System.out.println("3. Faire une recherche");
            System.out.println("4. Sortir");
            System.out.print("Choisissez une option: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Valeur Min: " + ca.trouverMin(tableau));
                    break;
                case 2:
                    System.out.println("Valeur Max: " + ca.trouverMax(tableau));
                    break;
                case 3:
                    System.out.print("Entrez la valeur à rechercher : ");
                    int valeurRecherchee = scanner.nextInt();
                    boolean trouve = ca.rechercherEntier(tableau, valeurRecherchee);
                    System.out.println(valeurRecherchee + (trouve ? " Valeur Trouvée." : " Valeur Non Trouvée."));
                    break;
                case 4:
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Choix incorrect.");
                    break;
            }
        } while (choix != 4);

        scanner.close();
    }
}
