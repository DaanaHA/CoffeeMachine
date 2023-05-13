package coffeemachine;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuiMain extends javax.swing.JFrame {

    public GuiMain() {
        initComponents();
    }
    
    Calendar c = Calendar.getInstance();
    
    BeansContainer b1 = new BeansContainer(180, 180, 57);
    WaterContainer w1 = new WaterContainer(500, 500);
    Grinder g1 = new Grinder(1);
    WasteTray t1 = new WasteTray(100, 0);
    FileLogger fw1 = new FileLogger();
    CoffeeMachine c1 = new CoffeeMachine(w1, b1, t1, g1, fw1);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        startButton = new javax.swing.JButton();
        espressoSingleShotButton = new javax.swing.JRadioButton();
        espressoDoubleShotButton = new javax.swing.JRadioButton();
        americanoSingleShotButton = new javax.swing.JRadioButton();
        americanoDoubleShotButton = new javax.swing.JRadioButton();
        stopButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        makeCoffeeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stateTextArea = new javax.swing.JTextArea();
        fillBeansButton = new javax.swing.JButton();
        fillWaterButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee Machine");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        startButton.setBackground(new java.awt.Color(102, 255, 102));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(espressoSingleShotButton);
        espressoSingleShotButton.setText("Espresso single shot");
        espressoSingleShotButton.setEnabled(false);
        espressoSingleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espressoSingleShotButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(espressoDoubleShotButton);
        espressoDoubleShotButton.setText("Espresso double shot");
        espressoDoubleShotButton.setEnabled(false);
        espressoDoubleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espressoDoubleShotButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(americanoSingleShotButton);
        americanoSingleShotButton.setText("Americano single shot");
        americanoSingleShotButton.setEnabled(false);
        americanoSingleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoSingleShotButtonActionPerformed(evt);
            }
        });

        buttonGroup.add(americanoDoubleShotButton);
        americanoDoubleShotButton.setText("Americano double shot");
        americanoDoubleShotButton.setEnabled(false);
        americanoDoubleShotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americanoDoubleShotButtonActionPerformed(evt);
            }
        });

        stopButton.setBackground(new java.awt.Color(255, 0, 51));
        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Make your choice:");

        makeCoffeeButton.setText("Make Coffee");
        makeCoffeeButton.setEnabled(false);
        makeCoffeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeCoffeeButtonActionPerformed(evt);
            }
        });

        stateTextArea.setBackground(new java.awt.Color(204, 204, 204));
        stateTextArea.setColumns(20);
        stateTextArea.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        stateTextArea.setRows(5);
        jScrollPane1.setViewportView(stateTextArea);

        fillBeansButton.setText("Fill Beans");
        fillBeansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillBeansButtonActionPerformed(evt);
            }
        });

        fillWaterButton.setText("Fill Water");
        fillWaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillWaterButtonActionPerformed(evt);
            }
        });

        cleanButton.setText("Clean");
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(americanoDoubleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(espressoDoubleShotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(espressoSingleShotButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(americanoSingleShotButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(makeCoffeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fillBeansButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cleanButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fillWaterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espressoSingleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espressoDoubleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(americanoSingleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(americanoDoubleShotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(makeCoffeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(fillBeansButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fillWaterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleanButton)
                .addGap(28, 28, 28))
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            c1.start();
            espressoSingleShotButton.setEnabled(true);
            espressoDoubleShotButton.setEnabled(true);
            americanoSingleShotButton.setEnabled(true);
            americanoDoubleShotButton.setEnabled(true);
            stopButton.setEnabled(true);
        } 
        catch (OutOfBeansException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the beans container, please.");
        }
        
        catch (OutOfWaterException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the water container, please.");
        }
        
        catch (CleanException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Clean the waste tray, please.");
        }
        
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Something wrong!!!");
        }
        startButton.setEnabled(false);
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void makeCoffeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeCoffeeButtonActionPerformed
        try {
            if (espressoSingleShotButton.isSelected()) {
                c1.makeCupOfCoffee(1);
            }
            if (espressoDoubleShotButton.isSelected()) {
                c1.makeCupOfCoffee(2);
            }
            if (americanoSingleShotButton.isSelected()) {
                c1.makeCupOfCoffee(3);
            }
            if (americanoDoubleShotButton.isSelected()) {
                c1.makeCupOfCoffee(4);
            }
        } catch (OutOfBeansException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the beans container, please.");
        }
        
        catch (OutOfWaterException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Fill the water container, please.");
        }
        
        catch (CleanException ex) {
            JOptionPane.showMessageDialog(this, "Something wrong, Clean the waste tray, please.");
        }
        
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Something wrong!!!");
        }
        
        buttonGroup.clearSelection();
        makeCoffeeButton.setEnabled(false);
        stateTextArea.append(c1.getState());
        
    }//GEN-LAST:event_makeCoffeeButtonActionPerformed

    private void espressoSingleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espressoSingleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_espressoSingleShotButtonActionPerformed

    private void fillBeansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillBeansButtonActionPerformed
        c1.getBeansContainer().fill();
        c1.getLogger().log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  BEANS CONTAINER FILLED\n");
    }//GEN-LAST:event_fillBeansButtonActionPerformed

    private void fillWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillWaterButtonActionPerformed
        c1.getWaterContainer().fill();
        c1.getLogger().log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  WATER CONTAINER FILLED\n");
    }//GEN-LAST:event_fillWaterButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        c1.getWasteTray().clean();
        c1.getLogger().log(c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/" + c.get(Calendar.YEAR)  + "--" + c.get(Calendar.HOUR_OF_DAY)
                        + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "  WASTE TARY CLEANED\n");
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void espressoDoubleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espressoDoubleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_espressoDoubleShotButtonActionPerformed

    private void americanoSingleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoSingleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_americanoSingleShotButtonActionPerformed

    private void americanoDoubleShotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americanoDoubleShotButtonActionPerformed
        makeCoffeeButton.setEnabled(true);
    }//GEN-LAST:event_americanoDoubleShotButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        stopButton.setEnabled(false);
        espressoSingleShotButton.setEnabled(false);
        espressoDoubleShotButton.setEnabled(false);
        americanoSingleShotButton.setEnabled(false);
        americanoDoubleShotButton.setEnabled(false);
        startButton.setEnabled(true);
        c1.stop();
    }//GEN-LAST:event_stopButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton americanoDoubleShotButton;
    private javax.swing.JRadioButton americanoSingleShotButton;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cleanButton;
    private javax.swing.JRadioButton espressoDoubleShotButton;
    private javax.swing.JRadioButton espressoSingleShotButton;
    private javax.swing.JButton fillBeansButton;
    private javax.swing.JButton fillWaterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeCoffeeButton;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea stateTextArea;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
