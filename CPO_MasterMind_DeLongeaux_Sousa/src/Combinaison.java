/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caill
 */
import java.util.ArrayList;

public class Combinaison {
    

public class TestCombinaison {
    public static void main(String[] args) {
        // Création de combinaisons statiques
        Pion[] pions1 = {new Pion('R'), new Pion('B'), new Pion('G'), new Pion('Y')};
        Pion[] pions2 = {new Pion('R'), new Pion('G'), new Pion('B'), new Pion('Y')};

        Combinaison comb1 = new Combinaison(pions1);
        Combinaison comb2 = new Combinaison(pions2);

        System.out.println("Combinaison 1 : " + comb1);
        System.out.println("Combinaison 2 : " + comb2);

        // Test de comparaison
        int[] resultats = comb1.comparer(comb2);
        System.out.println("Indices (noirs, blancs) : " + resultats[0] + ", " + resultats[1]);

        // Génération d'une combinaison aléatoire
        ArrayList<Character> couleursDisponibles = new ArrayList<>();
        couleursDisponibles.add('R'); // Rouge
        couleursDisponibles.add('B'); // Bleu
        couleursDisponibles.add('G'); // Vert
        couleursDisponibles.add('Y'); // Jaune

        Combinaison combinaisonAleatoire = Combinaison.genererAleatoire(4, couleursDisponibles);
        System.out.println("Combinaison générée aléatoirement : " + combinaisonAleatoire);

        // Comparaison entre une combinaison statique et une aléatoire
        resultats = comb1.comparer(combinaisonAleatoire);
        System.out.println("Indices (noirs, blancs) avec combinaison aléatoire : " +
                resultats[0] + ", " + resultats[1]);
    }
}
    
}

