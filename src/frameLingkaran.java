/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sitin
 */
public class frameLingkaran extends javax.swing.JFrame {

    public frameLingkaran() {
        initComponents();
        tLuas.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bHitung = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        tTutup = new javax.swing.JButton();
        tJariJari = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tLuas = new javax.swing.JTextField();
        jLingkaran = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Lingkaran");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel3.setText("Jari jari");

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

        tTutup.setBackground(new java.awt.Color(204, 204, 255));
        tTutup.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        tTutup.setText("Tutup");
        tTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTutupActionPerformed(evt);
            }
        });

        tJariJari.setBackground(new java.awt.Color(255, 204, 204));
        tJariJari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJariJariActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel4.setText("Luas");

        tLuas.setBackground(new java.awt.Color(255, 204, 204));
        tLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLuasActionPerformed(evt);
            }
        });

        jLingkaran.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLingkaran.setForeground(new java.awt.Color(0, 0, 153));
        jLingkaran.setText("Lingkaran");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(bHitung))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(bReset)
                        .addGap(56, 56, 56)
                        .addComponent(tTutup)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLuas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tJariJari))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLingkaran)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLingkaran)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tJariJari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bHitung)
                    .addComponent(tTutup)
                    .addComponent(bReset))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tJariJariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJariJariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJariJariActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        // TODO add your handling code here:
        double r, PHI = 3.14, Luas;
        r = Double.parseDouble(tJariJari.getText()) ;
        Luas = PHI * r * r;
        tLuas.setText(String.valueOf(Luas));
    }//GEN-LAST:event_bHitungActionPerformed

    private void tTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tTutupActionPerformed

    private void tLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLuasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLuasActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        tJariJari.setText(null);
        tLuas.setText("");
    }//GEN-LAST:event_bResetActionPerformed

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
            java.util.logging.Logger.getLogger(frameLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameLingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLingkaran;
    private javax.swing.JTextField tJariJari;
    private javax.swing.JTextField tLuas;
    private javax.swing.JButton tTutup;
    // End of variables declaration//GEN-END:variables
}
