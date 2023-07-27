
package market;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class LoginFr extends javax.swing.JFrame {

    public LoginFr() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        panels3 = new market.panels();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Roles = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Uid = new javax.swing.JTextField();
        btns1 = new market.Btns();
        btns2 = new market.Btns();
        pw = new javax.swing.JPasswordField();
        panels1 = new market.panels();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ProductId :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(1341, 688));

        panels3.setColor1("#5959b6");
        panels3.setColor2("#00d4ff");
        panels3.setPreferredSize(new java.awt.Dimension(13401, 688));
        panels3.setRequestFocusEnabled(false);
        panels3.setSide(1000);
        panels3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN HERE....");
        jLabel1.setToolTipText("");
        panels3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 420, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password ");
        panels3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 170, 47));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("User Id  ");
        panels3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 170, 50));

        Roles.setBackground(new java.awt.Color(204, 204, 255));
        Roles.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "SELLER" }));
        panels3.add(Roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 260, 51));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Select Role ");
        panels3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 170, 50));

        Uid.setBackground(new java.awt.Color(204, 204, 255));
        Uid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        panels3.add(Uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 260, 47));

        btns1.setForeground(new java.awt.Color(255, 255, 255));
        btns1.setText("CLEAR");
        btns1.setColor("#f7797d");
        btns1.setColor2("#FF0099");
        btns1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btns1.setRadius(50);
        btns1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btns1MouseClicked(evt);
            }
        });
        panels3.add(btns1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 157, 50));

        btns2.setForeground(new java.awt.Color(255, 255, 255));
        btns2.setText("LOGIN");
        btns2.setColor("#f7797d");
        btns2.setColor2("#FF0099");
        btns2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btns2.setRadius(50);
        btns2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btns2MouseClicked(evt);
            }
        });
        panels3.add(btns2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 155, 50));

        pw.setBackground(new java.awt.Color(204, 204, 255));
        pw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        panels3.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 260, 50));

        panels1.setColor1("#00d4ff");
        panels1.setColor2("#5959b6");
        panels1.setSide(900);

        jLabel6.setBackground(new java.awt.Color(153, 204, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NICE ");
        jLabel6.setToolTipText("");

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EVERY PRODUCT");
        jLabel7.setToolTipText("");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Desktop\\HTML Projects\\Images\\icon.jpg")); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout panels1Layout = new javax.swing.GroupLayout(panels1);
        panels1.setLayout(panels1Layout);
        panels1Layout.setHorizontalGroup(
            panels1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panels1Layout.createSequentialGroup()
                .addGroup(panels1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panels1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panels1Layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panels1Layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        panels1Layout.setVerticalGroup(
            panels1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panels1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panels3, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panels1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panels3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//String url,uname,pwd;
Connection con;
Statement st;
ResultSet rs;
PreparedStatement pr;
    private void btns2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btns2MouseClicked
        if(Roles.getSelectedItem().toString().equals("SELLER")){
        String Query="select *from sellertb1 where SelName='"+Uid.getText()+"'and SelPW='"+pw.getText()+"'";
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
        pr=con.prepareStatement(Query);
       rs= pr.executeQuery(Query);
           if(rs.next()){
              new BillFr().setVisible(true);
              this.dispose();
           }
            else{
               JOptionPane.showMessageDialog(this, "Wrong Seller Id Or Password");
            }
        } 
        catch (Exception ex) {
              System.out.println(ex);
        }
    }
        
    else{
        String Query="select *from admintb where adName='"+Uid.getText()+"'and adPass='"+pw.getText()+"'";
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market","suba","232266");
        pr=con.prepareStatement(Query);
        rs=pr.executeQuery(Query);
        if(rs.next()){
            new MPFr().setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Wrong Admin Id Or Password");
        }
    } 
    catch (SQLException ex) {
          System.out.println(ex);
    }
    }   
    }//GEN-LAST:event_btns2MouseClicked

    private void btns1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btns1MouseClicked
       Uid.setText(" ");
      Roles.setFocusable(true);
    }//GEN-LAST:event_btns1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

              new LoginFr().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Roles;
    private javax.swing.JTextField Uid;
    private market.Btns btns1;
    private market.Btns btns2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private market.panels panels1;
    private market.panels panels3;
    private javax.swing.JPasswordField pw;
    // End of variables declaration//GEN-END:variables
}
