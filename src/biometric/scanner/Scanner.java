/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometric.scanner;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Arosha D
 */
public class Scanner extends javax.swing.JFrame {
    
    private ArrayList personData = new ArrayList();
    private Identifier identifier; 
    /**
     * Creates new form Scanner
     */
    public Scanner() {
        initComponents();
    }

    public ArrayList getPersonData(){
        return personData;
    }
    public void setIdentifier(Identifier identifier){
        this.identifier = identifier;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        thumbLength = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        indexLength = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        midLength = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ringLength = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        littleLength = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        littleTDLength = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ringTDLength = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        midTDLength = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        indexTDLength = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        thumbTDLength = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        thumbWidth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        indexWidth = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        midWidth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ringWidth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        littleWidth = new javax.swing.JTextField();
        nameArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Thumb Length");

        thumbLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thumbLengthActionPerformed(evt);
            }
        });

        jLabel4.setText("Index Length");

        indexLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexLengthActionPerformed(evt);
            }
        });

        jLabel5.setText("Mid Length");

        midLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midLengthActionPerformed(evt);
            }
        });

        jLabel6.setText("Ring Length");

        ringLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringLengthActionPerformed(evt);
            }
        });

        jLabel7.setText("Little Length");

        littleLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                littleLengthActionPerformed(evt);
            }
        });

        jLabel17.setText("Little Top To Division Length");

        littleTDLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                littleTDLengthActionPerformed(evt);
            }
        });

        jLabel16.setText("Ring Top To Division Length");

        ringTDLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringTDLengthActionPerformed(evt);
            }
        });

        jLabel15.setText("Mid Top To Division Length");

        midTDLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midTDLengthActionPerformed(evt);
            }
        });

        jLabel14.setText("Index Top To Division Length");

        indexTDLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexTDLengthActionPerformed(evt);
            }
        });

        jLabel13.setText("Thumb Top To Division Length");

        thumbTDLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thumbTDLengthActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Thumb Width");

        thumbWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thumbWidthActionPerformed(evt);
            }
        });

        jLabel9.setText("Index Width");

        indexWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexWidthActionPerformed(evt);
            }
        });

        jLabel10.setText("Mid Width");

        midWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midWidthActionPerformed(evt);
            }
        });

        jLabel11.setText("Ring Width");

        ringWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ringWidthActionPerformed(evt);
            }
        });

        jLabel12.setText("Little Width");

        littleWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                littleWidthActionPerformed(evt);
            }
        });

        nameArea.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameArea.setText("Enter your details and press OK ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ringWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thumbWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(littleLength, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ringLength, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(midLength, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indexLength, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(thumbLength, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel15))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thumbTDLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indexTDLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(midTDLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ringTDLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(littleTDLength, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(indexWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(midWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(nameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(littleWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(thumbLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(thumbTDLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(indexLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(indexTDLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(midLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(midTDLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ringLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(ringTDLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(littleLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(littleTDLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thumbWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(indexWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(midWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(ringWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(littleWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thumbLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thumbLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thumbLengthActionPerformed

    private void indexLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexLengthActionPerformed

    private void midLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midLengthActionPerformed

    private void ringLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ringLengthActionPerformed

    private void littleLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_littleLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_littleLengthActionPerformed

    private void littleTDLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_littleTDLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_littleTDLengthActionPerformed

    private void ringTDLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringTDLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ringTDLengthActionPerformed

    private void midTDLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midTDLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midTDLengthActionPerformed

    private void indexTDLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexTDLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexTDLengthActionPerformed

    private void thumbTDLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thumbTDLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thumbTDLengthActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setTitle("Biometric Scanner");
	home.setSize(960,760);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        personData.add(thumbLength.getText());
        personData.add(indexLength.getText());
        personData.add(midLength.getText());
        personData.add(ringLength.getText());
        personData.add(littleLength.getText());

        personData.add(thumbWidth.getText());
        personData.add(indexWidth.getText());
        personData.add(midWidth.getText());
        personData.add(ringWidth.getText());
        personData.add(littleWidth.getText());

        personData.add(thumbTDLength.getText());
        personData.add(indexTDLength.getText());
        personData.add(midTDLength.getText());
        personData.add(ringTDLength.getText());
        personData.add(littleTDLength.getText());
        
        
        nameArea.setText(identifier.identify(personData));
        System.out.println("Scanning!");
        personData.clear();
    }//GEN-LAST:event_okButtonActionPerformed

    private void thumbWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thumbWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thumbWidthActionPerformed

    private void indexWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexWidthActionPerformed

    private void midWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midWidthActionPerformed

    private void ringWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ringWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ringWidthActionPerformed

    private void littleWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_littleWidthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_littleWidthActionPerformed

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
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField indexLength;
    private javax.swing.JTextField indexTDLength;
    private javax.swing.JTextField indexWidth;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField littleLength;
    private javax.swing.JTextField littleTDLength;
    private javax.swing.JTextField littleWidth;
    private javax.swing.JTextField midLength;
    private javax.swing.JTextField midTDLength;
    private javax.swing.JTextField midWidth;
    private javax.swing.JLabel nameArea;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField ringLength;
    private javax.swing.JTextField ringTDLength;
    private javax.swing.JTextField ringWidth;
    private javax.swing.JTextField thumbLength;
    private javax.swing.JTextField thumbTDLength;
    private javax.swing.JTextField thumbWidth;
    // End of variables declaration//GEN-END:variables
}
