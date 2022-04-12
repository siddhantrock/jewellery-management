package com.design;

public class Home extends javax.swing.JFrame 
{
    public Home() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_jewellery_btn = new javax.swing.JButton();
        find_jewellery_btn = new javax.swing.JButton();
        calculate_sum_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(Home.MAXIMIZED_BOTH);

        add_jewellery_btn.setText("Add jewellery");
        add_jewellery_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_jewellery_btnActionPerformed(evt);
            }
        });

        find_jewellery_btn.setText("Find jewellery");
        find_jewellery_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_jewellery_btnActionPerformed(evt);
            }
        });

        calculate_sum_btn.setText("Calculate sum");
        calculate_sum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_sum_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(add_jewellery_btn)
                .addGap(127, 127, 127)
                .addComponent(find_jewellery_btn)
                .addGap(154, 154, 154)
                .addComponent(calculate_sum_btn)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_jewellery_btn)
                    .addComponent(find_jewellery_btn)
                    .addComponent(calculate_sum_btn))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_jewellery_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_jewellery_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new AddJewellery().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_add_jewellery_btnActionPerformed

    private void find_jewellery_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_jewellery_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Searching().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_find_jewellery_btnActionPerformed

    private void calculate_sum_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_sum_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new CalculateSum().setVisible(true);
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_calculate_sum_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_jewellery_btn;
    private javax.swing.JButton calculate_sum_btn;
    private javax.swing.JButton find_jewellery_btn;
    // End of variables declaration//GEN-END:variables
}
