/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sitin
 */
public class frameSegitiga extends javax.swing.JFrame {    
    public frameSegitiga() {
        initComponents();
        tLuas.setEditable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSegitiga = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tAlas = new javax.swing.JTextField();
        tTinggi = new javax.swing.JTextField();
        bHitung = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();
        tLuas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));

        jSegitiga.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jSegitiga.setForeground(new java.awt.Color(0, 0, 153));
        jSegitiga.setText("Segitiga");

        jLabel2.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel2.setText("Alas");

        jLabel3.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel3.setText("Tinggi");

        tAlas.setBackground(new java.awt.Color(255, 204, 204));

        tTinggi.setBackground(new java.awt.Color(255, 204, 204));

        bHitung.setBackground(new java.awt.Color(204, 204, 255));
        bHitung.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(204, 204, 255));
        bReset.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bTutup.setBackground(new java.awt.Color(204, 204, 255));
        bTutup.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        bTutup.setText("Tutup");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        tLuas.setBackground(new java.awt.Color(255, 204, 204));
        tLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLuasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel4.setText("Luas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(bHitung)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(bTutup)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tLuas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tAlas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(tTinggi, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSegitiga)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jSegitiga)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tAlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(bReset)
                    .addComponent(bTutup))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        // TODO add your handling code here:
          dispose();
    }//GEN-LAST:event_bTutupActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        tAlas.setText(null);
        tTinggi.setText(null);
        tLuas.setText("");
    }//GEN-LAST:event_bResetActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        // TODO add your handling code here:
        double Alas,Tinggi, Luas;
        Alas = Double.parseDouble(tAlas.getText()) ;
        Tinggi = Double.parseDouble(tTinggi.getText());
        Luas = 0.5 * Alas * Tinggi;
        tLuas.setText(String.valueOf(Luas));
    }//GEN-LAST:event_bHitungActionPerformed

    private void tLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLuasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLuasActionPerformed

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
            java.util.logging.Logger.getLogger(frameSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameSegitiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTutup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jSegitiga;
    private javax.swing.JTextField tAlas;
    private javax.swing.JTextField tLuas;
    private javax.swing.JTextField tTinggi;
    // End of variables declaration//GEN-END:variables
}
