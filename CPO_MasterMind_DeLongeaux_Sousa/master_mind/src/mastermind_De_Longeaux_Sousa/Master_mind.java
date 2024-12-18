/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastermind_De_Longeaux_Sousa;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author souse
 */
public class Master_mind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Partie testpartie = new Partie();
        testpartie.initialiserPartie();
        //System.out.println("LIGNE GAGNANTE : ");
        //testpartie.ligneGagnante.afficherLigne();
        testpartie.debuterPartie();
        
        
        
    }
    
}
