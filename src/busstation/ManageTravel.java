package busstation;

import static busstation.LogIn.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageTravel extends javax.swing.JFrame {

    public ManageTravel() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        StartConnection();
        ReadDataBase();
        
        try {
            Statement st;
            st = con.createStatement();    
            ResultSet rs = st.executeQuery("SELECT IdBus, Enrollment FROM bus;");
            while(rs.next()){
                BusComboBox.addItem(rs.getString("IdBus")+"-"+rs.getString("Enrollment"));
            }
        }catch (SQLException ex) {}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SourceTextField = new javax.swing.JTextField();
        DestinationTextField = new javax.swing.JTextField();
        PriceTextField = new javax.swing.JTextField();
        ExitButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        BusComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TravelTable = new javax.swing.JTable();
        SourceLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        DestinationLabel = new javax.swing.JLabel();
        BusLabel = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        TittleLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BusStation Pátzcuaro: Admin de viajes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SourceTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SourceTextField.setToolTipText("Escribe aquí el lugar de origen del viaje.");
        SourceTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(SourceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 30));

        DestinationTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DestinationTextField.setToolTipText("Escribe aquí el lugar de destino del viaje.");
        DestinationTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(DestinationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 200, 30));

        PriceTextField.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PriceTextField.setToolTipText("Escribe aquí el precio del viaje.");
        PriceTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 1, true));
        getContentPane().add(PriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 200, 30));

        ExitButton.setBackground(new java.awt.Color(255, 153, 153));
        ExitButton.setText("CERRAR");
        ExitButton.setToolTipText("Click aquí para cerrar la ventana.");
        ExitButton.setBorder(null);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 60, 20));

        ModifyButton.setBackground(new java.awt.Color(102, 153, 255));
        ModifyButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        ModifyButton.setText("MODIFICAR");
        ModifyButton.setToolTipText("Click aquí para modificar el viaje seleccionado.");
        ModifyButton.setBorder(null);
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 170, 30));

        DeleteButton.setBackground(new java.awt.Color(255, 153, 153));
        DeleteButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DeleteButton.setText("ELIMINAR");
        DeleteButton.setToolTipText("Click aquí para eliminar el viaje seleccionado.");
        DeleteButton.setBorder(null);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 170, 30));

        AddButton.setBackground(new java.awt.Color(153, 255, 153));
        AddButton.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        AddButton.setText("AGREGAR");
        AddButton.setToolTipText("Click aquí para agregar un nuevo viaje con los datos proporcionados.");
        AddButton.setBorder(null);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 170, 30));

        BusComboBox.setBackground(new java.awt.Color(102, 153, 255));
        BusComboBox.setToolTipText("Seleccion aquí el bus que hara el viaje.");
        getContentPane().add(BusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 200, 30));

        TravelTable.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        TravelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Origen", "Destino", "Autobus", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TravelTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 660, 170));

        SourceLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        SourceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SourceLabel.setText("Origen:");
        getContentPane().add(SourceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 30));

        PriceLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PriceLabel.setText("Precio:");
        getContentPane().add(PriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 200, 30));

        DestinationLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        DestinationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DestinationLabel.setText("Destino:");
        getContentPane().add(DestinationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, 30));

        BusLabel.setFont(new java.awt.Font("HelvLight", 0, 12)); // NOI18N
        BusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusLabel.setText("Autobus:");
        getContentPane().add(BusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 200, 30));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo480.jpg"))); // NOI18N
        Logo.setToolTipText("");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 680, 40));

        TittleLabel.setFont(new java.awt.Font("HelvLight", 1, 14)); // NOI18N
        TittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TittleLabel.setText("Registro y administracion de Viajes");
        getContentPane().add(TittleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteSolidBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 680, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ReadDataBase(){
        int i=0;
        int rn = TravelTable.getRowCount();
        DefaultTableModel table = (DefaultTableModel) TravelTable.getModel();
        while(i<rn){
            table.removeRow(0);
            i++;
        }
        try {
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM travel;");
            while(rs.next()){
                String Row[] = new String[]{rs.getString("IdTravel"), rs.getString("Source"),
                rs.getString("Destination"), rs.getString("Bus"), rs.getString("Price")};
                table.addRow(Row);
            }
        } catch (SQLException ex) {}
    }
    
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
        MasterMenu.F = false;
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        int i = TravelTable.getSelectedRow();
        if(i == -1) JOptionPane.showMessageDialog(null,"No has seleccionado nada","Error",JOptionPane.ERROR_MESSAGE);
        else{
            try {
                int id = Integer.parseInt(TravelTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();    
                st.executeUpdate("UPDATE travel SET Source='"+SourceTextField.getText()+"', Destination='"+
                DestinationTextField.getText()+"', Bus="+BusComboBox.getSelectedItem().toString().substring(0,1)+", Price="+
                PriceTextField.getText()+" WHERE IdTravel="+id);
                ReadDataBase();
                JOptionPane.showMessageDialog(null,"Se Actualizaron los datos del viajes","Listo",JOptionPane.INFORMATION_MESSAGE);
            }catch (SQLException ex) {}
        }
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int i = TravelTable.getSelectedRow();
        if(i == -1) JOptionPane.showMessageDialog(null,"No has seleccionado nada","Error",JOptionPane.ERROR_MESSAGE);
        else{
            try {
                int id = Integer.parseInt(TravelTable.getValueAt(i, 0).toString());
                Statement st;
                st = con.createStatement();    
                st.executeUpdate("DELETE FROM travel WHERE IdTravel="+id);
                DefaultTableModel table = (DefaultTableModel) TravelTable.getModel();
                table.removeRow(i);
                JOptionPane.showMessageDialog(null,"Se elimino del catalogo de viajes","Listo",JOptionPane.INFORMATION_MESSAGE);
            }catch (SQLException ex) {}
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try {
                Statement st = con.createStatement();
                if("".equals(SourceTextField.getText())||"".equals(PriceTextField.getText())
                ||"".equals(DestinationTextField.getText())){
                    JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    //INSERT INTO `travel` (`IdTravel`, `Source`, `Destination`, `Bus`, `Price`) VALUES (NULL, 'more', 'patz', '1', '20');
                    st.execute("INSERT INTO `travel` (`IdTravel`, `Source`, `Destination`, `Bus`, `Price`) "
                    +"VALUES (NULL,'"+SourceTextField.getText()+"','"+DestinationTextField.getText()+"',"+
                    BusComboBox.getSelectedItem().toString().substring(0, 1) +","+PriceTextField.getText()+");");
                    JOptionPane.showMessageDialog(null,"El viaje ha sido añadido al catalogo","Listo",JOptionPane.INFORMATION_MESSAGE);
                    ReadDataBase();
                }
            } catch (SQLException ex) {System.out.println(BusComboBox.getSelectedItem().toString().substring(0, 1));}
    }//GEN-LAST:event_AddButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageTravel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageTravel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> BusComboBox;
    private javax.swing.JLabel BusLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JTextField DestinationTextField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JLabel SourceLabel;
    private javax.swing.JTextField SourceTextField;
    private javax.swing.JLabel TittleLabel;
    private javax.swing.JTable TravelTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
