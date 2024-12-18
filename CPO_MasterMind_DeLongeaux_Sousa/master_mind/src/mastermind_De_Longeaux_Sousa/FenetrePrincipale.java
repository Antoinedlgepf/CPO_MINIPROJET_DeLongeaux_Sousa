/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_De_Longeaux_Sousa;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author caill
 */
public class FenetrePrincipale extends javax.swing.JFrame {
        private JPanel jPanel1; // Panel pour la grille du jeu
        private JButton[] boutonsCouleur; // Tableau de boutons pour les couleurs
        private JButton[] boutonsProposition; // Tableau pour afficher la proposition du joueur
        private Partie_1 partie; // Instance de la partie de jeu
    /**
     * Creates new form FenetrePrincipale
     */
   public FenetrePrincipale() {
        partie = new Partie_1(); // Créer une nouvelle partie
        partie.initialiserPartie(); // Initialiser la partie avec une combinaison gagnante
        initComponents();
        setUpGrille();
        setUpCouleurs();
    }
   private void initComponents() {
        // Initialisation de la fenêtre
        setTitle("Jeu Mastermind");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel pour la grille du jeu (les propositions)
        jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(10, 4)); // 10 lignes, 4 colonnes pour les propositions
        add(jPanel1, BorderLayout.CENTER);

        // Panel pour les boutons de couleurs
        JPanel panelCouleurs = new JPanel();
        panelCouleurs.setLayout(new FlowLayout());
        add(panelCouleurs, BorderLayout.SOUTH);

        // Initialisation des boutons de couleur
        String[] couleurs = {"rouge", "jaune", "vert", "bleu", "orange", "blanc", "violet", "rose"};
        boutonsCouleur = new JButton[couleurs.length];
        for (int i = 0; i < couleurs.length; i++) {
            boutonsCouleur[i] = new JButton(couleurs[i]);
            boutonsCouleur[i].setBackground(getCouleur(couleurs[i]));
            boutonsCouleur[i].addActionListener(new ColorButtonListener(i));
            panelCouleurs.add(boutonsCouleur[i]);
        }
        boutonsProposition = new JButton[4];
        for (int i = 0; i < 4; i++) {
            boutonsProposition[i] = new JButton();
            boutonsProposition[i].setBackground(Color.GRAY);
            jPanel1.add(boutonsProposition[i]);
        }
        JButton boutonValider = new JButton("Valider Proposition");
        boutonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validerProposition();
            }
        });
        add(boutonValider, BorderLayout.NORTH);
    }
    private void setUpGrille() {
        // Grille pour afficher les lignes de proposition
        // La grille est déjà configurée dans initComponents
    }
    private void setUpCouleurs() {
        // Ajoute les boutons de couleurs sous la grille
    }
    private Color getCouleur(String couleur) {
        switch (couleur) {
            case "rouge": return Color.RED;
            case "jaune": return Color.YELLOW;
            case "vert": return Color.GREEN;
            case "bleu": return Color.BLUE;
            case "orange": return Color.ORANGE;
            case "blanc": return Color.WHITE;
            case "violet": return new Color(138, 43, 226); // Violet
            case "rose": return Color.PINK;
            default: return Color.GRAY;
        }
    }
    private class ColorButtonListener implements ActionListener {
        private int couleurIndex;

        public ColorButtonListener(int index) {
            this.couleurIndex = index;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // Placer la couleur choisie dans la première case vide
            for (int i = 0; i < 4; i++) {
                if (boutonsProposition[i].getBackground() == Color.GRAY) {
                    boutonsProposition[i].setBackground(getCouleur(boutonsCouleur[couleurIndex].getText()));
                    break;
                }
            }
        }
    }
    private void validerProposition() {
        // Collecter les couleurs de la proposition du joueur
        String[] proposition = new String[4];
        for (int i = 0; i < 4; i++) {
            Color couleur = boutonsProposition[i].getBackground();
            proposition[i] = getCouleurName(couleur);
        }

        // Comparer la proposition avec la ligne gagnante
        partie.ligneTest.placerPion(proposition);
        int[] resultats = partie.nbJuste();
        System.out.println("Vous avez place " + resultats[0] + " pions correctement.");
        System.out.println("Vous avez mal placé " + resultats[1] + " pions.");

        if (partie.etreGagnante()) {
            JOptionPane.showMessageDialog(this, "BRAVO ! Vous avez gagné !");
        } else {
            JOptionPane.showMessageDialog(this, "Dommage, continuez à essayer.");
        }
    }
    private String getCouleurName(Color couleur) {
        // Convertir la couleur en nom (à adapter selon la couleur réelle)
        if (couleur.equals(Color.RED)) return "rouge";
        if (couleur.equals(Color.YELLOW)) return "jaune";
        if (couleur.equals(Color.GREEN)) return "vert";
        if (couleur.equals(Color.BLUE)) return "bleu";
        if (couleur.equals(Color.ORANGE)) return "orange";
        if (couleur.equals(Color.WHITE)) return "blanc";
        if (couleur.equals(new Color(138, 43, 226))) return "violet"; // Violet
        if (couleur.equals(Color.PINK)) return "rose";
        return "inconnu";
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 242, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(436, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
