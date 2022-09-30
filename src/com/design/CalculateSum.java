package com.design;

import com.database.Connect;
import javax.swing.JOptionPane;

public class CalculateSum extends javax.swing.JFrame 
{

    Connect connect;
    
    public CalculateSum() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        table_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        type_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        category_combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        g_weight_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        s_weight_txt = new javax.swing.JTextField();
        calculate_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        sell_btn = new javax.swing.JButton();
        total_gold_btn = new javax.swing.JButton();
        total_silver_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Select table");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 80, -1, -1));

        table_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        table_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "table1", "table2" }));
        getContentPane().add(table_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 77, 168, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Select type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 173, -1, -1));

        type_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOLD", "SILVER" }));
        type_combo.setSelectedIndex(-1);
        getContentPane().add(type_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 170, 168, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Select category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 260, -1, -1));

        category_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        category_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANGLE", "BASER", "CHAIN", "HAAR", "JHALA", "JHUMAD", "JHUMKI", "KUNDAL", "KUNDALIYA", "PANDAL", "RING", "TIKKA", "TOPAS" }));
        category_combo.setSelectedIndex(-1);
        getContentPane().add(category_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 257, 168, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Gold weight");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 343, -1, -1));

        g_weight_txt.setEditable(false);
        g_weight_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(g_weight_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 337, 168, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Silver weight");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 407, -1, -1));

        s_weight_txt.setEditable(false);
        s_weight_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(s_weight_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 404, 168, -1));

        calculate_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        calculate_btn.setText("Calculate");
        calculate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_btnActionPerformed(evt);
            }
        });
        getContentPane().add(calculate_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        home_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, -1, -1));

        sell_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sell_btn.setText("Calculate sell");
        sell_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sell_btnActionPerformed(evt);
            }
        });
        getContentPane().add(sell_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, -1));

        total_gold_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        total_gold_btn.setText("Total gold");
        total_gold_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_gold_btnActionPerformed(evt);
            }
        });
        getContentPane().add(total_gold_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, -1, -1));

        total_silver_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        total_silver_btn.setText("Total silver");
        total_silver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_silver_btnActionPerformed(evt);
            }
        });
        getContentPane().add(total_silver_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Home().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_home_btnActionPerformed

    private void calculate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String type,category;
                int sum;
                
                type = type_combo.getItemAt(type_combo.getSelectedIndex());
                category = category_combo.getItemAt(category_combo.getSelectedIndex());
                sum = connect.getCalculate(type,category,table_combo.getSelectedItem().toString());
                
                if(type.equals("GOLD"))
                {
                    g_weight_txt.setText(sum+"gm");
                }
                else if(type.equals("SILVER"))
                {
                    s_weight_txt.setText(sum+"gm");
                }
            }
        }).start();
        
    }//GEN-LAST:event_calculate_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

    private void sell_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sell_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String year = JOptionPane.showInputDialog(CalculateSum.this, "Please enter the year");
                int sum = 0;
                
                if(!year.isEmpty())
                {
                    sum = connect.getSellSum(year);
                }
                
                JOptionPane.showMessageDialog(CalculateSum.this, "Profit = " + sum);
            }
        }).start();
        
    }//GEN-LAST:event_sell_btnActionPerformed

    private void total_gold_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_gold_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                int sum = connect.getGoldSum(table_combo.getSelectedItem().toString());
                
                JOptionPane.showMessageDialog(CalculateSum.this, "Total Gold = " + sum + "gm");
            }
        }).start();
        
    }//GEN-LAST:event_total_gold_btnActionPerformed

    private void total_silver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_silver_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                int sum = connect.getSilverSum(table_combo.getSelectedItem().toString());
                
                JOptionPane.showMessageDialog(CalculateSum.this, "Total Silver = " + sum + "gm");
            }
        }).start();
        
    }//GEN-LAST:event_total_silver_btnActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateSum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateSum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate_btn;
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JTextField g_weight_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField s_weight_txt;
    private javax.swing.JButton sell_btn;
    private javax.swing.JComboBox<String> table_combo;
    private javax.swing.JButton total_gold_btn;
    private javax.swing.JButton total_silver_btn;
    private javax.swing.JComboBox<String> type_combo;
    // End of variables declaration//GEN-END:variables
}
