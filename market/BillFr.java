/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BillFr extends javax.swing.JFrame {

    public BillFr() {
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
      rs=pr.executeQuery(qry);
       DefaultTableModel dtb=(DefaultTableModel)ProductTb.getModel();
     while(rs.next()){
        dtb.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
    }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
}
int PrId,newQty;
public void update(){
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String  qry="update  producttb set  ProdQty='"+newQty+""+"where ProdId="+PrId;
      pr=con.prepareStatement(qry);
      pr.executeUpdate(qry);
      SelectSeller();
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
      pr.executeQuery(qry);
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

        panels6 = new market.panels();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ProName = new javax.swing.JTextField();
        BillId = new javax.swing.JTextField();
        ProQty = new javax.swing.JTextField();
        editbtn3 = new market.Btns();
        deletebtn3 = new market.Btns();
        clrbtn3 = new market.Btns();
        addbtn3 = new market.Btns();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProductTb = new javax.swing.JTable();
        ProCat = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        Billtxt = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        GrdTot = new javax.swing.JLabel();
        btns1 = new market.Btns();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panels6.setColor1("#94bbe9");
        panels6.setColor2("#96DEDA");
        panels6.setSide(980);

        jLabel19.setBackground(new java.awt.Color(153, 204, 255));
        jLabel19.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("BILLING CENTER");
        jLabel19.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Bill Id :");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Name :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Quantity :");

        ProName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        BillId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ProQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        editbtn3.setText("PRINT");
        editbtn3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        editbtn3.setRadius(50);
        editbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtn3MouseClicked(evt);
            }
        });

        deletebtn3.setText("REFRESH");
        deletebtn3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        deletebtn3.setRadius(50);
        deletebtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtn3MouseClicked(evt);
            }
        });

        clrbtn3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        clrbtn3.setLabel("CLEAR");
        clrbtn3.setRadius(50);
        clrbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrbtn3MouseClicked(evt);
            }
        });
        clrbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtn3ActionPerformed(evt);
            }
        });

        addbtn3.setText(" ADD TO BILL");
        addbtn3.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        addbtn3.setRadius(50);
        addbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtn3MouseClicked(evt);
            }
        });
        addbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn3ActionPerformed(evt);
            }
        });

        ProductTb.setBackground(new java.awt.Color(230, 252, 255));
        ProductTb.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        ProductTb.setForeground(new java.awt.Color(153, 0, 153));
        ProductTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        ProductTb.setGridColor(new java.awt.Color(204, 204, 255));
        ProductTb.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ProductTb.setRowHeight(30);
        ProductTb.setSelectionBackground(new java.awt.Color(255, 153, 255));
        ProductTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTbMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ProductTb);

        ProCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProCatItemStateChanged(evt);
            }
        });
        ProCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProCatMouseClicked(evt);
            }
        });

        Billtxt.setColumns(20);
        Billtxt.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Billtxt.setRows(5);
        jScrollPane5.setViewportView(Billtxt);

        jLabel25.setBackground(new java.awt.Color(153, 204, 255));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("LOGOUT");
        jLabel25.setToolTipText("");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        GrdTot.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        GrdTot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GrdTot.setText("RS");

        btns1.setText("Filter");
        btns1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btns1.setRadius(30);
        btns1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btns1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panels6Layout = new javax.swing.GroupLayout(panels6);
        panels6.setLayout(panels6Layout);
        panels6Layout.setHorizontalGroup(
            panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panels6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clrbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(addbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 226, Short.MAX_VALUE))
            .addGroup(panels6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels6Layout.createSequentialGroup()
                        .addComponent(GrdTot, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(editbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
            .addGroup(panels6Layout.createSequentialGroup()
                .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProQty, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btns1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(deletebtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panels6Layout.setVerticalGroup(
            panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panels6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels6Layout.createSequentialGroup()
                .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BillId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clrbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panels6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addGroup(panels6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrdTot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panels6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panels6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtn3MouseClicked
        try {
            Billtxt.print();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_editbtn3MouseClicked

    private void deletebtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtn3MouseClicked
       SelectSeller();       
    }//GEN-LAST:event_deletebtn3MouseClicked

    private void clrbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrbtn3MouseClicked
        BillId.setText(" ");
        ProName.setText(" ");
        ProQty.setText(" ");
        BillId.setFocusable(true);
    }//GEN-LAST:event_clrbtn3MouseClicked
Double UPrice,ProTotal=0.0,GrdTotal=0.0;
int AvailQty;
    private void clrbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clrbtn3ActionPerformed
int i=0;
    private void addbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtn3MouseClicked
          if(ProQty.getText().isEmpty()||ProName.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Missing Information");
          }
          else if(AvailQty<=Integer.valueOf(ProQty.getText())){
              JOptionPane.showMessageDialog(this, "Not Enough In Stock");
          }
          else{
              i++;
              ProTotal =UPrice*Double.valueOf(ProQty.getText());
              GrdTotal=GrdTotal+ProTotal;
              if(i==1){
                  Billtxt.setText(Billtxt.getText()+"       **********************   RANI SUPERMARKET ***************** \n"+"NUM           PRODUCT           PRICE           QUANTITY          TOTAL\n"+i+"        "+ProName.getText()+"         "+UPrice+"        "+ProQty.getText()+"        "+ProTotal+"\n\t");
              }
              else{
                Billtxt.setText(Billtxt.getText()+i+"             "+ProName.getText()+"               "+UPrice+"                   "+ProQty.getText()+"                "+ProTotal+"\n");
              }
              GrdTot.setText("RS"+GrdTotal);
              update();
          }
    }//GEN-LAST:event_addbtn3MouseClicked

    private void ProductTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTbMouseClicked
       DefaultTableModel model=(DefaultTableModel)ProductTb.getModel();
      int Myindex=ProductTb.getSelectedRow();
      BillId.setText(model.getValueAt(Myindex,0).toString());
      ProName.setText(model.getValueAt(Myindex,1).toString());
      ProQty.setText(model.getValueAt(Myindex,2).toString());
//      AvailQty=Integer.valueOf(model.getValueAt(Myindex, 2).toString());
      UPrice=Double.valueOf(model.getValueAt(Myindex, 3).toString());
      newQty=AvailQty-Integer.valueOf(ProQty.getText());
      ProTotal=UPrice*Integer.valueOf(ProQty.getText());
    }//GEN-LAST:event_ProductTbMouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        new LoginFr().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void ProCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProCatMouseClicked
 
    }//GEN-LAST:event_ProCatMouseClicked

    private void ProCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProCatItemStateChanged
         try{
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String  qry=("Select * from categorytb where CatName='"+ProCat.getSelectedItem().toString()+"'");
      pr=con.prepareStatement(qry);
       DefaultTableModel dtb=(DefaultTableModel)ProductTb.getModel();
     while(rs.next()){
        dtb.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
    }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    }//GEN-LAST:event_ProCatItemStateChanged

    private void btns1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btns1MouseClicked
         try{
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
      String  qry=("Select * from categorytb where CatName='"+ProCat.getSelectedItem().toString()+"'");
      pr=con.prepareStatement(qry);
       DefaultTableModel dtb=(DefaultTableModel)ProductTb.getModel();
     while(rs.next()){
        dtb.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
    }
    }
    catch(Exception ex){
        System.out.println(ex);
    }
    }//GEN-LAST:event_btns1MouseClicked

    private void addbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(BillFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillFr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillId;
    private javax.swing.JTextArea Billtxt;
    private javax.swing.JLabel GrdTot;
    private javax.swing.JComboBox<String> ProCat;
    private javax.swing.JTextField ProName;
    private javax.swing.JTextField ProQty;
    private javax.swing.JTable ProductTb;
    private market.Btns addbtn3;
    private market.Btns btns1;
    private market.Btns clrbtn3;
    private market.Btns deletebtn3;
    private market.Btns editbtn3;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private market.panels panels6;
    // End of variables declaration//GEN-END:variables
}
