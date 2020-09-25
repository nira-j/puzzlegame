
package puzzzle;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ladies extends javax.swing.JFrame {

   Icon star;
    public ladies() {
        initComponents();
        star=new ImageIcon();
        star=b4.getIcon();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1900, 1000));
        setPreferredSize(new java.awt.Dimension(1300, 1050));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(null);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/lady.jpg"))); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(640, 20, 210, 230);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a5.png"))); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(20, 250, 210, 220);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a2.png"))); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(230, 250, 200, 220);

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a12.png"))); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10);
        b10.setBounds(230, 470, 200, 230);

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a10.png"))); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12);
        b12.setBounds(640, 470, 210, 230);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a7.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(20, 20, 210, 230);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Goal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1030, 100, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/im1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1020, 170, 780, 639);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a3.png"))); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);
        b3.setBounds(430, 20, 210, 230);

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a11.png"))); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11);
        b11.setBounds(430, 470, 210, 230);

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a9.png"))); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(20, 470, 210, 230);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a8.png"))); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(640, 250, 210, 220);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a1.png"))); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);
        b7.setBounds(430, 250, 210, 220);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/puzzzle/image/a6.png"))); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(230, 20, 200, 230);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1880, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    if(evt.getSource()==b1){
            Icon s1=b1.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b1.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b1.setIcon(star);
            }
        } // TODO add your handling code here:
   
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(evt.getSource()==b2){
            Icon s1=b2.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b2.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
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
            } else if(b7.getIcon()==star){
                b7.setIcon(s1);
                b3.setIcon(star);
            }
            else if(b4.getIcon()==star){
                b4.setIcon(s1);
                b3.setIcon(star);
            }
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(evt.getSource()==b4){
            Icon s1=b4.getIcon();
            if(b3.getIcon()==star){
                b3.setIcon(s1);
                b4.setIcon(star);
            } else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b4.setIcon(star);
            }
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(evt.getSource()==b5){
            Icon s1=b5.getIcon();
            if(b1.getIcon()==star){
                b1.setIcon(s1);
                b5.setIcon(star);
            } else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b5.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b5.setIcon(star);
            }
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
         if(evt.getSource()==b6){
            Icon s1=b6.getIcon();
            if(b2.getIcon()==star){
                b2.setIcon(s1);
                b6.setIcon(star);
            } else if(b5.getIcon()==star){
                b5.setIcon(s1);
                b6.setIcon(star);
            } else if(b7.getIcon()==star){
                b7.setIcon(s1);
                b6.setIcon(star);
            }
            else if(b10.getIcon()==star){
                b10.setIcon(s1);
                b6.setIcon(star);
            }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(evt.getSource()==b7){
            Icon s1=b7.getIcon();
            if(b11.getIcon()==star){
                b11.setIcon(s1);
                b7.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b7.setIcon(star);
            }
            else if(b3.getIcon()==star){
                b3.setIcon(s1);
                b7.setIcon(star);
            }
            else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b7.setIcon(star);
            }
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(evt.getSource()==b8){
            Icon s1=b8.getIcon();
            if(b4.getIcon()==star){
                b4.setIcon(s1);
                b8.setIcon(star);
            } else if(b7.getIcon()==star){
                b7.setIcon(s1);
                b8.setIcon(star);
            }
            else if(b12.getIcon()==star){
                b12.setIcon(s1);
                b8.setIcon(star);
            }
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(evt.getSource()==b9){
            Icon s1=b9.getIcon();
            if(b5.getIcon()==star){
                b5.setIcon(s1);
                b9.setIcon(star);
            } else if(b10.getIcon()==star){
                b10.setIcon(s1);
                b9.setIcon(star);
            }
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        if(evt.getSource()==b10){
            Icon s1=b10.getIcon();
            if(b11.getIcon()==star){
                b11.setIcon(s1);
                b10.setIcon(star);
            } else if(b6.getIcon()==star){
                b6.setIcon(s1);
                b10.setIcon(star);
            }
            else if(b9.getIcon()==star){
                b9.setIcon(s1);
                b10.setIcon(star);
            }
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        if(evt.getSource()==b11){
            Icon s1=b11.getIcon();
            if(b7.getIcon()==star){
                b7.setIcon(s1);
                b11.setIcon(star);
            } else if(b12.getIcon()==star){
                b12.setIcon(s1);
                b11.setIcon(star);
            }
            else if(b10.getIcon()==star){
                b10.setIcon(s1);
                b11.setIcon(star);
            }
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        if(evt.getSource()==b12){
            Icon s1=b12.getIcon();
            if(b11.getIcon()==star){
                b11.setIcon(s1);
                b12.setIcon(star);
            } else if(b8.getIcon()==star){
                b8.setIcon(s1);
                b12.setIcon(star);
            }
        }
    }//GEN-LAST:event_b12ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ladies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ladies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ladies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ladies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ladies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
