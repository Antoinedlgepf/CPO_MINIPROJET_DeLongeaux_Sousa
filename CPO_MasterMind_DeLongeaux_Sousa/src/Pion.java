/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author souse
 */
public class Pion {
    private char couleur; // Représente la couleur du pion

    // Constructeur
    public Pion(char couleur) {
        this.couleur = couleur;
    }

    // Getter pour la couleur
    public char getCouleur() {
        return couleur;
    }

    // Représentation textuelle du pion
    @Override
    public String toString() {
        return String.valueOf(couleur);
    }
}  
      

