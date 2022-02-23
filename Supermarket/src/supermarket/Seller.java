/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.HeadlessException;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anpka
 */
public final class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        SelectSeller();
    }
    
    public void SelectSeller()     
    {
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
             Statement st=con.createStatement();
             String q="select * from sellertable";
             PreparedStatement table_add=con.prepareStatement(q);
             ResultSet rs=table_add.executeQuery();
             
             seller_table.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
    }


    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        seller_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        seller_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        seller_password = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        seller_gender = new javax.swing.JComboBox<>();
        Add_seller = new javax.swing.JButton();
        delete_seller = new javax.swing.JButton();
        edit_seller = new javax.swing.JButton();
        clear_seller = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        seller_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 25, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("MANAGE SELLER");

        seller_id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        seller_id.setForeground(new java.awt.Color(0, 55, 255));
        seller_id.setToolTipText("");
        seller_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("SELLER_ID");

        seller_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        seller_name.setForeground(new java.awt.Color(0, 55, 255));
        seller_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("NAME");

        seller_password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        seller_password.setForeground(new java.awt.Color(0, 55, 255));
        seller_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_passwordActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("PASSWORD");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("GENDER");

        seller_gender.setBackground(new java.awt.Color(51, 255, 255));
        seller_gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seller_gender.setForeground(new java.awt.Color(0, 51, 255));
        seller_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        seller_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seller_genderActionPerformed(evt);
            }
        });

        Add_seller.setBackground(new java.awt.Color(0, 51, 255));
        Add_seller.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add_seller.setForeground(new java.awt.Color(255, 255, 255));
        Add_seller.setText("ADD");
        Add_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_sellerMouseClicked(evt);
            }
        });
        Add_seller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_sellerActionPerformed(evt);
            }
        });

        delete_seller.setBackground(new java.awt.Color(0, 51, 255));
        delete_seller.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete_seller.setForeground(new java.awt.Color(255, 255, 255));
        delete_seller.setText("DELETE");
        delete_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_sellerMouseClicked(evt);
            }
        });

        edit_seller.setBackground(new java.awt.Color(0, 51, 255));
        edit_seller.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        edit_seller.setForeground(new java.awt.Color(255, 255, 255));
        edit_seller.setText("EDIT");
        edit_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_sellerMouseClicked(evt);
            }
        });
        edit_seller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_sellerActionPerformed(evt);
            }
        });

        clear_seller.setBackground(new java.awt.Color(0, 51, 255));
        clear_seller.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear_seller.setForeground(new java.awt.Color(255, 255, 255));
        clear_seller.setText("CLEAR");
        clear_seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_sellerMouseClicked(evt);
            }
        });

        seller_table.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        seller_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "PASSWORD", "NAME", "GENDER"
            }
        ));
        seller_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        seller_table.setRowHeight(25);
        seller_table.setSelectionBackground(new java.awt.Color(0, 55, 255));
        seller_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seller_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(seller_table);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("SELLER LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seller_password, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seller_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seller_name)
                            .addComponent(seller_gender, 0, 131, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(Add_seller)
                .addGap(18, 18, 18)
                .addComponent(edit_seller)
                .addGap(61, 61, 61)
                .addComponent(delete_seller)
                .addGap(35, 35, 35)
                .addComponent(clear_seller)
                .addGap(121, 121, 121))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seller_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seller_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seller_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seller_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_seller)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delete_seller)
                        .addComponent(clear_seller)
                        .addComponent(edit_seller)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seller_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seller_idActionPerformed

    private void seller_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seller_nameActionPerformed

    private void seller_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seller_passwordActionPerformed

    private void seller_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seller_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seller_genderActionPerformed

    private void Add_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_sellerMouseClicked
       if(seller_id.getText().isEmpty()||seller_name.getText().isEmpty()||seller_password.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else if(seller_gender.getSelectedIndex()==0)
       {
           JOptionPane.showMessageDialog(this, "Select Gender");
       }
       else{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
            String sql="insert into sellertable values(?,?,?,?)";
            PreparedStatement add=con.prepareStatement(sql);
            add.setInt(1,Integer.valueOf(seller_id.getText()));
            add.setString(2,seller_name.getText());
            add.setString(3,seller_password.getText());
            add.setString(4,seller_gender.getSelectedItem().toString());
            int executeUpdate = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "New Seller Add sucessfully");
            con.close();
            SelectSeller();
           
            
        }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
        }
       }
    }//GEN-LAST:event_Add_sellerMouseClicked

    private void seller_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seller_tableMouseClicked
            DefaultTableModel model=(DefaultTableModel)seller_table.getModel();
           int Myindex=seller_table.getSelectedRow();
            seller_id.setText(model.getValueAt(Myindex,0).toString());
            seller_name.setText(model.getValueAt(Myindex,1).toString());
            seller_password.setText(model.getValueAt(Myindex,2 ).toString());
          String gender=model.getValueAt(Myindex, 3).toString();
          switch(gender){
              case "Male":
                  seller_gender.setSelectedIndex(1);
                  break;
              case "Female":
                  seller_gender.setSelectedIndex(2);
                  break;
          }
            
            
    }//GEN-LAST:event_seller_tableMouseClicked

    private void clear_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_sellerMouseClicked
        seller_id.setText("");
        seller_name.setText("");
        seller_password.setText("");
        seller_gender.setSelectedIndex(0);
    }//GEN-LAST:event_clear_sellerMouseClicked

    private void delete_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_sellerMouseClicked
        if(seller_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the seller to be deleted");
            
        }
        else
        {
            try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
            String sid=seller_id.getText();
            String delete_query="delete from supermarket.sellertable where seller_id="+sid;
            Statement delete=con.createStatement();
            delete.executeUpdate(delete_query);
            SelectSeller();
            JOptionPane.showMessageDialog(this, "Seller deleted sucessfully");
                        
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_delete_sellerMouseClicked

    private void edit_sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_sellerMouseClicked
        if(seller_id.getText().isEmpty()||seller_name.getText().isEmpty()||seller_password.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
            String update_query="update supermarket.sellertable set seller_name='"+seller_name.getText()+"'"+",seller_password='"+seller_password.getText()+"'"+",seller_gender='"+seller_gender.getSelectedItem().toString()+"'"+"where seller_id="+seller_id.getText();
            PreparedStatement update=con.prepareStatement(update_query);
             
            int executeUpdate = update.executeUpdate();
            SelectSeller();
            JOptionPane.showMessageDialog(this, "Seller sucessfully updated");
            con.close();
               
        }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
        }
       }
    }//GEN-LAST:event_edit_sellerMouseClicked

    private void Add_sellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_sellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_sellerActionPerformed

    private void edit_sellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_sellerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_sellerActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    
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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Seller().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_seller;
    private javax.swing.JButton clear_seller;
    private javax.swing.JButton delete_seller;
    private javax.swing.JButton edit_seller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seller_gender;
    private javax.swing.JTextField seller_id;
    private javax.swing.JTextField seller_name;
    private javax.swing.JTextField seller_password;
    private javax.swing.JTable seller_table;
    // End of variables declaration//GEN-END:variables
}