/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sitin
 */
public class AplikasiBangunDatar extends javax.swing.JFrame {
    public AplikasiBangunDatar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bPersegiPanjang = new javax.swing.JButton();
        bSegitiga = new javax.swing.JButton();
        bLingkaran = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Aplikasi Bangun Datar");

        bPersegiPanjang.setBackground(new java.awt.Color(255, 204, 204));
        bPersegiPanjang.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        bPersegiPanjang.setText("Persegi Panjang");
        bPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersegiPanjangActionPerformed(evt);
            }
        });

        bSegitiga.setBackground(new java.awt.Color(255, 204, 204));
        bSegitiga.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        bSegitiga.setText("Segitiga");
        bSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegitigaActionPerformed(evt);
            }
        });

        bLingkaran.setBackground(new java.awt.Color(255, 204, 204));
        bLingkaran.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        bLingkaran.setText("Lingkaran");
        bLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLingkaranActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTutup)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bPersegiPanjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSegitiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bLingkaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bPersegiPanjang)
                .addGap(18, 18, 18)
                .addComponent(bSegitiga)
                .addGap(18, 18, 18)
                .addComponent(bLingkaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(bTutup)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegitigaActionPerformed
        // TODO add your handling code here:
        new frameSegitiga().setVisible(true);
    }//GEN-LAST:event_bSegitigaActionPerformed

    private void bPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersegiPanjangActionPerformed
        // TODO add your handling code here:
        new framePersegiPanjang().setVisible(true);
    }//GEN-LAST:event_bPersegiPanjangActionPerformed

    private void bLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLingkaranActionPerformed
        // TODO add your handling code here:
        new frameLingkaran().setVisible(true);
    }//GEN-LAST:event_bLingkaranActionPerformed

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bTutupActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiBangunDatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLingkaran;
    private javax.swing.JButton bPersegiPanjang;
    private javax.swing.JButton bSegitiga;
    private javax.swing.JButton bTutup;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
