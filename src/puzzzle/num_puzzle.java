/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzzle;

public class num_puzzle extends javax.swing.JFrame {
String s;
  
    public num_puzzle() {
        initComponents();
        setSize(650,650);
        setLocation(350,200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b16 = new java.awt.Button();
        b1 = new java.awt.Button();
        b5 = new java.awt.Button();
        b3 = new java.awt.Button();
        b2 = new java.awt.Button();
        b4 = new java.awt.Button();
        b6 = new java.awt.Button();
        b7 = new java.awt.Button();
        b8 = new java.awt.Button();
        b9 = new java.awt.Button();
        b10 = new java.awt.Button();
        b11 = new java.awt.Button();
        b12 = new java.awt.Button();
        b13 = new java.awt.Button();
        b14 = new java.awt.Button();
        b15 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        b16.setBackground(new java.awt.Color(51, 255, 51));
        b16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b16MouseClicked(evt);
            }
        });
        getContentPane().add(b16);
        b16.setBounds(460, 440, 150, 140);

        b1.setBackground(new java.awt.Color(51, 255, 51));
        b1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b1.setLabel("5");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(10, 20, 150, 140);

        b5.setBackground(new java.awt.Color(51, 255, 51));
        b5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b5.setLabel("1");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(10, 160, 150, 140);

        b3.setBackground(new java.awt.Color(51, 255, 51));
        b3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b3.setLabel("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(310, 20, 150, 140);

        b2.setBackground(new java.awt.Color(51, 255, 51));
        b2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b2.setLabel("10");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(160, 20, 150, 140);

        b4.setBackground(new java.awt.Color(51, 255, 51));
        b4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b4.setLabel("15");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(460, 20, 150, 140);

        b6.setBackground(new java.awt.Color(51, 255, 51));
        b6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b6.setLabel("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(160, 160, 150, 140);

        b7.setBackground(new java.awt.Color(51, 255, 51));
        b7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b7.setLabel("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(310, 160, 150, 140);

        b8.setBackground(new java.awt.Color(51, 255, 51));
        b8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b8.setLabel("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(460, 160, 150, 140);

        b9.setBackground(new java.awt.Color(51, 255, 51));
        b9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b9.setLabel("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(10, 300, 150, 140);

        b10.setBackground(new java.awt.Color(51, 255, 51));
        b10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b10.setLabel("2");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10);
        b10.setBounds(160, 300, 150, 140);

        b11.setBackground(new java.awt.Color(51, 255, 51));
        b11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b11.setLabel("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11);
        b11.setBounds(310, 300, 150, 140);

        b12.setBackground(new java.awt.Color(51, 255, 51));
        b12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b12.setLabel("12");
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b12MouseClicked(evt);
            }
        });
        getContentPane().add(b12);
        b12.setBounds(460, 300, 150, 140);

        b13.setBackground(new java.awt.Color(51, 255, 51));
        b13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b13.setLabel("13");
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13);
        b13.setBounds(10, 440, 150, 140);

        b14.setBackground(new java.awt.Color(51, 255, 51));
        b14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b14.setLabel("14");
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14);
        b14.setBounds(160, 440, 150, 140);

        b15.setBackground(new java.awt.Color(51, 255, 51));
        b15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        b15.setLabel("4");
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15);
        b15.setBounds(310, 440, 150, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b1){
            s=b1.getLabel();
           if(b2.getLabel().isEmpty()){
               b2.setLabel(s);
               b1.setLabel("");
           }
           if(b5.getLabel().isEmpty()){
               b5.setLabel(s);
               b1.setLabel("");
           }  
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==b12){
            s=b12.getLabel();
           if(b16.getLabel().isEmpty()){
               b16.setLabel(s);
               b12.setLabel("");
           }
           if(b8.getLabel().isEmpty()){
               b8.setLabel(s);
               b12.setLabel("");
           }
           if(b11.getLabel().isEmpty()){
               b11.setLabel(s);
               b12.setLabel("");
           } 
        }
    }//GEN-LAST:event_b12MouseClicked

    private void b16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseClicked
        // TODO add your handling code here:
        if(evt.getSource()==b16){
            s=b16.getLabel();
           if(b15.getLabel().isEmpty()){
               b15.setLabel(s);
               b16.setLabel("");
           }
           if(b12.getLabel().isEmpty()){
               b12.setLabel(s);
               b16.setLabel("");
           }  
        }
    }//GEN-LAST:event_b16MouseClicked

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
         if(evt.getSource()==b14){
            s=b14.getLabel();
           if(b13.getLabel().isEmpty()){
               b13.setLabel(s);
               b14.setLabel("");
           }
           if(b10.getLabel().isEmpty()){
               b10.setLabel(s);
               b14.setLabel("");
           }
           if(b15.getLabel().isEmpty()){
               b15.setLabel(s);
               b14.setLabel("");
           } 
        }
        
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
         if(evt.getSource()==b15){
            s=b15.getLabel();
           if(b16.getLabel().isEmpty()){
               b16.setLabel(s);
               b15.setLabel("");
           }
           if(b14.getLabel().isEmpty()){
               b14.setLabel(s);
               b15.setLabel("");
           }
           if(b11.getLabel().isEmpty()){
               b11.setLabel(s);
               b15.setLabel("");
           } 
        }
    }//GEN-LAST:event_b15ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
         if(evt.getSource()==b13){
            s=b13.getLabel();
           if(b14.getLabel().isEmpty()){
               b14.setLabel(s);
               b13.setLabel("");
           }
           if(b9.getLabel().isEmpty()){
               b9.setLabel(s);
               b13.setLabel("");
           }
        }
    }//GEN-LAST:event_b13ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
         if(evt.getSource()==b11){
            s=b11.getLabel();
           if(b15.getLabel().isEmpty()){
               b15.setLabel(s);
               b11.setLabel("");
           }
           if(b7.getLabel().isEmpty()){
               b7.setLabel(s);
               b11.setLabel("");
           }
           if(b12.getLabel().isEmpty()){
               b12.setLabel(s);
               b11.setLabel("");
           } 
           if(b10.getLabel().isEmpty()){
               b10.setLabel(s);
               b11.setLabel("");
           }
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        if(evt.getSource()==b10){
            s=b10.getLabel();
           if(b9.getLabel().isEmpty()){
               b9.setLabel(s);
               b10.setLabel("");
           }
           if(b11.getLabel().isEmpty()){
               b11.setLabel(s);
               b10.setLabel("");
           }
           if(b14.getLabel().isEmpty()){
               b14.setLabel(s);
               b10.setLabel("");
           } 
           if(b6.getLabel().isEmpty()){
               b6.setLabel(s);
               b10.setLabel("");
           }
        }
    }//GEN-LAST:event_b10ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(evt.getSource()==b9){
            s=b9.getLabel();
           if(b13.getLabel().isEmpty()){
               b13.setLabel(s);
               b9.setLabel("");
           }
           if(b10.getLabel().isEmpty()){
               b10.setLabel(s);
               b9.setLabel("");
           }
           if(b5.getLabel().isEmpty()){
               b5.setLabel(s);
               b9.setLabel("");
           } 
        }
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(evt.getSource()==b8){
            s=b8.getLabel();
           if(b12.getLabel().isEmpty()){
               b12.setLabel(s);
               b8.setLabel("");
           }
           if(b7.getLabel().isEmpty()){
               b7.setLabel(s);
               b8.setLabel("");
           }
           if(b4.getLabel().isEmpty()){
               b4.setLabel(s);
               b8.setLabel("");
           } 
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(evt.getSource()==b7){
            s=b7.getLabel();
           if(b6.getLabel().isEmpty()){
               b6.setLabel(s);
               b7.setLabel("");
           }
           if(b8.getLabel().isEmpty()){
               b8.setLabel(s);
               b7.setLabel("");
           }
           if(b11.getLabel().isEmpty()){
               b11.setLabel(s);
               b7.setLabel("");
           } 
           if(b3.getLabel().isEmpty()){
               b3.setLabel(s);
               b7.setLabel("");
           }
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(evt.getSource()==b6){
            s=b6.getLabel();
           if(b5.getLabel().isEmpty()){
               b5.setLabel(s);
               b6.setLabel("");
           }
           if(b7.getLabel().isEmpty()){
               b7.setLabel(s);
               b6.setLabel("");
           }
           if(b10.getLabel().isEmpty()){
               b10.setLabel(s);
               b6.setLabel("");
           } 
           if(b2.getLabel().isEmpty()){
               b2.setLabel(s);
               b6.setLabel("");
           }
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(evt.getSource()==b5){
            s=b5.getLabel();
           if(b1.getLabel().isEmpty()){
               b1.setLabel(s);
               b5.setLabel("");
           }
           if(b6.getLabel().isEmpty()){
               b6.setLabel(s);
               b5.setLabel("");
           }
           if(b9.getLabel().isEmpty()){
               b9.setLabel(s);
               b5.setLabel("");
           } 
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(evt.getSource()==b4){
            s=b4.getLabel();
            if(b8.getLabel().isEmpty()){
                b4.setLabel(s);
                b4.setLabel("");
            }
            if(b3.getLabel().isEmpty()){
                b3.setLabel(s);
                b4.setLabel("");
            }
        }    
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         if(evt.getSource()==b3){
            s=b3.getLabel();
           if(b7.getLabel().isEmpty()){
               b7.setLabel(s);
               b3.setLabel("");
           }
           if(b2.getLabel().isEmpty()){
               b2.setLabel(s);
               b3.setLabel("");
           }
           if(b4.getLabel().isEmpty()){
               b4.setLabel(s);
               b3.setLabel("");
           } 
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
         if(evt.getSource()==b2){
            s=b2.getLabel();
           if(b1.getLabel().isEmpty()){
               b1.setLabel(s);
               b2.setLabel("");
           }
           if(b6.getLabel().isEmpty()){
               b6.setLabel(s);
               b2.setLabel("");
           }
           if(b3.getLabel().isEmpty()){
               b3.setLabel(s);
               b2.setLabel("");
           } 
        }
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(num_puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(num_puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(num_puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(num_puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new num_puzzle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button b1;
    private java.awt.Button b10;
    private java.awt.Button b11;
    private java.awt.Button b12;
    private java.awt.Button b13;
    private java.awt.Button b14;
    private java.awt.Button b15;
    private java.awt.Button b16;
    private java.awt.Button b2;
    private java.awt.Button b3;
    private java.awt.Button b4;
    private java.awt.Button b5;
    private java.awt.Button b6;
    private java.awt.Button b7;
    private java.awt.Button b8;
    private java.awt.Button b9;
    // End of variables declaration//GEN-END:variables
}
