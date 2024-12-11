/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author caill
 */
public class CPO_MiniProjet_DeLongeaux_Sousa_Main {
    
   

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> couleurs = new ArrayList<>();
        couleurs.add('R'); // Rouge
        couleurs.add('B'); // Bleu
        couleurs.add('V'); // Vert
        couleurs.add('Y'); // Jaune
        couleurs.add('N'); // noire
        couleurs.add('G'); // blanc

        Partie partie = new Partie(4, 10, couleurs);
        partie.lancerPartie();
    }
}

}
