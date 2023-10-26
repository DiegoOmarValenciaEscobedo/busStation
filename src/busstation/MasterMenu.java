package busstation;

import static busstation.LogIn.con;
import java.awt.Window;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MasterMenu extends javax.swing.JFrame {

    static boolean A = false, B = false, C = false, D = false, E = false, F = false, G = false;

    public MasterMenu() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoutButton = new javax.swing.JButton();
        AdmTravelsButton = new javax.swing.JButton();
        AdmClientsButton = new javax.swing.JButton();
        AdmBussesButton = new javax.swing.JButton();
        AdmCompaniesButton = new javax.swing.JButton();
        AdmDriversButton = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();
        AdmModelsButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        TittleLabel1 = new javax.swing.JLabel();
        TittleLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BussTation Patzcuaro: Menu Maestro");
        setMaximumSize(new java.awt.Dimension(700, 400));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoutButton.setBackground(new java.awt.Color(255, 153, 153));
        LogoutButton.setText("SALIR");
        LogoutButton.setToolTipText("Click aquí para salir del sistema al login.");
        LogoutButton.setBorder(null);
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 60, 20));

        AdmTravelsButton.setBackground(new java.awt.Color(153, 153, 255));
        AdmTravelsButton.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        AdmTravelsButton.setText("ADMIN VIAJES");
        AdmTravelsButton.setToolTipText("Click aquí para ir a la ventana de administración de viajes.");
        AdmTravelsButton.setBorder(null);
        AdmTravelsButton.setMaximumSize(new java.awt.Dimension(80, 25));
        AdmTravelsButton.setMinimumSize(new java.awt.Dimension(80, 25));
        AdmTravelsButton.setPreferredSize(new java.awt.Dimension(80, 25));
        AdmTravelsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmTravelsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdmTravelsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 150, 50));

        AdmClientsButton.setBackground(new java.awt.Color(153, 255, 153));
        AdmClientsButton.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        AdmClientsButton.setText("ADMIN CLIENTES");
        AdmClientsButton.setToolTipText("Click aquí para ir a la ventana de administración de clientes.");
        AdmClientsButton.setBorder(null);
        AdmClientsButton.setMaximumSize(new java.awt.Dimension(80, 25));
        AdmClientsButton.setMinimumSize(new java.awt.Dimension(80, 25));
        AdmClientsButton.setPreferredSize(new java.awt.Dimension(80, 25));
        AdmClientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmClientsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdmClientsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 50));

        AdmBussesButton.setBackground(new java.awt.Color(255, 153, 153));
        AdmBussesButton.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        AdmBussesButton.setText("ADMIN CAMIONES");
        AdmBussesButton.setToolTipText("Click aquí para ir a la ventana de administración de camiones.");
        AdmBussesButton.setBorder(null);
        AdmBussesButton.setMaximumSize(new java.awt.Dimension(80, 25));
        AdmBussesButton.setMinimumSize(new java.awt.Dimension(80, 25));
        AdmBussesButton.setPreferredSize(new java.awt.Dimension(80, 25));
        AdmBussesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmBussesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdmBussesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, 50));

        AdmCompaniesButton.setBackground(new java.awt.Color(255, 204, 153));
        AdmCompaniesButton.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        AdmCompaniesButton.setText("ADMIN COMPAÑIAS");
        AdmCompaniesButton.setToolTipText("Click aquí para ir a la ventana de administración de compañias.");
        AdmCompaniesButton.setBorder(null);
        AdmCompaniesButton.setMaximumSize(new java.awt.Dimension(80, 25));
        AdmCompaniesButton.setMinimumSize(new java.awt.Dimension(80, 25));
        AdmCompaniesButton.setPreferredSize(new java.awt.Dimension(80, 25));
        AdmCompaniesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmCompaniesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdmCompaniesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 150, 50));

        AdmDriversButton.setBackground(new java.awt.Color(153, 204, 255));
        AdmDriversButton.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        AdmDriversButton.setText("ADMIN CONDUCTORES");
        AdmDriversButton.setToolTipText("Click aquí para ir a la ventana de administración de conductores.");
        AdmDriversButton.setBorder(null);
        AdmDriversButton.setMaximumSize(new java.awt.Dimension(80, 25));
        AdmDriversButton.setMinimumSize(new java.awt.Dimension(80, 25));
        AdmDriversButton.setPreferredSize(new java.awt.Dimension(80, 25));
        AdmDriversButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmDriversButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdmDriversButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 50));

        MainMenuButton.setBackground(new java.awt.Color(153, 153, 153));
        MainMenuButton.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        MainMenuButton.setText("VER MENU PRINCIPAL");
        MainMenuButton.setToolTipText("Click aquí para mostrar el menu principal.");
        MainMenuButton.setBorder(null);
        MainMenuButton.setMaximumSize(new java.awt.Dimension(80, 25));
        MainMenuButton.setMinimumSize(new java.awt.Dimension(80, 25));
        MainMenuButton.setPreferredSize(new java.awt.Dimension(80, 25));
        MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MainMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 620, 50));

        AdmModelsButton.setBackground(new java.awt.Color(255, 255, 153));
        AdmModelsButton.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        AdmModelsButton.setText("ADMIN MODELOS");
        AdmModelsButton.setToolTipText("Click aquí para ir a la ventana de administración de modelos.");
        AdmModelsButton.setBorder(null);
        AdmModelsButton.setMaximumSize(new java.awt.Dimension(80, 25));
        AdmModelsButton.setMinimumSize(new java.awt.Dimension(80, 25));
        AdmModelsButton.setPreferredSize(new java.awt.Dimension(80, 25));
        AdmModelsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmModelsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdmModelsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 150, 50));

        ResetButton.setBackground(new java.awt.Color(153, 153, 153));
        ResetButton.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        ResetButton.setText("REESTABLECER VIAJES");
        ResetButton.setToolTipText("Click aquí para volver los viajes a su estado inicial.");
        ResetButton.setBorder(null);
        ResetButton.setMaximumSize(new java.awt.Dimension(80, 25));
        ResetButton.setMinimumSize(new java.awt.Dimension(80, 25));
        ResetButton.setPreferredSize(new java.awt.Dimension(80, 25));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 620, 50));

        TittleLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel1.setText("¡Bienvenido administrador!");
        getContentPane().add(TittleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 30));

        TittleLabel2.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel2.setText("¿Que desea hacer hoy?");
        getContentPane().add(TittleLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 20));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo480.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 60));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(700, 400));
        Background.setMinimumSize(new java.awt.Dimension(700, 400));
        Background.setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdmClientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmClientsButtonActionPerformed
        if (A == false) {
            ManageClients MC = new ManageClients();
            A = true;
        }
    }//GEN-LAST:event_AdmClientsButtonActionPerformed

    private void AdmBussesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmBussesButtonActionPerformed
        if (B == false) {
            ManageBuses MC = new ManageBuses();
            B = true;
        }
    }//GEN-LAST:event_AdmBussesButtonActionPerformed

    private void AdmCompaniesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmCompaniesButtonActionPerformed
        if (C == false) {
            ManageCompany MC = new ManageCompany();
            C = true;
        }
    }//GEN-LAST:event_AdmCompaniesButtonActionPerformed

    private void AdmDriversButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmDriversButtonActionPerformed
        if (D == false) {
            ManageDrivers MC = new ManageDrivers();
            D = true;
        }
    }//GEN-LAST:event_AdmDriversButtonActionPerformed

    private void MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtonActionPerformed
        if (E == false) {
            MainMenu MC = new MainMenu();
            E = true;
        }
    }//GEN-LAST:event_MainMenuButtonActionPerformed

    private void AdmTravelsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmTravelsButtonActionPerformed
        if (F == false) {
            ManageTravel MC = new ManageTravel();
            F = true;
        }
    }//GEN-LAST:event_AdmTravelsButtonActionPerformed

    private void AdmModelsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmModelsButtonActionPerformed
        if (G == false) {
            ManageModels MC = new ManageModels();
            G = true;
        }
    }//GEN-LAST:event_AdmModelsButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        if (A == true || B == true || C == true || D == true || E == true || F == true || G == true) {
            JOptionPane.showMessageDialog(null, "Por favor cierre todas las ventanas\n"
                    + "antes de salir del sistema.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.dispose();
            LogIn L2 = new LogIn();
        }
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        try {

            Statement st = con.createStatement();
            int IDT1, IDT2, IDT3, IDTF;

            ResultSet rs = st.executeQuery("SELECT * FROM travel;");

            while (rs.next()) {
                String idt = rs.getString("IdTravel");
                IDT1 = Integer.parseInt(idt);
                Statement st1 = con.createStatement();
                ResultSet rs1 = st1.executeQuery("SELECT bus FROM travel WHERE (`IdTravel` = '" + IDT1 + "');");
                while (rs1.next()) {
                    String idt2 = rs1.getString("bus");
                    IDT2 = Integer.parseInt(idt2);
                    Statement st2 = con.createStatement();
                    ResultSet rs2 = st2.executeQuery("SELECT model FROM bus WHERE (`IdBus` = '" + IDT2 + "');");
                    while (rs2.next()) {
                        String idt3 = rs2.getString("model");
                        IDT3 = Integer.parseInt(idt3);
                        Statement st3 = con.createStatement();
                        ResultSet rs3 = st3.executeQuery("SELECT capacity FROM model WHERE (`IdModel` = '" + IDT3 + "');");
                        while (rs3.next()) {
                            String idtf = rs3.getString("capacity");
                            IDTF = Integer.parseInt(idtf);
                            Statement st4 = con.createStatement();
                            st4.execute("UPDATE travel SET FreeSeats = " + IDTF + " WHERE (`IdTravel` = '" + IDT1 + "');");
                            st4.close();
                        }
                        st3.close();
                    }
                    st2.close();
                }
                st1.close();
            }
            st.close();
            JOptionPane.showMessageDialog(null, "Los asientos libres de los viajes\n"
                    + "han vuelto a su estado original.", "PERFECTO", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(MasterMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ResetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdmBussesButton;
    private javax.swing.JButton AdmClientsButton;
    private javax.swing.JButton AdmCompaniesButton;
    private javax.swing.JButton AdmDriversButton;
    private javax.swing.JButton AdmModelsButton;
    private javax.swing.JButton AdmTravelsButton;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel TittleLabel1;
    private javax.swing.JLabel TittleLabel2;
    // End of variables declaration//GEN-END:variables

    public static void CloseAll() {
        Window[] windows = getWindows();

        for (Window window : windows) {
            if (window instanceof JFrame) {
                window.dispose();
            }
        }
    }
}
