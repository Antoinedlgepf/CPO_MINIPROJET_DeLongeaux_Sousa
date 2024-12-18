/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caill
 */
import java.util.ArrayList;
import java.util.Random;

public class Combinaison {
    private Pion[] elements; // Tableau de pions

    // Constructeur
    public Combinaison(Pion[] elements) {
        this.elements = elements;
    }

    // Génération aléatoire d'une combinaison
    public static Combinaison genererAleatoire(int taille, ArrayList<Character> couleursDisponibles) {
        Pion[] elements = new Pion[taille];
        Random random = new Random();

        for (int i = 0; i < taille; i++) {
            char couleur = couleursDisponibles.get(random.nextInt(couleursDisponibles.size()));
            elements[i] = new Pion(couleur);
        }
        return new Combinaison(elements);
    }

    // Comparaison avec une autre combinaison
    public int[] comparer(Combinaison autre) {
        int noirs = 0; // Bien placés
        int blancs = 0; // Mal placés

        boolean[] utiliseSecrete = new boolean[elements.length];
        boolean[] utiliseProposee = new boolean[elements.length];

        // Étape 1 : Trouver les bien placés
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].getCouleur() == autre.elements[i].getCouleur()) {
                noirs++;
                utiliseSecrete[i] = true;
                utiliseProposee[i] = true;
            }
        }

        // Étape 2 : Trouver les mal placés
        for (int i = 0; i < elements.length; i++) {
            if (!utiliseProposee[i]) {
                for (int j = 0; j < elements.length; j++) {
                    if (!utiliseSecrete[j] && elements[j].getCouleur() == autre.elements[i].getCouleur()) {
                        blancs++;
                        utiliseSecrete[j] = true;
                        break;
                    }
                }
            }
        }

        return new int[]{noirs, blancs};
    }

    // Représentation textuelle de la combinaison
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pion pion : elements) {
            sb.append(pion.toString());
        }
        return sb.toString();
    }
}


