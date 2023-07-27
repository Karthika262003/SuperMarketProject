
package market;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MPFr extends javax.swing.JFrame {

    public MPFr() {
        initComponents();
        setResizable(false);
        SelectSeller();
        GetCat();
    }
String url,uname,pwd;
Connection con;
Statement st;
ResultSet rs;
PreparedStatement pr;
public void SelectSeller(){
    try{
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String  qry=("Select * from producttb;");
      pr=con.prepareStatement(qry);
      rs= pr.executeQuery(qry);
      DefaultTableModel dtb=(DefaultTableModel)ProductTb1.getModel();
      while(rs.next()){
        dtb.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
    }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
}
private void GetCat(){
    try{
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String  qry=("Select * from categorytb;");
      pr=con.prepareStatement(qry);
      rs=pr.executeQuery(qry);
      while(rs.next()){
          String Mycat=rs.getString("CatName");
          ProCat.addItem(Mycat);
      }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panels2 = new market.panels();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProName = new javax.swing.JTextField();
        ProId = new javax.swing.JTextField();
        ProPrice = new javax.swing.JTextField();
        ProQty = new javax.swing.JTextField();
        editbtn = new market.Btns();
        deletebtn = new market.Btns();
        clrbtn = new market.Btns();
        addbtn = new market.Btns();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTb1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        ProCat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panels2.setColor1("#20e3b2");
        panels2.setColor2("#06beb6");
        panels2.setPreferredSize(new java.awt.Dimension(1341, 688));
        panels2.setSide(980);

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CATEGORIES");
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ProductId ");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name ");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quantity ");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Category ");

        ProName.setBackground(new java.awt.Color(204, 204, 204));
        ProName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ProId.setBackground(new java.awt.Color(204, 204, 204));
        ProId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ProPrice.setBackground(new java.awt.Color(204, 204, 204));
        ProPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ProQty.setBackground(new java.awt.Color(204, 204, 204));
        ProQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setColor("#D76D77");
        editbtn.setColor2("#EB5757");
        editbtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        editbtn.setLabel("EDIT");
        editbtn.setRadius(50);
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });

        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setColor("#D76D77");
        deletebtn.setColor2("#EB5757");
        deletebtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        deletebtn.setLabel("DELETE");
        deletebtn.setRadius(50);
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        clrbtn.setForeground(new java.awt.Color(255, 255, 255));
        clrbtn.setColor("#D76D77");
        clrbtn.setColor2("#EB5757");
        clrbtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        clrbtn.setLabel("CLEAR");
        clrbtn.setRadius(50);
        clrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrbtnMouseClicked(evt);
            }
        });
        clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtnActionPerformed(evt);
            }
        });

        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.setColor("#D76D77");
        addbtn.setColor2("#EB5757");
        addbtn.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        addbtn.setRadius(50);
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        ProductTb1.setBackground(new java.awt.Color(230, 252, 255));
        ProductTb1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        ProductTb1.setForeground(new java.awt.Color(153, 0, 153));
        ProductTb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTb1.setGridColor(new java.awt.Color(204, 204, 255));
        ProductTb1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTb1.setRowHeight(30);
        ProductTb1.setSelectionBackground(new java.awt.Color(255, 153, 255));
        ProductTb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTb1);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Price ");

        ProCat.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MANAGE PRODUCTS .....");
        jLabel7.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(153, 204, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SELLER");
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("LogOut");

        javax.swing.GroupLayout panels2Layout = new javax.swing.GroupLayout(panels2);
        panels2.setLayout(panels2Layout);
        panels2Layout.setHorizontalGroup(
            panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels2Layout.createSequentialGroup()
                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panels2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panels2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panels2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161))))
            .addGroup(panels2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panels2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))
                    .addGroup(panels2Layout.createSequentialGroup()
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panels2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProQty, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProId, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panels2Layout.setVerticalGroup(
            panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panels2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panels2Layout.createSequentialGroup()
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panels2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panels2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ProQty, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)))
                        .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panels2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panels2, javax.swing.GroupLayout.DEFAULT_SIZE, 1452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panels2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clrbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrbtnMouseClicked
    ProId.setText("");
    ProName.setText("");
    ProQty.setText("");
    ProPrice.setText("");
    ProId.setFocusable(true);
    }//GEN-LAST:event_clrbtnMouseClicked

    private void clrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clrbtnActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
         if(ProId.getText().isEmpty()||ProName.getText().isEmpty()||ProQty.getText().isEmpty()||ProPrice.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Missing Information");   
      }
      else{
      try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
       String qry="Insert Into producttb(ProdId,ProdName,ProdQty,ProdPrice,ProdCat) values(?,?,?,?,?)";
      pr=con.prepareStatement(qry);
      pr.setInt(1, Integer.valueOf(ProId.getText()));
      pr.setString(2,ProName.getText());
      pr.setInt(3, Integer.valueOf(ProQty.getText()));
      pr.setInt(4, Integer.valueOf(ProPrice.getText()));
      pr.setString(5, ProCat.getSelectedItem().toString());
      int row=pr.executeUpdate();
      JOptionPane.showMessageDialog(this, "Product Successfully Added");
      con.close();
      SelectSeller();
      }catch(Exception ex){
        System.out.println(ex);
    }
    }              
    }//GEN-LAST:event_addbtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        if(ProId.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Product To Be Deleted");

        }else{
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String PId=ProId.getText();
      String  qry="delete from producttb where ProdId="+PId;
      pr=con.prepareStatement(qry);
      pr.executeUpdate(qry);
      SelectSeller();
        JOptionPane.showMessageDialog(this, "Product Deleted Successfully");
        } 
        catch(Exception ex){
              System.out.println(ex);
        }
    }                                                               

    }//GEN-LAST:event_deletebtnMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        if(ProId.getText().isEmpty()||ProName.getText().isEmpty()||ProQty.getText().isEmpty()||ProPrice.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try{
               Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String PId=ProId.getText();
      String  qry="update  producttb set  ProdName='"+ProName.getText()+"'"+",ProdQty='"+ProQty.getText()+"'"+",ProdPrice='"+ProPrice.getText()+"'"+",ProdCat='"+ProCat.getSelectedItem().toString()+"'"+"where ProdId="+ProId.getText();
      pr=con.prepareStatement(qry);
      pr.executeUpdate(qry);
      SelectSeller();
        JOptionPane.showMessageDialog(this, "Products Updated");
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void ProductTb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTb1MouseClicked
      DefaultTableModel model=(DefaultTableModel)ProductTb1.getModel();
      int Myindex=ProductTb1.getSelectedRow();
      ProId.setText(model.getValueAt(Myindex,0).toString());
      ProName.setText(model.getValueAt(Myindex,1).toString());
      ProQty.setText(model.getValueAt(Myindex,2).toString());
      ProPrice.setText(model.getValueAt(Myindex,3).toString());      
    }//GEN-LAST:event_ProductTb1MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new BillFr().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new CategoryFr1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(MPFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MPFr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ProCat;
    private javax.swing.JTextField ProId;
    private javax.swing.JTextField ProName;
    private javax.swing.JTextField ProPrice;
    private javax.swing.JTextField ProQty;
    private javax.swing.JTable ProductTb1;
    private market.Btns addbtn;
    private market.Btns clrbtn;
    private market.Btns deletebtn;
    private market.Btns editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private market.panels panels2;
    // End of variables declaration//GEN-END:variables
}
