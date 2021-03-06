/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anpka
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        SelectProduct();
        GetCategory();
    }
     public void SelectProduct()     
    {
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
             Statement st=con.createStatement();
             String q="select * from producttable";
             PreparedStatement table_add=con.prepareStatement(q);
             ResultSet rs=table_add.executeQuery();
             product_table.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
    }
     private void GetCategory()
     {
         try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
             Statement st=con.createStatement();
             String q="select * from categorytable";
             PreparedStatement table_add=con.prepareStatement(q);
             ResultSet rs=table_add.executeQuery();
            while(rs.next())
            {
                String MyCategory=rs.getString("category_name");
                product_category.addItem(MyCategory);
            }
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
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
        Update_product = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        product_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        product_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        product_quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        product_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        product_category = new javax.swing.JComboBox<>();
        Delete_product = new javax.swing.JButton();
        Upadte_product = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Product_add = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        categories = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 25, 255));

        Update_product.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("MANAGE PRODUCTS");

        product_id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        product_id.setForeground(new java.awt.Color(0, 55, 255));
        product_id.setToolTipText("");
        product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("PRODUCT_ID");

        product_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        product_name.setForeground(new java.awt.Color(0, 55, 255));
        product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("NAME");

        product_quantity.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        product_quantity.setForeground(new java.awt.Color(0, 55, 255));
        product_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_quantityActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("QUANTITY");

        product_price.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        product_price.setForeground(new java.awt.Color(0, 55, 255));
        product_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_priceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("CATEGORY");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("PRICE");

        product_category.setBackground(new java.awt.Color(51, 255, 255));
        product_category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        product_category.setForeground(new java.awt.Color(0, 51, 255));
        product_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        product_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_categoryActionPerformed(evt);
            }
        });

        Delete_product.setBackground(new java.awt.Color(0, 51, 255));
        Delete_product.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Delete_product.setForeground(new java.awt.Color(255, 255, 255));
        Delete_product.setText("DELETE");
        Delete_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_productMouseClicked(evt);
            }
        });

        Upadte_product.setBackground(new java.awt.Color(0, 51, 255));
        Upadte_product.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Upadte_product.setForeground(new java.awt.Color(255, 255, 255));
        Upadte_product.setText("UPDATE");
        Upadte_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Upadte_productMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Upadte_productMouseEntered(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 51, 255));
        Clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("CLEAR");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });

        product_table.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        product_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        product_table.setRowHeight(25);
        product_table.setSelectionBackground(new java.awt.Color(0, 55, 255));
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_table);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("PRODUCT LIST");

        Product_add.setBackground(new java.awt.Color(0, 51, 255));
        Product_add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Product_add.setForeground(new java.awt.Color(255, 255, 255));
        Product_add.setText("ADD");
        Product_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Update_productLayout = new javax.swing.GroupLayout(Update_product);
        Update_product.setLayout(Update_productLayout);
        Update_productLayout.setHorizontalGroup(
            Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Update_productLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Update_productLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(Update_productLayout.createSequentialGroup()
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_name)
                            .addComponent(product_id)
                            .addComponent(product_category, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(113, 113, 113)
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product_price, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(product_quantity))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Update_productLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(Product_add)
                .addGap(33, 33, 33)
                .addComponent(Upadte_product)
                .addGap(46, 46, 46)
                .addComponent(Delete_product)
                .addGap(35, 35, 35)
                .addComponent(Clear)
                .addGap(121, 121, 121))
            .addGroup(Update_productLayout.createSequentialGroup()
                .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Update_productLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(Update_productLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Update_productLayout.setVerticalGroup(
            Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Update_productLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Update_productLayout.createSequentialGroup()
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Update_productLayout.createSequentialGroup()
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_price, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Update_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_product)
                    .addComponent(Clear)
                    .addComponent(Upadte_product)
                    .addComponent(Product_add))
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

        categories.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        categories.setForeground(new java.awt.Color(255, 255, 255));
        categories.setText("CATEGORIES");
        categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoriesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Update_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(459, 459, 459))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(categories, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(353, 353, 353)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Update_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_idActionPerformed

    private void product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_nameActionPerformed

    private void product_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_quantityActionPerformed

    private void product_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_priceActionPerformed

    private void product_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_categoryActionPerformed

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        DefaultTableModel model=(DefaultTableModel)product_table.getModel();
        int Myindex=product_table.getSelectedRow();
        product_id.setText(model.getValueAt(Myindex,0).toString());
        product_name.setText(model.getValueAt(Myindex,1).toString());
        String combo_cat=model.getValueAt(Myindex,2 ).toString();
        for(int i=1;i<product_category.getItemCount();i++)
        {
            if(product_category.getItemAt(i).toString().equalsIgnoreCase(combo_cat))
            {
                product_category.setSelectedIndex(i);
            }
        }
        product_quantity.setText(model.getValueAt(Myindex,3 ).toString());
        product_price.setText(model.getValueAt(Myindex,4 ).toString());
        
    }//GEN-LAST:event_product_tableMouseClicked

    private void Upadte_productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Upadte_productMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Upadte_productMouseEntered

    private void Upadte_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Upadte_productMouseClicked
         if(product_id.getText().isEmpty()||product_name.getText().isEmpty()||product_quantity.getText().isEmpty()||product_price.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
            String update_query="update supermarket.producttable set product_name='"+product_name.getText()+"'"+",product_quantity='"+product_quantity.getText()+"'"+",product_price='"+product_price.getText()+"'"+",product_category='"+product_category.getSelectedItem().toString()+"'"+"where product_id="+product_id.getText();
            PreparedStatement update=con.prepareStatement(update_query);
             
            int executeUpdate = update.executeUpdate();
            SelectProduct();
            JOptionPane.showMessageDialog(this, "Product sucessfully updated");
            con.close();
                
        }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
        }
       }
    }//GEN-LAST:event_Upadte_productMouseClicked

    private void Delete_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_productMouseClicked
        if(product_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the product to be deleted");
            
        }
        else
        {
            try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
            String pid=product_id.getText();
            String delete_query="delete from supermarket.producttable where product_id="+pid;
            Statement delete=con.createStatement();
            delete.executeUpdate(delete_query);
            SelectProduct();
            JOptionPane.showMessageDialog(this, "Product deleted sucessfully");
                        
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Delete_productMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        product_id.setText("");
        product_name.setText("");
        product_quantity.setText("");
        product_price.setText("");
        product_category.setSelectedIndex(0);
    }//GEN-LAST:event_ClearMouseClicked

    private void Product_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_addMouseClicked
       if(product_id.getText().isEmpty()||product_name.getText().isEmpty()||product_quantity.getText().isEmpty()||product_price.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Missing Information");
       }
       else if(product_category.getSelectedIndex()==0)
       {
           JOptionPane.showMessageDialog(this, "Select Category");
       }
       else{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root","");
            String sql="insert into producttable values(?,?,?,?,?)";
            PreparedStatement add=con.prepareStatement(sql);
            add.setInt(1,Integer.valueOf(product_id.getText()));
            add.setString(2,product_name.getText());
            add.setString(3,product_category.getSelectedItem().toString());
            add.setInt(4,Integer.valueOf(product_quantity.getText()));
            add.setInt(5,Integer.valueOf(product_price.getText()));
            
            int executeUpdate = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "New Product Add sucessfully");
            con.close();
            SelectProduct();
           
            
        }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
        {
        }
       }
    }//GEN-LAST:event_Product_addMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
//        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void categoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriesMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoriesMouseClicked

    
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete_product;
    private javax.swing.JButton Product_add;
    private javax.swing.JButton Upadte_product;
    private javax.swing.JPanel Update_product;
    private javax.swing.JLabel categories;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> product_category;
    private javax.swing.JTextField product_id;
    private javax.swing.JTextField product_name;
    private javax.swing.JTextField product_price;
    private javax.swing.JTextField product_quantity;
    private javax.swing.JTable product_table;
    // End of variables declaration//GEN-END:variables
}
