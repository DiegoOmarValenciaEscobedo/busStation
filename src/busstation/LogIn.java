package busstation;

import javax.swing.JOptionPane;
import java.sql.*;
import org.jvnet.substance.SubstanceLookAndFeel;

public class LogIn extends javax.swing.JFrame {

    boolean View = false;
    static Connection con;

    public LogIn() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        EnterpriceIcon = new javax.swing.JLabel();
        ViewButton = new javax.swing.JToggleButton();
        ExitButton = new javax.swing.JButton();
        GetInButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        UsernameTextField = new javax.swing.JTextField();
        LogInPasswordField = new javax.swing.JPasswordField();
        AdminRadioButton = new javax.swing.JRadioButton();
        ClientRadioButton = new javax.swing.JRadioButton();
        PasswordLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        SignUpLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: LogIn");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnterpriceIcon.setBackground(new java.awt.Color(0, 0, 0));
        EnterpriceIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterpriceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo480.jpg"))); // NOI18N
        getContentPane().add(EnterpriceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 40));

        ViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        ViewButton.setToolTipText("Clíck aqui para mostrar tu contraseña legible.");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 30, 20));

        ExitButton.setBackground(new java.awt.Color(153, 153, 153));
        ExitButton.setText("CERRAR");
        ExitButton.setToolTipText("Clíck aqui para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, 20));

        GetInButton.setBackground(new java.awt.Color(102, 255, 102));
        GetInButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        GetInButton.setText("INGRESAR");
        GetInButton.setToolTipText("Clíck aqui para ingresar con los datos proporcionados.");
        GetInButton.setBorder(null);
        GetInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetInButtonActionPerformed(evt);
            }
        });
        getContentPane().add(GetInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 80, 30));

        SignUpButton.setBackground(new java.awt.Color(102, 153, 255));
        SignUpButton.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        SignUpButton.setText("CREAR USUARIO");
        SignUpButton.setToolTipText("Clíck aquí para ir a la ventana de creación de usuario.");
        SignUpButton.setBorder(null);
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 130, 30));

        UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameTextField.setToolTipText("Escribe aquí tu nombre del sistema.");
        UsernameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        UsernameTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        UsernameTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, -1));

        LogInPasswordField.setToolTipText("Escribe aquí tu contraseña.");
        LogInPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        getContentPane().add(LogInPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 20));

        buttonGroup.add(AdminRadioButton);
        AdminRadioButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AdminRadioButton.setText("Administrador");
        AdminRadioButton.setToolTipText("Clíck aqui si eres administrador.");
        AdminRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(AdminRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 150, -1));

        buttonGroup.add(ClientRadioButton);
        ClientRadioButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ClientRadioButton.setSelected(true);
        ClientRadioButton.setText("Cliente");
        ClientRadioButton.setToolTipText("Clíck aqui si eres cliente.");
        ClientRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ClientRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 130, -1));

        PasswordLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Contraseña:");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 20));

        UsernameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Nombre:");
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 20));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Accede a tu cuenta para continuar");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, -1));

        SignUpLabel.setFont(new java.awt.Font("HelvLight", 0, 11)); // NOI18N
        SignUpLabel.setText("¿No tienes una cuenta?");
        getContentPane().add(SignUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void StartConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busstation", "root", "");
            System.out.println("Connection succesful");
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        try {
            System.exit(0);
            con.close();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void GetInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetInButtonActionPerformed
        boolean exist = false;
        String name = "", type = "", ids = "";
        int id = 0;

        try {
            Statement st = con.createStatement();
            ResultSet rs;
            ResultSet rs2;

            if (ClientRadioButton.isSelected()) {
                rs = st.executeQuery("SELECT Name, Password FROM client;");
                type = "CLIENT";
            } else {
                rs = st.executeQuery("SELECT Name, Password FROM admin;");
                type = "ADMIN";
            }

            while (rs.next()) {
                if (rs.getString("Name").equalsIgnoreCase(UsernameTextField.getText()) && rs.getString("Password")
                        .equals(String.valueOf(LogInPasswordField.getPassword()))) {
                    exist = true;
                    break;
                }
            }
            
            if (exist) {
                System.out.println("DATOS CORRECTOS");
                name = UsernameTextField.getText();
                if (type.equals("ADMIN")) {
                    rs2 = st.executeQuery("SELECT * FROM admin WHERE (Name ='"+name+"');");
                    while (rs2.next()){
                        ids = rs2.getString("IdAdmin");
                        id = Integer.parseInt(ids);
                    }
                    rs2.close();
                    MainMenu.Capture(name, id, true);
                    MasterMenu MM = new MasterMenu();
                } else if (type.equals("CLIENT")) {
                    rs2 = st.executeQuery("SELECT * FROM client WHERE (Name ='"+name+"');");
                    while (rs2.next()){
                        ids = rs2.getString("IdClient");
                        id = Integer.parseInt(ids);
                    }
                    rs2.close();
                    MainMenu.Capture(name, id, false);
                    MainMenu MM = new MainMenu();
                }
                MainMenu.ac = 1;
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario y/o contraseña\nson incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
        }

    }//GEN-LAST:event_GetInButtonActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        if (View == false) {
            LogInPasswordField.setEchoChar((char) 0);
            View = true;
        } else if (View == true) {
            LogInPasswordField.setEchoChar((char) '•');
            View = false;
        }
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        CreateAccount CA = new CreateAccount();
        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessSkin");
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdminRadioButton;
    private javax.swing.JLabel Background;
    private javax.swing.JRadioButton ClientRadioButton;
    private javax.swing.JLabel EnterpriceIcon;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton GetInButton;
    private javax.swing.JPasswordField LogInPasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JToggleButton ViewButton;
    private javax.swing.ButtonGroup buttonGroup;
    // End of variables declaration//GEN-END:variables
}
