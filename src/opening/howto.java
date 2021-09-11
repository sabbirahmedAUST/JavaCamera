
package opening;

import javax.swing.ImageIcon;

public class howto extends javax.swing.JFrame {

    public howto() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        limage = new javax.swing.JLabel();
        bprevious = new javax.swing.JButton();
        bnext = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        limage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/1.jpg"))); // NOI18N
        limage.setText("jLabel1");

        bprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/left-arrow.png"))); // NOI18N
        bprevious.setText("PREVIOUS");
        bprevious.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bprevious.setIconTextGap(10);
        bprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpreviousActionPerformed(evt);
            }
        });

        bnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/keyboard-right-arrow-button.png"))); // NOI18N
        bnext.setText("NEXT");
        bnext.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bnext.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        bnext.setIconTextGap(10);
        bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnextActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/opening/images/house.png"))); // NOI18N
        jButton1.setText("HOME");
        jButton1.setIconTextGap(10);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(bprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnext, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnext, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(limage, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int count = 0;
    String[] imagenames={"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg"};
    private void bnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnextActionPerformed
        
        ImageIcon[] imagelist = new ImageIcon[6];
        for(int i =0 ; i<imagelist.length;i++){
        imagelist[i] = new ImageIcon(getClass().getResource("/opening/images/"+imagenames[i]));
        }
        if(count<0) count =1;
        if(count>=0 && count<imagenames.length){
            limage.setIcon(imagelist[count]);
            count++;
        }
    }//GEN-LAST:event_bnextActionPerformed

    private void bpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpreviousActionPerformed
        // TODO add your handling code here:
         ImageIcon[] imagelist = new ImageIcon[6];
        for(int i =0 ; i<imagelist.length;i++){
        imagelist[i] = new ImageIcon(getClass().getResource("/opening/images/"+imagenames[i]));
        }
        if(count>=imagenames.length) count =imagenames.length-2;
        if(count>=0 && count<imagenames.length){
            limage.setIcon(imagelist[count]);
            count--;
        }
    }//GEN-LAST:event_bpreviousActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              this.hide();
       opening frm = new opening();
       frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(howto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(howto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(howto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(howto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new howto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnext;
    private javax.swing.JButton bprevious;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel limage;
    // End of variables declaration//GEN-END:variables
}
