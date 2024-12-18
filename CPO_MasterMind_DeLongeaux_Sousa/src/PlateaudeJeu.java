/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caill
 */
import java.util.ArrayList;

public class PlateaudeJeu {
    Combinaison combinaisonSecrete;
    ArrayList<Combinaison> tentatives;
    ArrayList<String> reponses;
    int nbToursMax;

    // Constructeur
    public PlateaudeJeu(Combinaison combinaisonSecrete, int nbToursMax) {
        this.combinaisonSecrete = combinaisonSecrete;
        this.tentatives = new ArrayList<>();
        this.reponses = new ArrayList<>();
        this.nbToursMax = nbToursMax;
    }

    // Ajouter une tentative et générer les indices
    public void proposerCombinaison(Combinaison tentative) {
        tentatives.add(tentative);
        int[] indices = combinaisonSecrete.comparer(tentative);
        reponses.add(indices[0] + " noirs, " + indices[1] + " blancs");
    }

    // Afficher l'état du plateau
    public void afficherPlateau() {
        for (int i = 0; i < tentatives.size(); i++) {
            System.out.println("Tentative " + (i + 1) + ": " + tentatives.get(i) + " -> " + reponses.get(i));
        }
    }

    // Vérifier victoire
    public boolean estVictoire() {
        if (!tentatives.isEmpty()) {
            int[] dernierResultat = combinaisonSecrete.comparer(tentatives.get(tentatives.size() - 1));
            return dernierResultat[0] == combinaisonSecrete.toString().length();
        }
        return false;
    }

    // Vérifier défaite
    public boolean estDefaite() {
        return tentatives.size() >= nbToursMax;
    }
}
