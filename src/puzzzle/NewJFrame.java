
package puzzzle;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class NewJFrame extends javax.swing.JFrame {

    Icon star;
    
    public NewJFrame() {
        initComponents();
        star=new ImageIcon();
        star=b9.getIcon();
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1900, 1000));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/3.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(50, 10, 209, 200);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/1.png"))); // NOI18N
        b3.setIconTextGap(1);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(460, 10, 200, 200);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/9.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(260, 10, 200, 200);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/7.png"))); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(260, 210, 204, 199);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/4.png"))); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(50, 210, 209, 199);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/6.png"))); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(460, 210, 200, 200);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/5.png"))); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(50, 410, 210, 197);

        b9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/man.jpg"))); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(460, 410, 205, 197);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/8.png"))); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(260, 410, 200, 197);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Goal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(910, 140, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/im.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(820, 220, 740, 640);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1900, 960);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(evt.getSource()==b9){
            Icon s1=b9.getIcon();
            if(b8.getIcon()==star){
                b8.setIcon(s1);
                b9.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b9.setIcon(star);
            }
        }
        
    }//GEN-LAST:event_b9ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       if(evt.getSource()==b1){
            Icon s1=b1.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b1.setIcon(star);
            } else if(b4.getIcon()==star){
                b4.setIcon(s1);
                b1.setIcon(star);
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(evt.getSource()==b8){
            Icon s1=b8.getIcon();
            if(b7.getIcon()==star){
                b7.setIcon(s1);
                b8.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b8.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b8.setIcon(star);
            }

        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(evt.getSource()==b7){
            Icon s1=b7.getIcon();
            if(b4.getIcon()==star){
                b4.setIcon(s1);
                b7.setIcon(star);
            } else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b7.setIcon(star);
            }
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(evt.getSource()==b4){
            Icon s1=b4.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b4.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b4.setIcon(star);
            }
            else if(b7.getIcon()==star){
                b7.setIcon(s1);
                b4.setIcon(star);
            }
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(evt.getSource()==b5){
            Icon s1=b5.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b5.setIcon(star);
            } else if(b4.getIcon()==star){
                b4.setIcon(s1);
                b5.setIcon(star);
            }
            else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b5.setIcon(star);
            }
            else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b5.setIcon(star);
            }
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(evt.getSource()==b6){
            Icon s1=b6.getIcon();
            if(b3.getIcon()==star){
                b3.setIcon(s1);
                b6.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b6.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b6.setIcon(star);
            }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(evt.getSource()==b2){
            Icon s1=b2.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b2.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b2.setIcon(star);
            }
            else if(b3.getIcon()==star){
                b3.setIcon(s1);
                b2.setIcon(star);
            }
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(evt.getSource()==b3){
            Icon s1=b3.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b3.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b3.setIcon(star);
            }
        }
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
