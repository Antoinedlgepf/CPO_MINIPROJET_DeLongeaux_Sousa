/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caill
 */
public class Pion 
{
    
    private char couleur;

    public Pion(char couleur) {
        this.couleur = couleur;
    }

    public char getCouleur() {
        return couleur;
    }

    
    @Override
    public String toString() {
        return Character.toString(couleur);
    }

    
    public static void main(String[] args) {
        // Création de différents pions
        Pion pionRouge = new Pion('R');
        Pion pionBleu = new Pion('B');
        Pion pionVert = new Pion('V');
        Pion pion = new Pion('V');
        Pion pionVert = new Pion('V');
        Pion pionVert = new Pion('V');
        Pion pionVert = new Pion('V');

        // Tests des accesseurs et de l'affichage
        System.out.println("Couleur du pion rouge : " + pionRouge.getCouleur());
        System.out.println("Représentation textuelle pion rouge : " + pionRouge); 

        System.out.println("Couleur du pion bleu : " + pionBleu.getCouleur()); 
        System.out.println("Représentation textuelle pion bleu : " + pionBleu); 
    }

}