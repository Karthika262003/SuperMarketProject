
package market;

public class ProFr extends javax.swing.JFrame {

    public ProFr() {
        initComponents();
         setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panels1 = new market.panels();
        login1 = new market.Login();
        market1 = new market.Market();
        panels3 = new market.panels();
        jLabel1 = new javax.swing.JLabel();
        pro = new javax.swing.JProgressBar();
        percen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout panels1Layout = new javax.swing.GroupLayout(panels1);
        panels1.setLayout(panels1Layout);
        panels1Layout.setHorizontalGroup(
            panels1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panels1Layout.setVerticalGroup(
            panels1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panels3.setBackground(new java.awt.Color(102, 255, 255));
        panels3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 127, 164), 10));
        panels3.setColor1("#50C9C3");
        panels3.setColor2("#0ABFBC");
        panels3.setSide(830);

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RANI SUPERMARKET");
        jLabel1.setToolTipText("");

        percen.setBackground(new java.awt.Color(153, 204, 255));
        percen.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        percen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percen.setText("%");
        percen.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ELCOT\\Pictures\\supermarket.png")); // NOI18N

        javax.swing.GroupLayout panels3Layout = new javax.swing.GroupLayout(panels3);
        panels3.setLayout(panels3Layout);
        panels3Layout.setHorizontalGroup(
            panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels3Layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addGroup(panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels3Layout.createSequentialGroup()
                        .addComponent(percen, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panels3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))))
        );
        panels3Layout.setVerticalGroup(
            panels3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panels3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(percen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panels3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panels3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {      
        ProFr pr=new ProFr();
        pr.setVisible(true);
        for(int i=pr.pro.getMinimum();i<=pr.pro.getMaximum();i+=5){
        pr.pro.setValue(i);
        pr.pro.setString(""+i+"");
        pr.percen.setText(Integer.toString(i)+"%");
            try {
                Thread.sleep(100);
            }
            catch (Exception ex) {
              
            }
    }
    new LoginFr().setVisible(true);
        pr.dispose();
        
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
            java.util.logging.Logger.getLogger(ProFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProFr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//             new ProFr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private market.Login login1;
    private market.Market market1;
    private market.panels panels1;
    private market.panels panels3;
    private javax.swing.JLabel percen;
    private javax.swing.JProgressBar pro;
    // End of variables declaration//GEN-END:variables
}
