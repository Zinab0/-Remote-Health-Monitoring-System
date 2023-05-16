/* Group No. 9:
    _______________________________
    CPCS-371
    Project: Simulating a RHMS for elderly patients using client-server TCP Sockets
    Date: 11 Feb, 2021
    Group members:
        1. Ghaida Alsharif
        2. Zainab Alsaggaf 
        3. Reem Alsubaie 
        4. Raghad Alzahrani 
        5. Dhay Alharbi
        6. Mona Alharbi   
*/
package medicalserver;
import java.awt.Color;
public class GUI_M extends javax.swing.JFrame{

    /**
     * Creates new form GUI_M
     */
    public GUI_M() {
        initComponents();
        getContentPane().setBackground(Color.getHSBColor(246, 208, 220));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        action = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tempD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tempV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tempT = new javax.swing.JTextField();
        oxyV = new javax.swing.JTextField();
        heartV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        oxyD = new javax.swing.JTextField();
        heartD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        oxyT = new javax.swing.JTextField();
        heartT = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medical Server Interface");

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Heart rate:");

        close.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        action.setFont(new java.awt.Font("DialogInput", 1, 23)); // NOI18N
        action.setForeground(new java.awt.Color(0, 0, 0));
        action.setText("jTextField2");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Action:");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 29)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Oxygen Saturation:");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Tempreture:");

        tempD.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        tempD.setForeground(new java.awt.Color(0, 0, 0));
        tempD.setText("jTextField2");
        tempD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempDActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date:");

        tempV.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        tempV.setForeground(new java.awt.Color(0, 0, 0));
        tempV.setText("jTextField2");
        tempV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempVActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Time:");

        tempT.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        tempT.setForeground(new java.awt.Color(0, 0, 0));
        tempT.setText("jTextField2");
        tempT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempTActionPerformed(evt);
            }
        });

        oxyV.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        oxyV.setForeground(new java.awt.Color(0, 0, 0));
        oxyV.setText("jTextField2");
        oxyV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxyVActionPerformed(evt);
            }
        });

        heartV.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        heartV.setForeground(new java.awt.Color(0, 0, 0));
        heartV.setText("jTextField2");
        heartV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartVActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Date:");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Date:");

        oxyD.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        oxyD.setForeground(new java.awt.Color(0, 0, 0));
        oxyD.setText("jTextField2");
        oxyD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxyDActionPerformed(evt);
            }
        });

        heartD.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        heartD.setForeground(new java.awt.Color(0, 0, 0));
        heartD.setText("jTextField2");
        heartD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Time:");

        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Time:");

        oxyT.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        oxyT.setForeground(new java.awt.Color(0, 0, 0));
        oxyT.setText("jTextField2");
        oxyT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oxyTActionPerformed(evt);
            }
        });

        heartT.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        heartT.setForeground(new java.awt.Color(0, 0, 0));
        heartT.setText("jTextField2");
        heartT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(oxyV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(heartV))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(tempV, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tempD, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oxyD)
                            .addComponent(heartD))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oxyT)
                    .addComponent(heartT)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tempT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(467, 467, 467))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(526, 526, 526))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(heartV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(heartD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(heartT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oxyV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oxyD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oxyT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false); /* Close the page*/
        System.exit(0); /* Stop Running */
        
    }//GEN-LAST:event_closeActionPerformed

    private void tempDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempDActionPerformed

    private void tempVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempVActionPerformed

    private void tempTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempTActionPerformed

    private void oxyVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxyVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oxyVActionPerformed

    private void heartVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartVActionPerformed

    private void oxyDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxyDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oxyDActionPerformed

    private void heartDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartDActionPerformed

    private void oxyTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oxyTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oxyTActionPerformed

    private void heartTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartTActionPerformed

    /* -------------------------------------------------- */
    /* --------------------- Methods -------------------- */
    /* -------------------------------------------------- */
    
    // 1. For Tempreture
    public void display_temp_value(String s) {
        tempV.setText(s);
    }
    
    public void display_temp_date(String s) {
        tempD.setText(s);
    }
    public void display_temp_time(String s) {
        tempT.setText(s);
    }
    
    // ------------------
    // 2. For Heart Rate
    public void display_heart_value(String s) {
        heartV.setText(s);
    }
    
    public void display_heart_date(String s) {
        heartD.setText(s);
    }
    public void display_heart_time(String s) {
        heartT.setText(s);
    }
    
    // ------------------
    // 3. For Oxygen 
    public void display_oxy_value(String s) {
        oxyV.setText(s);
    }
    
    public void display_oxy_date(String s) {
        oxyD.setText(s);
    }
    public void display_oxy_time(String s) {
        oxyT.setText(s);
    }
    
    // 4. Action msg
    public void display_action(String s) {
        action.setText(s);
    }
    
    /* ------------------------------------------- */
    /* ------------ End of methods ----------------*/
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(GUI_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_M.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_M().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField action;
    private static javax.swing.JButton close;
    private static javax.swing.JTextField heartD;
    private static javax.swing.JTextField heartT;
    private static javax.swing.JTextField heartV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField oxyD;
    private static javax.swing.JTextField oxyT;
    private static javax.swing.JTextField oxyV;
    private static javax.swing.JTextField tempD;
    private static javax.swing.JTextField tempT;
    private static javax.swing.JTextField tempV;
    // End of variables declaration//GEN-END:variables
}
