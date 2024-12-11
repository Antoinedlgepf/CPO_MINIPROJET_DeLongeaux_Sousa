/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caill
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Partie {
    PlateaudeJeu plateau;
    ArrayList<Character> couleursDisponibles;

    // Constructeur
    public Partie(int tailleCombinaison, int nbToursMax, ArrayList<Character> couleursDisponibles) {
        this.couleursDisponibles = couleursDisponibles;
        Combinaison combinaisonSecrete = Combinaison.genererAleatoire(tailleCombinaison, couleursDisponibles);
        this.plateau = new PlateaudeJeu(combinaisonSecrete, nbToursMax);
    }

    // Afficher les règles
    public void afficherRegles() {
        System.out.println("Bienvenue au jeu MasterMind !");
        System.out.println("Devinez la combinaison secrète.");
        System.out.println("Indications :");
        System.out.println("- Noirs : bien placés");
        System.out.println("- Blancs : corrects mais mal placés");
    }

    // Boucle principale du jeu
    public void lancerPartie() {
        afficherRegles();
        Scanner scanner = new Scanner(System.in);

        while (!plateau.estVictoire() && !plateau.estDefaite()) {
            plateau.afficherPlateau();
            System.out.print("Proposez une combinaison (ex: RGBY): ");
            String entree = scanner.nextLine().toUpperCase();

            // Créer une tentative
            Pion[] tentativeElements = new Pion[entree.length()];
            for (int i = 0; i < entree.length(); i++) {
                tentativeElements[i] = new Pion(entree.charAt(i));
            }
            Combinaison tentative = new Combinaison(tentativeElements);

            // Proposer la tentative
            plateau.proposerCombinaison(tentative);
        }

        // Afficher résultat final
        if (plateau.estVictoire()) {
            System.out.println("Bravo ! Vous avez trouvé la combinaison !");
        } else {
            System.out.println("Défaite ! La combinaison secrète était : " + plateau.combinaisonSecrete);
        }
    }
}

