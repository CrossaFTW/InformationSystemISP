/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komponen;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import sourcecode.pembayaran;
import sourcecode.Icon;

/**
 *
 * @author Z.E.N.S
 */
//asasasasasaasasasasa
public class Pembayaran extends javax.swing.JFrame {

    private pembayaran pmb;
    private Icon ic;

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        ic = new Icon();
        pmb = new pembayaran(0);
        initComponents();
        jTextField2.setText(null);
        thrg.setText(null);
        tidc.setText(null);
        tidt.setText(String.valueOf(pmb.autoNumber()));
        tket.setText(null);
        tnm.setText(null);
        jTextField1.setText(null);
        jTextField3.setText(null);
        bsave1.setEnabled(false);
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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tidt = new javax.swing.JTextField();
        tidc = new javax.swing.JTextField();
        thrg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tket = new javax.swing.JTextArea();
        tnm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bsave = new javax.swing.JButton();
        bsave1 = new javax.swing.JButton();
        bsave2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pembayaran");
        setIconImage(ic.getIcon().getImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pembayaran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jPanel1.setLayout(null);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(240, 19, 80, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("ID Transaksi");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(16, 63, 74, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("ID Customer");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(16, 92, 74, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Harga");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(16, 148, 33, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Keterangan");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(16, 174, 63, 17);

        tidt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tidt.setText("jTextField2");
        jPanel1.add(tidt);
        tidt.setBounds(100, 60, 103, 23);

        tidc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tidc.setText("jTextField2");
        jPanel1.add(tidc);
        tidc.setBounds(100, 89, 103, 23);

        thrg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        thrg.setText("jTextField2");
        jPanel1.add(thrg);
        thrg.setBounds(100, 145, 145, 23);

        tket.setColumns(20);
        tket.setRows(5);
        jScrollPane1.setViewportView(tket);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 174, 220, 54);

        tnm.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tnm.setText("jTextField2");
        jPanel1.add(tnm);
        tnm.setBounds(100, 116, 145, 23);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nama");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(16, 119, 33, 17);

        bsave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Z.E.N.S\\Documents\\NetBeansProjects\\Uas_PBO\\jpeg\\btSave.png")); // NOI18N
        bsave.setToolTipText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        jPanel1.add(bsave);
        bsave.setBounds(260, 235, 60, 30);

        bsave1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bsave1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Z.E.N.S\\Documents\\NetBeansProjects\\Uas_PBO\\jpeg\\btNew.png")); // NOI18N
        bsave1.setToolTipText("Cancel");
        bsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsave1ActionPerformed(evt);
            }
        });
        jPanel1.add(bsave1);
        bsave1.setBounds(120, 235, 60, 30);

        bsave2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bsave2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Z.E.N.S\\Documents\\NetBeansProjects\\Uas_PBO\\jpeg\\btCancel.png")); // NOI18N
        bsave2.setToolTipText("Cancel");
        bsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsave2ActionPerformed(evt);
            }
        });
        jPanel1.add(bsave2);
        bsave2.setBounds(190, 235, 60, 30);

        jTextField2.setBackground(new java.awt.Color(102, 153, 255));
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("jTextField2");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Search ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Customer", "Harga", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextField3.setText("jTextField3");
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search ID"));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(59, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsave1ActionPerformed
        // TODO add your handling code here:
        tidt.setText(String.valueOf(pmb.autoNumber()));
        jTextField2.setText(null);
        thrg.setText(null);
        tidc.setText(null);
        tidt.setText(String.valueOf(pmb.autoNumber()));
        tket.setText(null);
        tnm.setText(null);
        
    }//GEN-LAST:event_bsave1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        pmb = new pembayaran(Integer.parseInt(jTextField1.getText()));
        pmb.search();
        tidc.setText(String.valueOf(pmb.getIdc()));
        tnm.setText(pmb.getNama());
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        pmb.setIdpem(Integer.parseInt(tidt.getText()));
        pmb.setHarga(Integer.parseInt(thrg.getText()));
        pmb.setKet(tket.getText());
        jTextField2.setText(pmb.insert());
        bsave1.setEnabled(true);
    }//GEN-LAST:event_bsaveActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Maaf Inputkan Terlebih Dahulu");
        } else {
            try {
                jTable1.setModel(pmb.search1(Integer.parseInt(jTextField3.getText())));
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(rootPane, "Masukkan Nomor bukan Huruf ");
            }
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void bsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsave2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bsave2ActionPerformed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsave;
    private javax.swing.JButton bsave1;
    private javax.swing.JButton bsave2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField thrg;
    private javax.swing.JTextField tidc;
    private javax.swing.JTextField tidt;
    private javax.swing.JTextArea tket;
    private javax.swing.JTextField tnm;
    // End of variables declaration//GEN-END:variables
}
