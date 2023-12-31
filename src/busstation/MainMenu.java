package busstation;

import static busstation.LogIn.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MainMenu extends javax.swing.JFrame {

    static boolean type = false;
    static String name = "";
    static int id = 0, counter = 0, ac = 0;

    public MainMenu() {
        initComponents();
        StartConnection();
        SetMainMenu();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        TittleLabel1.setText("¡" + name + " bienvenido al sistema de gestión de la central de autobuses!");
    }

    public static void Capture(String NAME, int ID, boolean TYPE) {
        name = NAME;
        id = ID;
        type = TYPE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        TittleLabel1 = new javax.swing.JLabel();
        TextLabel1 = new javax.swing.JLabel();
        TextLabel2 = new javax.swing.JLabel();
        TextLabel3 = new javax.swing.JLabel();
        TextLabel4 = new javax.swing.JLabel();
        TextLabel5 = new javax.swing.JLabel();
        TextLabel6 = new javax.swing.JLabel();
        TextLabel7 = new javax.swing.JLabel();
        TextLabel8 = new javax.swing.JLabel();
        TextLabel9 = new javax.swing.JLabel();
        EditLabel1 = new javax.swing.JLabel();
        EditLabel2 = new javax.swing.JLabel();
        EditLabel3 = new javax.swing.JLabel();
        EditLabel4 = new javax.swing.JLabel();
        EditLabel5 = new javax.swing.JLabel();
        EditLabel6 = new javax.swing.JLabel();
        BuyButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CompsTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TrvsTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        AdmsTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        BssTable = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Menu Principal");
        setMaximumSize(new java.awt.Dimension(900, 570));
        setMinimumSize(new java.awt.Dimension(900, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("CERRAR");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 60, 20));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo480.jpg"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        TittleLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel1.setText("¡'UserName' bienvenido al sistema de gestión de la central de autobuses!");
        getContentPane().add(TittleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 900, 30));

        TextLabel1.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel1.setText("Chofer mas experimentado:");
        getContentPane().add(TextLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        TextLabel2.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel2.setText("Nuestras compañias:");
        getContentPane().add(TextLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 240, 30));

        TextLabel3.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel3.setText("Viajes disponibles:");
        getContentPane().add(TextLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 240, 30));

        TextLabel4.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel4.setText("El viaje mas barato de hoy:");
        getContentPane().add(TextLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 30));

        TextLabel5.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel5.setText("Eres el cliente N°:");
        getContentPane().add(TextLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 240, 30));

        TextLabel6.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel6.setText("Ponte en contacto con un admin:");
        getContentPane().add(TextLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 30));

        TextLabel7.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TextLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel7.setText("Nuestros autobuses:");
        getContentPane().add(TextLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 240, 30));

        TextLabel8.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        TextLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel8.setText("Central de autobuses: Pátzcuaro Michoacán S.A. de C.V. 2021");
        getContentPane().add(TextLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 900, 20));

        TextLabel9.setFont(new java.awt.Font("HelvLight", 1, 10)); // NOI18N
        TextLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel9.setText("Diego Valencia & Rodrigo Villaseñor");
        getContentPane().add(TextLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 900, 20));

        EditLabel1.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        EditLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditLabel1.setText("Nuestro chofer 'Name' con una de 'Edad'");
        getContentPane().add(EditLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, 20));

        EditLabel2.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        EditLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditLabel2.setText("'Des'");
        getContentPane().add(EditLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, -1));

        EditLabel3.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        EditLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditLabel3.setText("INT");
        getContentPane().add(EditLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 40));

        EditLabel4.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        EditLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditLabel4.setText("con una edad de 'Edad'.");
        getContentPane().add(EditLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 240, 30));

        EditLabel5.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        EditLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditLabel5.setText("y un precio de 'Precio' pesos.");
        getContentPane().add(EditLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 20));

        EditLabel6.setFont(new java.awt.Font("HelvLight", 0, 14)); // NOI18N
        EditLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditLabel6.setText("Con destino a");
        getContentPane().add(EditLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, 240, 20));

        BuyButton.setBackground(new java.awt.Color(102, 255, 102));
        BuyButton.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        BuyButton.setText("COMPRAR BOLETO");
        BuyButton.setToolTipText("Click aquí para ir a la ventana de compra.");
        BuyButton.setBorder(null);
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BuyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 230, 50));

        LoginButton.setBackground(new java.awt.Color(255, 153, 153));
        LoginButton.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        LoginButton.setText("VOLVER AL LOGIN");
        LoginButton.setToolTipText("Click aquí para salir del sistema al login.");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 230, 50));

        CompsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compañias", "N° de telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CompsTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 260, 170));

        TrvsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destino", "Autobus", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TrvsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 340, 330));

        AdmsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° de telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(AdmsTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, 120));

        BssTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Propietario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(BssTable);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 260, 120));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(900, 570));
        Background.setMinimumSize(new java.awt.Dimension(900, 570));
        Background.setPreferredSize(new java.awt.Dimension(900, 570));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        this.dispose();
        BuyMenu BMX = new BuyMenu();
        MasterMenu.E = false;
    }//GEN-LAST:event_BuyButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        this.dispose();
        MasterMenu.E = false;
        MasterMenu.CloseAll();
        LogIn LI = new LogIn();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        if (type == true) {
            this.dispose();
            MasterMenu.E = false;
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AdmsTable;
    private javax.swing.JLabel Background;
    private javax.swing.JTable BssTable;
    private javax.swing.JButton BuyButton;
    private javax.swing.JTable CompsTable;
    private javax.swing.JLabel EditLabel1;
    private javax.swing.JLabel EditLabel2;
    private javax.swing.JLabel EditLabel3;
    private javax.swing.JLabel EditLabel4;
    private javax.swing.JLabel EditLabel5;
    private javax.swing.JLabel EditLabel6;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel TextLabel1;
    private javax.swing.JLabel TextLabel2;
    private javax.swing.JLabel TextLabel3;
    private javax.swing.JLabel TextLabel4;
    private javax.swing.JLabel TextLabel5;
    private javax.swing.JLabel TextLabel6;
    private javax.swing.JLabel TextLabel7;
    private javax.swing.JLabel TextLabel8;
    private javax.swing.JLabel TextLabel9;
    private javax.swing.JLabel TittleLabel1;
    private javax.swing.JTable TrvsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    public void SetMainMenu() {
        try {
            Statement st = con.createStatement();

            ResultSet rs1 = st.executeQuery("SELECT Name, LastName, YEAR(CURDATE())-YEAR(`BirthDate`) + IF(DATE_FORMAT(CURDATE(),'%m-%d') > DATE_FORMAT(`BirthDate`,'%m-%d'), 0 , -1 ) AS `Edad` FROM driver ORDER BY BirthDate ASC LIMIT 1;");

            while (rs1.next()) {
                String name = rs1.getString("Name");
                String ape = rs1.getString("LastName");
                String edad1 = rs1.getString("Edad");
                int edad = Integer.parseInt(edad1);
                EditLabel1.setText("Nuestro chofer " + name + " " + ape);
                EditLabel4.setText("con una edad de " + edad + " años.");
            }
            rs1.close();

            ResultSet rs2 = st.executeQuery("SELECT * FROM travel ORDER BY Price ASC LIMIT 1;");

            while (rs2.next()) {
                String destiny = rs2.getString("Destination");
                String price1 = rs2.getString("Price");
                double price = Double.parseDouble(price1);
                EditLabel2.setText(destiny);
                EditLabel5.setText("y un precio de " + price + " pesos.");
            }
            rs2.close();

            ResultSet rs3 = st.executeQuery("SELECT * FROM counter");

            while (rs3.next()) {
                String counter1 = rs3.getString("Counter");
                counter = Integer.parseInt(counter1);
            }
            rs3.close();

            if (ac > 0) {
                EditLabel3.setText(counter + "");
                counter = counter + ac;
                st.execute("UPDATE counter SET `Counter` = '" + counter + "' WHERE (`IDC` = '1');");
                ac = 0;
            }
            
            ResultSet rs4 = st.executeQuery("SELECT * FROM admin");
            DefaultTableModel table1 = (DefaultTableModel) AdmsTable.getModel();

            while (rs4.next()) {
                String phone = rs4.getString("PhoneNumber");
                String phone1 = phone.substring(0, 3);
                String phone2 = phone.substring(3, 6);
                String phone3 = phone.substring(6, 10);
                String phoneF = phone1 + " - " + phone2 + " - " + phone3;
                String Row[] = new String[]{phoneF};
                table1.addRow(Row);
            }
            rs4.close();

            ResultSet rs5 = st.executeQuery("SELECT * FROM company");
            DefaultTableModel table2 = (DefaultTableModel) CompsTable.getModel();

            while (rs5.next()) {
                String name = rs5.getString("Name");
                String phone = rs5.getString("PhoneNumber");
                String phone1 = phone.substring(0, 2);
                String phone2 = phone.substring(2, 5);
                String phone3 = phone.substring(5, 8);
                String phone4 = phone.substring(8, 12);
                String phoneF = phone1 + " - " + phone2 + " - " + phone3 + " - " + phone4;
                String Row[] = new String[]{name, phoneF};
                table2.addRow(Row);
            }
            rs5.close();

            ResultSet rs6 = st.executeQuery("SELECT * FROM bus B INNER JOIN model M ON B.Model = M.IdModel INNER JOIN company C ON B.PropertyOf = C.IdCompany;");
            DefaultTableModel table3 = (DefaultTableModel) BssTable.getModel();

            while (rs6.next()) {
                String model = rs6.getString("M.Name");
                String marca = rs6.getString("M.Brand");
                String company = rs6.getString("C.Name");
                String Row[] = new String[]{marca + " " + model, company};
                table3.addRow(Row);
            }
            rs6.close();

            ResultSet rs7 = st.executeQuery("SELECT * FROM travel T INNER JOIN bus B ON T.Bus = B.IdBus INNER JOIN model M ON B.Model = M.IdModel;");
            DefaultTableModel table4 = (DefaultTableModel) TrvsTable.getModel();
            TableColumnModel columnModel = TrvsTable.getColumnModel();

            columnModel.getColumn(0).setPreferredWidth(130);
            columnModel.getColumn(1).setPreferredWidth(80);
            columnModel.getColumn(2).setPreferredWidth(5);

            while (rs7.next()) {
                String destino = rs7.getString("T.Destination");
                String model = rs7.getString("M.Name");
                String marca = rs7.getString("M.Brand");
                String precio = rs7.getString("T.Price");
                String Row[] = new String[]{destino, marca + " " + model, precio};
                table4.addRow(Row);
            }
            rs7.close();

        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
