/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crabfood;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author user
 */
public class PhumBucket extends javax.swing.JFrame {

    double totalprice;
    int cookingtime;
    int count;
    Date d = new Date();
    SimpleDateFormat m = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss a");
    Calendar cal = Calendar.getInstance();

    /**
     * Creates new form PhumBucket
     */
    public PhumBucket() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        l13 = new javax.swing.JCheckBox();
        l22 = new javax.swing.JCheckBox();
        l41 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        PhumBurger = new javax.swing.JCheckBox();
        PhumFries = new javax.swing.JCheckBox();
        PhumPie = new javax.swing.JCheckBox();
        placeOrderMsg = new javax.swing.JLabel();
        calculatemsg = new javax.swing.JLabel();
        placeOrderMsg2 = new javax.swing.JLabel();
        PlaceOrder = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        calprice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel1.setText("Select which branch you would like to order from : ");

        l13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l13.setText("1 3");
        l13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l13ActionPerformed(evt);
            }
        });

        l22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l22.setText("2 2");
        l22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l22ActionPerformed(evt);
            }
        });

        l41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l41.setText("4 1");
        l41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l41ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel2.setText("Select which dish you would like to order : ");

        PhumBurger.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhumBurger.setText("Phum Burger  $4.50");
        PhumBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhumBurgerActionPerformed(evt);
            }
        });

        PhumFries.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhumFries.setText("Phum Fries     $2.90");
        PhumFries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhumFriesActionPerformed(evt);
            }
        });

        PhumPie.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhumPie.setText("Phum Pie       $3.00");
        PhumPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhumPieActionPerformed(evt);
            }
        });

        placeOrderMsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        placeOrderMsg.setText("jLabel3");

        calculatemsg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculatemsg.setText("jLabel4");
        calculatemsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        placeOrderMsg2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        placeOrderMsg2.setText("jLabel5");

        PlaceOrder.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        calprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calprice.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhumFries)
                            .addComponent(PhumBurger)
                            .addComponent(l13)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(l41)
                            .addComponent(l22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(placeOrderMsg2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(placeOrderMsg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)))
                        .addContainerGap(255, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculatemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                                .addComponent(calprice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(PlaceOrder))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PhumPie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l41)
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PhumBurger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PhumFries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhumPie)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlaceOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calprice, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculatemsg, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeOrderMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l22ActionPerformed

    private void PhumPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhumPieActionPerformed
        totalprice += 3.00;
        cookingtime += 20;
    }//GEN-LAST:event_PhumPieActionPerformed

    private void PhumFriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhumFriesActionPerformed
        totalprice+=2.90;
        cookingtime +=20;
    }//GEN-LAST:event_PhumFriesActionPerformed

    private void l13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l13ActionPerformed

    private void l41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l41ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calprice.setText("Total price: $"+totalprice);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        count++;
        if (PhumBurger.isSelected() && PhumFries.isSelected() && PhumPie.isSelected()) {
            placeOrderMsg.setText("<html>" + m.format(d) + ": Customer " + count + " wants to order Phum Burger,<br>Phum Fries and Phum Pie.</html>");
        } else if (PhumBurger.isSelected() && PhumFries.isSelected()) {
            placeOrderMsg.setText("<html>" + m.format(d) + ": Customer " + count + " wants to order Phum Burger and Phum Fries.</html>");
        } else if (PhumBurger.isSelected() && PhumPie.isSelected()) {
            placeOrderMsg.setText(m.format(d) + ": Customer " + count + " wants to order Phum Burger and Phum Pie.");
        } else if (PhumFries.isSelected() && PhumPie.isSelected()) {
            placeOrderMsg.setText(m.format(d) + ": Customer " + count + " wants to order Phum Fries and Phum Pie.");
        } else if (PhumBurger.isSelected()) {
            placeOrderMsg.setText(m.format(d) + ": Customer " + count + " wants to order Phum Burger.");
        } else if (PhumFries.isSelected()) {
            placeOrderMsg.setText(m.format(d) + ": Customer " + count + " wants to order Phum Fries.");
        } else if (PhumPie.isSelected()) {
            placeOrderMsg.setText(m.format(d) + ": Customer " + count + " wants to order Phum Pie.");
        }
        
        if (l13.isSelected()) {
            placeOrderMsg2.setText(m.format(d) + ": Branch of Crusty Crab at (1,3) takes order.");
        }
        if (l22.isSelected()) {
            placeOrderMsg2.setText(m.format(d) + ": Branch of Crusty Crab at (2,2) takes order.");
        }
        if (l41.isSelected()) {
            placeOrderMsg2.setText(m.format(d) + ": Branch of Crusty Crab at (4,1) takes order.");
        }
        
        
        //calculate delivery time
        Date dNow = new Date();
     
        if(l13.isSelected()){
            int distance = 4;
            cal.setTime(dNow);
            cal.add(Calendar.MINUTE, distance+cookingtime);
            dNow=cal.getTime();
        calculatemsg.setText("<html> Preparation time : " + cookingtime+" minutes<br>"+
                             " Delivery time: "+distance   +" minutes <br>"+
                             " Estimated arrival: "+dNow      + "</html>");
                                    
        }
        if(l22.isSelected()){
            int distance = 4;
            cal.setTime(dNow);
            cal.add(Calendar.MINUTE, distance+cookingtime);
            dNow=cal.getTime();
        calculatemsg.setText("<html> Preparation time : " + cookingtime+" minutes<br>"+
                             " Delivery time: "+distance   +" minutes <br>"+
                             " Estimated arrival: "+dNow      + "</html>");
                                    
        }
        if(l41.isSelected()){
            int distance = 5;
            cal.setTime(dNow);
            cal.add(Calendar.MINUTE, distance+cookingtime);
            dNow=cal.getTime();
        calculatemsg.setText("<html> Preparation time : " + cookingtime+" minutes<br>"+
                             " Delivery time: "+distance   +" minutes <br>"+
                             " Estimated arrival: "+dNow      + "</html>");
                                    
        }
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void PhumBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhumBurgerActionPerformed
        cookingtime += 20;
        totalprice += 4.50;
    }//GEN-LAST:event_PhumBurgerActionPerformed

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
            java.util.logging.Logger.getLogger(PhumBucket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhumBucket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhumBucket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhumBucket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhumBucket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox PhumBurger;
    private javax.swing.JCheckBox PhumFries;
    private javax.swing.JCheckBox PhumPie;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JLabel calculatemsg;
    private javax.swing.JLabel calprice;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox l13;
    private javax.swing.JCheckBox l22;
    private javax.swing.JCheckBox l41;
    private javax.swing.JLabel placeOrderMsg;
    private javax.swing.JLabel placeOrderMsg2;
    // End of variables declaration//GEN-END:variables
}
