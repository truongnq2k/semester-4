/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculato;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author longd
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
     
    }

    public JButton getBtn0() {
        return btn0;
    }

    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    public JButton getBtnadd() {
        return btnadd;
    }

    public void setBtnadd(JButton btnadd) {
        this.btnadd = btnadd;
    }

    public JButton getBtndi() {
        return btndi;
    }

    public void setBtndi(JButton btndi) {
        this.btndi = btndi;
    }

    public JButton getBtndive() {
        return btndive;
    }

    public void setBtndive(JButton btndive) {
        this.btndive = btndive;
    }

    public JButton getBtnmul() {
        return btnmul;
    }

    public void setBtnmul(JButton btnmul) {
        this.btnmul = btnmul;
    }

    public JButton getBtnsub() {
        return btnsub;
    }

    public void setBtnsub(JButton btnsub) {
        this.btnsub = btnsub;
    }

    public JButton getBtneq() {
        return btneq;
    }

    public void setBtneq(JButton btneq) {
        this.btneq = btneq;
    }

    public JTextField getTxtscreen() {
        return txtscreen;
    }

    public void setTxtscreen(JTextField txtscreen) {
        this.txtscreen = txtscreen;
    }

    public JLabel getJreset() {
        return Jreset;
    }

    public void setJreset(JLabel Jreset) {
        this.Jreset = Jreset;
    }

    public JButton getBtnsqrt() {
        return btnsqrt;
    }

    public void setBtnsqrt(JButton btnsqrt) {
        this.btnsqrt = btnsqrt;
    }

    public JButton getBtnnega() {
        return btnnega;
    }

    public void setBtnnega(JButton btnnega) {
        this.btnnega = btnnega;
    }

    public JButton getBtnPer() {
        return btnPer;
    }

    public void setBtnPer(JButton btnPer) {
        this.btnPer = btnPer;
    }

    public JButton getBtninvert() {
        return btninvert;
    }

    public void setBtninvert(JButton btninvert) {
        this.btninvert = btninvert;
    }

    public JButton getBtnMC() {
        return BtnMC;
    }

    public void setBtnMC(JButton BtnMC) {
        this.BtnMC = BtnMC;
    }

    public JButton getBtnMa() {
        return btnMa;
    }

    public void setBtnMa(JButton btnMa) {
        this.btnMa = btnMa;
    }

    public JButton getBtnMr() {
        return btnMr;
    }

    public void setBtnMr(JButton btnMr) {
        this.btnMr = btnMr;
    }

    public JButton getBtnMs() {
        return btnMs;
    }

    public void setBtnMs(JButton btnMs) {
        this.btnMs = btnMs;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtscreen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Jreset = new javax.swing.JLabel();
        btn0 = new javax.swing.JButton();
        btndi = new javax.swing.JButton();
        btnnega = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btneq = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btninvert = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btndive = new javax.swing.JButton();
        btnPer = new javax.swing.JButton();
        BtnMC = new javax.swing.JButton();
        btnMr = new javax.swing.JButton();
        btnMa = new javax.swing.JButton();
        btnMs = new javax.swing.JButton();
        btnsqrt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtscreen.setEditable(false);
        txtscreen.setBackground(new java.awt.Color(102, 255, 255));
        txtscreen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtscreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtscreen.setText("0");
        txtscreen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Jreset.setText("All Clear");
        Jreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JresetMouseClicked(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setText("0");

        btndi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndi.setText(".");
        btndi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiActionPerformed(evt);
            }
        });

        btnnega.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnega.setText("+/_");

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btneq.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btneq.setText("=");
        btneq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneqActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("1");

        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("2");

        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("3");

        btnsub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("4");

        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("5");

        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("6");

        btnmul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmul.setText("x");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btninvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btninvert.setText("1/x");
        btninvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninvertActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("7");

        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("8");

        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("9");

        btndive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndive.setText("÷");
        btndive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiveActionPerformed(evt);
            }
        });

        btnPer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPer.setText("%");
        btnPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerActionPerformed(evt);
            }
        });

        BtnMC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnMC.setText("MC");

        btnMr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMr.setText("MR");

        btnMa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMa.setText("M+");

        btnMs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMs.setText("M-");

        btnsqrt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsqrt.setText("√");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jreset))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnMs, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btndive, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btndi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnnega, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneq, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninvert, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Jreset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMs, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btndive, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btninvert, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnega, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btneq, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JresetMouseClicked

    }//GEN-LAST:event_JresetMouseClicked

    private void btndiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndiActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

    }//GEN-LAST:event_btnaddActionPerformed

    private void btneqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneqActionPerformed

    }//GEN-LAST:event_btneqActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed

    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed

    }//GEN-LAST:event_btnmulActionPerformed

    private void btndiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiveActionPerformed

    }//GEN-LAST:event_btndiveActionPerformed

    private void btnPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerActionPerformed

    }//GEN-LAST:event_btnPerActionPerformed

    private void btninvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninvertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninvertActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMC;
    private javax.swing.JLabel Jreset;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnMa;
    private javax.swing.JButton btnMr;
    private javax.swing.JButton btnMs;
    private javax.swing.JButton btnPer;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndi;
    private javax.swing.JButton btndive;
    private javax.swing.JButton btneq;
    private javax.swing.JButton btninvert;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnnega;
    private javax.swing.JButton btnsqrt;
    private javax.swing.JButton btnsub;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtscreen;
    // End of variables declaration//GEN-END:variables
}
