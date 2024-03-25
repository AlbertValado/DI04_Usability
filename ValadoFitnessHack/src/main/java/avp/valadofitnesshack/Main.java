/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package avp.valadofitnesshack;

import avp.valadofitnesshack.dialogs.LoginDialog;
import avp.valadofitnesshack.dataaccess.DataAccess;
import avp.valadofitnesshack.dto.Usuari;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * Clase desde la que se inicializa el programa
 * Permite hacer log y acceder a la vista de Instructor
 * COntiene el logo de la aplicación 
 *
 * @author Albert
 */
public class Main extends javax.swing.JFrame {

    private DataAccess da = new DataAccess();
    private javax.swing.JList<Usuari> lstUsuaris;

    /**
     * Creates new form Main
     */
    public Main() {

        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        //LOOK AND FEEL: COMPONENT
        UIManager.put("Component.arc", 999);
        UIManager.put("Component.arrowType", "triangle");
        UIManager.put("Component.focusWidth", 2);
        UIManager.put("Component.hideMnemonics", false);

        //BUTTON
        UIManager.put("Button.arc", 999);

        //SCROLLBAR
        UIManager.put("ScrollBar.showButtons", true);
        UIManager.put("ScrollBar.thumbArc", 999);
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));

        Font smallFont = CustomFontLoader.loadCustomFont("src\\main\\java\\avp\\valadofitnesshack\\resources\\fonts\\Quitars.ttf", 18F);
        Font mediumFont = CustomFontLoader.loadCustomFont("src\\main\\java\\avp\\valadofitnesshack\\resources\\fonts\\Quitars.ttf", 20F);
        Font largeFont = CustomFontLoader.loadCustomFont("src\\main\\java\\avp\\valadofitnesshack\\resources\\fonts\\Quitars.ttf", 24F);

        if (smallFont != null && mediumFont != null && largeFont != null) {
            UIManager.put("Label.font", largeFont);
            UIManager.put("Button.font", mediumFont);

            initComponents();
            setSize(500, 500);
            setLocationRelativeTo(null);
            btnLogin.setFont(mediumFont);
            
            mnuFile.setFont(smallFont);
            mnuHelp.setFont(smallFont);
            itmAbout.setFont(smallFont);
            itmExit.setFont(smallFont);
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
        btnLogin = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        itmExit = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        itmAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/address-card.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(210, 290, 110, 50);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(lblLogo);
        lblLogo.setBounds(140, 20, 260, 250);

        mnuFile.setText("File");

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuFile.add(itmExit);

        jMenuBar1.add(mnuFile);

        mnuHelp.setText("Help");

        itmAbout.setText("About");
        itmAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(itmAbout);

        jMenuBar1.add(mnuHelp);
        mnuHelp.getAccessibleContext().setAccessibleDescription("");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        LoginDialog dialogLogin = new LoginDialog(this, true, this);
        dialogLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    //Métodos del menú
    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAboutActionPerformed
        JOptionPane.showMessageDialog(this, "Realizado por Albert Valado Pujol\n"
                + "\n"
                + "Se ha resuelto un primer problema de conexión entre Netbeans y la base de datos buscando el error arrojado por la build en Google\n"
                + "y usando el siguiente enlace: https://es.stackoverflow.com/questions/32148/error-al-conectar-netbeans-con-una-base-de-datos-de-sql-server-2008\n"
                + "\n"
                + "Otra problemática recurrente ha sido la comunicación entre las distintas views y sus respectivos dialogs, en particular\n"
                + "a la hora de pasar información. En general, esto ha sido resuelto a través de la parametrización de la información y el uso de getters/setters. \n"
                + "El principal punto en el que se ha tenido este problema ha sido a la hora de mantener un único JDialog para los métodos de crear una\n"
                + "review y de actualizarla, para pasar información acerca de qué botones mostrar. La solución fue usar un parámetro de la ventana padre. \n"
                + "\n"
                + "Por algú motivo, añadir las imágenes al main, da error al compilar. \n"
                + "\n"
                + "Icono del login: https://www.flaticon.com/free-icons/login created by Freepik - Flaticon\n"
                + "Logo de la aplicación por gentileza de Tófol Martínez Lorenzo");
    }//GEN-LAST:event_itmAboutActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JMenuItem itmAbout;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    // End of variables declaration//GEN-END:variables
}
