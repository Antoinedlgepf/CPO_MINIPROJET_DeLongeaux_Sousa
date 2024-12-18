/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_De_Longeaux_Sousa;

/**
 *
 * @author souse
 */
class Ligne_1 {
    Pion LigneAssociee[] = new Pion[4];
    
    public void placerPion(Pion p1, Pion p2, Pion p3, Pion p4) {
        LigneAssociee[0] = p1;
        LigneAssociee[1] = p2;
        LigneAssociee[2] = p3;
        LigneAssociee[3] = p4;
    }
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_PINK = "\u001B[35;1m";
    
    public void afficherLigne() {
        for (int i=0; i<4; i++) {
            System.out.print(" ");
            switch (LigneAssociee[i].Couleur){
                    case "rouge" :
                        System.out.print(ANSI_RED + "\u2024 " + ANSI_RESET);
                        break;
                    case "jaune" :
                        System.out.print(ANSI_YELLOW + "\u2024 " + ANSI_RESET);
                        break;
                    case "vert" :
                        System.out.print(ANSI_GREEN + "\u2024 " + ANSI_RESET);
                        break;
                    case "bleu" :
                        System.out.print(ANSI_BLUE + "\u2024 " + ANSI_RESET);
                        break;
                    case "blanc" :
                        System.out.print(ANSI_WHITE + "\u2024 " + ANSI_RESET);
                        break;
                    case "violet" :
                        System.out.print(ANSI_PURPLE + "\u2024 " + ANSI_RESET);
                        break;
                    case "rose" :
                        System.out.print(ANSI_PINK + "\u2024 " + ANSI_RESET);
                        break;
                    case "orange" :
                        System.out.print(ANSI_BLACK + "\u2024 " + ANSI_RESET);
                        break;
    }
        }
}
}
    

