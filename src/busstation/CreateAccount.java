package busstation;

import static busstation.LogIn.*;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CreateAccount extends javax.swing.JFrame {

    boolean View1 = false, View2 = false;

    public CreateAccount() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChoiceButtonGroup = new javax.swing.ButtonGroup();
        FemaleRadioButton = new javax.swing.JRadioButton();
        MaleRadioButton = new javax.swing.JRadioButton();
        EnterpriceIcon = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        AddressNumberLabel = new javax.swing.JLabel();
        BirthDateLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordLabel2 = new javax.swing.JLabel();
        ViewButton1 = new javax.swing.JToggleButton();
        ViewButton2 = new javax.swing.JToggleButton();
        NameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        PhoneNumberTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        BirthDateTextField = new javax.swing.JTextField();
        SignUpPasswordField1 = new javax.swing.JPasswordField();
        SignUpPasswordField2 = new javax.swing.JPasswordField();
        CancelButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        BlackBackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Crear usuario");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChoiceButtonGroup.add(FemaleRadioButton);
        FemaleRadioButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        FemaleRadioButton.setText("Mujer");
        FemaleRadioButton.setToolTipText("Clíck aqui para selecceionar \"Mujer\".");
        FemaleRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(FemaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 130, -1));

        ChoiceButtonGroup.add(MaleRadioButton);
        MaleRadioButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        MaleRadioButton.setText("Hombre");
        MaleRadioButton.setToolTipText("Clíck aqui para selecceionar \"Hombre\".");
        MaleRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(MaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 150, -1));

        EnterpriceIcon.setBackground(new java.awt.Color(0, 0, 0));
        EnterpriceIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnterpriceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo480.jpg"))); // NOI18N
        getContentPane().add(EnterpriceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 40));

        TittleLabel.setBackground(new java.awt.Color(255, 255, 255));
        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Crea una cuenta como cliente");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, -1));

        NameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameLabel.setText("Nombre:");
        getContentPane().add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 20));

        LastNameLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        LastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LastNameLabel.setText("Apellidos:");
        getContentPane().add(LastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, 20));

        PhoneNumberLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PhoneNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneNumberLabel.setText("Numero de teléfono:");
        getContentPane().add(PhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, 20));

        AddressNumberLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AddressNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddressNumberLabel.setText("Dirección:");
        getContentPane().add(AddressNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, 20));

        BirthDateLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BirthDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BirthDateLabel.setText("Fecha de Nacimiento (aa-mm-dd):");
        getContentPane().add(BirthDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 20));

        PasswordLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Contraseña (Minimo 8 Caracteres):");
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 280, 20));

        PasswordLabel2.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PasswordLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel2.setText("Confirma tu contraseña:");
        getContentPane().add(PasswordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 280, 20));

        ViewButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        ViewButton1.setToolTipText("Clíck aqui para mostrar tu contraseña legible.");
        ViewButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 30, 30));

        ViewButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.png"))); // NOI18N
        ViewButton2.setToolTipText("Clíck aqui para mostrar tu contraseña legible.");
        ViewButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(ViewButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 30, 30));

        NameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NameTextField.setToolTipText("Escribe aquí tu nombre de pila.");
        NameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        NameTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        NameTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 30));

        LastNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LastNameTextField.setToolTipText("Escribe aquí tu o tus apellidos.");
        LastNameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        LastNameTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        LastNameTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(LastNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 30));

        PhoneNumberTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PhoneNumberTextField.setToolTipText("Proporciona un número de teléfono.");
        PhoneNumberTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        PhoneNumberTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        PhoneNumberTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(PhoneNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 220, 30));

        AddressTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AddressTextField.setToolTipText("Proporciona una dirección o ubicación.");
        AddressTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        AddressTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        AddressTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 220, 30));

        BirthDateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BirthDateTextField.setToolTipText("Escribe tu fecha de nacimiento con el formato que se indica.");
        BirthDateTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        BirthDateTextField.setMargin(new java.awt.Insets(2, 0, 2, 0));
        BirthDateTextField.setPreferredSize(new java.awt.Dimension(51, 20));
        getContentPane().add(BirthDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 220, 30));

        SignUpPasswordField1.setToolTipText("Escribe una contraseña original.");
        SignUpPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(SignUpPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, 30));

        SignUpPasswordField2.setToolTipText("Ahora repitela y no la olvides.");
        SignUpPasswordField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(SignUpPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, 30));

        CancelButton.setBackground(new java.awt.Color(255, 153, 153));
        CancelButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CancelButton.setText("CANCELAR");
        CancelButton.setToolTipText("Clíck aqui para cancelar la operación.");
        CancelButton.setBorder(null);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 90, 30));

        CreateButton.setBackground(new java.awt.Color(153, 255, 153));
        CreateButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        CreateButton.setText("CREAR");
        CreateButton.setToolTipText("Clíck aqui para crear un nuevo usuario.");
        CreateButton.setBorder(null);
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 100, 30));

        BlackBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(BlackBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        int button = 0;
        if (MaleRadioButton.isSelected()) {
            button = 1;
        } else if (FemaleRadioButton.isSelected()) {
            button = 1;
        }

        if (button == 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un sexo.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(NameTextField.getText()) || "".equals(LastNameTextField.getText())
                || "".equals(LastNameTextField.getText()) || "".equals(String.valueOf(SignUpPasswordField1.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Falta rellenar algun campo\nTodos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!Arrays.equals(SignUpPasswordField1.getPassword(), SignUpPasswordField2.getPassword())) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                boolean exists = false;
                String comp = "";
                String user = NameTextField.getText() + " " + LastNameTextField.getText();
                user = user.toLowerCase();

                Statement stU = con.createStatement();
                ResultSet rsU = stU.executeQuery("SELECT * FROM admin");

                while (rsU.next()) {
                    String A = rsU.getString("Name");
                    String B = rsU.getString("LastName");
                    comp = A + " " + B;
                    comp = comp.toLowerCase();
                    if (comp.equalsIgnoreCase(user)) {
                        exists = true;
                    }
                }
                stU.close();

                Statement stV = con.createStatement();
                ResultSet rsV = stV.executeQuery("SELECT * FROM client");

                while (rsV.next()) {
                    String A = rsV.getString("Name");
                    String B = rsV.getString("LastName");
                    comp = A + " " + B;
                    comp = comp.toLowerCase();
                    if (comp.equalsIgnoreCase(user)) {
                        exists = true;
                    }
                }
                stV.close();

                if (exists == true) {
                    JOptionPane.showMessageDialog(null, "Nombre ya existente en el sistema!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    Statement st = con.createStatement();
                    if (MaleRadioButton.isSelected()) {
                        st.execute("INSERT INTO `client` (`IdClient`, `Name`, `LastName`, `PhoneNumber`,`Address`,`Gender`,"
                                + "`BirthDate`, `Password`) VALUES (NULL, '"
                                + NameTextField.getText() + "', '" + LastNameTextField.getText() + "', '" + PhoneNumberTextField.getText()
                                + "', '" + AddressTextField.getText() + "', 'M', '" + BirthDateTextField.getText()
                                + "', '" + String.valueOf(SignUpPasswordField1.getPassword()) + "');");
                    } else {
                        st.execute("INSERT INTO `client` (`IdClient`, `Name`, `LastName`, `PhoneNumber`,`Address`,`Gender`,"
                                + " `BirthDate`, `Password`) VALUES (NULL, '" + NameTextField.getText() + "', '" + LastNameTextField.getText()
                                + "', '" + PhoneNumberTextField.getText() + "', '" + AddressTextField.getText() + "', 'F', '"
                                + BirthDateTextField.getText() + "','" + String.valueOf(SignUpPasswordField1.getPassword()) + " ');");
                    }
                    JOptionPane.showMessageDialog(null, "El usuario ha sido creado exitosamente", "Listo", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    LogIn LGX = new LogIn();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        LogIn LG = new LogIn();
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ViewButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButton1ActionPerformed
        if (View1 == false) {
            SignUpPasswordField1.setEchoChar((char) 0);
            View1 = true;
        } else if (View1 == true) {
            SignUpPasswordField1.setEchoChar((char) '•');
            View1 = false;
        }
    }//GEN-LAST:event_ViewButton1ActionPerformed

    private void ViewButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButton2ActionPerformed
        if (View2 == false) {
            SignUpPasswordField2.setEchoChar((char) 0);
            View2 = true;
        } else if (View2 == true) {
            SignUpPasswordField2.setEchoChar((char) '•');
            View2 = false;
        }
    }//GEN-LAST:event_ViewButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressNumberLabel;
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JLabel BirthDateLabel;
    private javax.swing.JTextField BirthDateTextField;
    private javax.swing.JLabel BlackBackgroundLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.ButtonGroup ChoiceButtonGroup;
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel EnterpriceIcon;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswordLabel2;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTextField;
    private javax.swing.JPasswordField SignUpPasswordField1;
    private javax.swing.JPasswordField SignUpPasswordField2;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JToggleButton ViewButton1;
    private javax.swing.JToggleButton ViewButton2;
    // End of variables declaration//GEN-END:variables
}
