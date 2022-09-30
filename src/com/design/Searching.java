package com.design;

import com.database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Searching extends javax.swing.JFrame 
{
    Connect connect;
    
    public Searching() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        type_combo = new javax.swing.JComboBox<>();
        category_combo = new javax.swing.JComboBox<>();
        search_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        show_all_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        table_combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 137, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Select type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Select category");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 296, -1, -1));

        id_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 131, -1));

        type_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOLD", "SILVER" }));
        type_combo.setSelectedIndex(-1);
        getContentPane().add(type_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 131, -1));

        category_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        category_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANGLE", "BASER", "CHAIN", "HAAR", "JHALA", "JHUMAD", "JHUMKI", "KUNDAL", "KUNDALIYA", "PANDAL", "RING", "TIKKA", "TOPAS" }));
        category_combo.setSelectedIndex(-1);
        getContentPane().add(category_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 131, -1));

        search_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));

        home_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        getContentPane().add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        show_all_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        show_all_btn.setText("Show all");
        show_all_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_all_btnActionPerformed(evt);
            }
        });
        getContentPane().add(show_all_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Select table");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 59, -1, -1));

        table_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        table_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "table1", "table2", " " }));
        getContentPane().add(table_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 131, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String id,type="",category="",table;
                boolean id_flag = false, type_flag = false, category_flag = false;
                ResultSet rs = null;
                
                table = table_combo.getSelectedItem().toString();
                id = id_txt.getText().toUpperCase();
                
                if(type_combo.getSelectedIndex() != -1)
                {
                    type = type_combo.getSelectedItem().toString().toUpperCase();
                }
                if(category_combo.getSelectedIndex() != -1)
                {
                    category = category_combo.getSelectedItem().toString().toUpperCase();
                }
                
                if(!id.isEmpty())
                {
                    id_flag = true;
                }
                
                if(!type.isEmpty())
                {
                    type_flag = true;
                }
                
                if(!category.isEmpty())
                {
                    category_flag = true;
                }
                
                if(id_flag == true)
                {
                    rs = connect.getJewellery(id,table,"","");
                }
                else if(type_flag == true)
                {
                    rs = connect.getJewellery("",table,type,"");
                }
                else if(category_flag == true)
                {
                    rs = connect.getJewellery("",table,"",category);
                }
                
                try 
                {
                    if(rs.next())
                    {
                        DisplayJewellery dj = new DisplayJewellery();
                        dj.setData(connect, rs, table);
                        dj.setVisible(true);
                        dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Searching.this, "No record found");
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_search_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

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

    private void show_all_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_all_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                ResultSet rs = connect.getAllJewellery(table_combo.getSelectedItem().toString());
                
                try 
                {
                    if(rs.next())
                    {
                        DisplayJewellery dj = new DisplayJewellery();
                        dj.setData(connect, rs, table_combo.getSelectedItem().toString());
                        dj.setVisible(true);
                        dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(Searching.this, "No record found");
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_show_all_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searching().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JButton home_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton show_all_btn;
    private javax.swing.JComboBox<String> table_combo;
    private javax.swing.JComboBox<String> type_combo;
    // End of variables declaration//GEN-END:variables
}
