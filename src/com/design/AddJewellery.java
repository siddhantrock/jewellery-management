package com.design;

import com.database.Connect;
import com.jewellery.Jewellery;
import java.awt.FileDialog;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddJewellery extends javax.swing.JFrame 
{

    Connect connect;
    String file_name;
    String file_path;
    String full_path;
    String id;
    int id_count;
    
    public AddJewellery() 
    {
        initComponents();
        id_combo.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            
            public void keyReleased(KeyEvent event)
                {
                    getIdCount(event);
                }
         });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id_combo = new javax.swing.JComboBox<>();
        name_txt = new javax.swing.JTextField();
        type_combo = new javax.swing.JComboBox<>();
        category_combo = new javax.swing.JComboBox<>();
        gold_weight_txt = new javax.swing.JTextField();
        silver_weight_txt = new javax.swing.JTextField();
        tunch_txt = new javax.swing.JTextField();
        pure_gold_weight_txt = new javax.swing.JTextField();
        pure_silver_weight_txt = new javax.swing.JTextField();
        rate_txt = new javax.swing.JTextField();
        labour_charge_txt = new javax.swing.JTextField();
        rupess_txt = new javax.swing.JTextField();
        dt_picker = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        description_txt = new javax.swing.JTextArea();
        browse_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(AddJewellery.MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Enter name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Select type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Select category");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 289, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Enter gold weight");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 371, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Enter silver weight");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 452, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Enter tunch");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 536, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Enter pure gold weight");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 646, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Enter pure silver weight");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 741, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Enter rate");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 832, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Enter labour charge");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 921, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Enter rupess");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 1012, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Enter date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 1115, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Enter description");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 1219, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Browse image");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 1343, -1, -1));

        id_combo.setEditable(true);
        id_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        id_combo.setAutoscrolls(true);
        jPanel1.add(id_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 200, -1));

        name_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 199, -1));

        type_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        type_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOLD", "SILVER" }));
        type_combo.setSelectedItem(null);
        type_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                type_comboItemStateChanged(evt);
            }
        });
        jPanel1.add(type_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 199, -1));

        category_combo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(category_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, 199, -1));

        gold_weight_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(gold_weight_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, 199, -1));

        silver_weight_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(silver_weight_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 199, -1));

        tunch_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tunch_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tunch_txtKeyReleased(evt);
            }
        });
        jPanel1.add(tunch_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 199, -1));

        pure_gold_weight_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(pure_gold_weight_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 650, 199, -1));

        pure_silver_weight_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(pure_silver_weight_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 750, 199, -1));

        rate_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(rate_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 840, 199, -1));

        labour_charge_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labour_charge_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labour_charge_txtKeyReleased(evt);
            }
        });
        jPanel1.add(labour_charge_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 930, 199, -1));

        rupess_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(rupess_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1020, 199, -1));

        dt_picker.setDateFormatString("MM/dd/yyyy");
        dt_picker.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(dt_picker, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1130, 199, -1));

        description_txt.setColumns(20);
        description_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        description_txt.setRows(5);
        jScrollPane2.setViewportView(description_txt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1180, 199, -1));

        browse_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        browse_btn.setText("Browse");
        browse_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_btnActionPerformed(evt);
            }
        });
        jPanel1.add(browse_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 1350, -1, -1));

        add_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 1410, 69, -1));

        home_btn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        jPanel1.add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1410, 92, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/resource/16067961-Jewelry-earrings-on-light-silk-background-Stock-Vector-jewellery.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        
        new Thread(new Runnable()
        {
            public void run()
            {
                String id,name,type,category,date,description;
                float gold_weight,silver_weight,tunch,pure_gold_weight,pure_silver_weight,labour;
                int rate,rupess;
                
                id = id_combo.getItemAt(id_combo.getSelectedIndex()).toUpperCase();
                for(int i=0;i<id.length();i++)
                {
                    if(id.charAt(i) >= 65 && id.charAt(i) <=90)
                    {
                        
                    }
                    else if(id.charAt(i) >= 48 && id.charAt(i) <= 57)
                    {
                        AddJewellery.this.id = id.substring(0, i);
                        AddJewellery.this.id_count = Integer.parseInt(id.substring(i));
                    }
                }
                
                name = name_txt.getText().toUpperCase();
                
                type = type_combo.getItemAt(type_combo.getSelectedIndex()).toUpperCase();
                category = category_combo.getItemAt(category_combo.getSelectedIndex()).toUpperCase();
                
                gold_weight = Float.parseFloat(gold_weight_txt.getText());
                silver_weight = Float.parseFloat(silver_weight_txt.getText());
                
                tunch = Float.parseFloat(tunch_txt.getText());
                
                pure_gold_weight = Float.parseFloat(pure_gold_weight_txt.getText());
                pure_silver_weight = Float.parseFloat(pure_silver_weight_txt.getText());
                
                rate = Integer.parseInt(rate_txt.getText());
                
                labour = Float.parseFloat(labour_charge_txt.getText());
                
                rupess = (int)Float.parseFloat(rupess_txt.getText());
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
                date = sdf.format(dt_picker.getDate());
                
                description = description_txt.getText().toUpperCase();
                
                Jewellery jewellery = new Jewellery(id, name, type, category, gold_weight, silver_weight, tunch, pure_gold_weight, pure_silver_weight, rate, labour, rupess, date, description, full_path);
                int i = jewellery.addJewellery(connect,AddJewellery.this.id,AddJewellery.this.id_count);
                
                if(i>0)
                {
                    JOptionPane.showMessageDialog(AddJewellery.this, "successfully jewellery added","Information",JOptionPane.INFORMATION_MESSAGE);
                          new Home().setVisible(true);
                          dispose();
                }
            }
        }).start();
        
    }//GEN-LAST:event_add_btnActionPerformed

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                connect = new Connect();
                Date obj = new Date();
                dt_picker.setDate(obj);
            }
        }).start();
        
    }//GEN-LAST:event_formWindowOpened

    private void browse_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                FileDialog file_dialog=new FileDialog(AddJewellery.this,"choose file",FileDialog.LOAD);
                file_dialog.setVisible(true);
                
                while(file_name==null)
                {
                    file_name=file_dialog.getFile();
                }
                
                file_name=file_dialog.getFile();
                file_path=file_dialog.getDirectory();
                full_path=file_path+file_name;
            }
        }).start();
        
    }//GEN-LAST:event_browse_btnActionPerformed

    private void type_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_type_comboItemStateChanged

        new Thread(new Runnable()
        {
            public void run()
            {
                switch (type_combo.getItemAt(type_combo.getSelectedIndex())) 
                {
                    case "GOLD":
                        gold_weight_txt.setEnabled(true);
                        gold_weight_txt.setText("");
                        
                        pure_gold_weight_txt.setEnabled(true);
                        pure_gold_weight_txt.setText("");
                        
                        silver_weight_txt.setText("0");
                        silver_weight_txt.setEnabled(false);
                        
                        pure_silver_weight_txt.setEnabled(false);
                        pure_silver_weight_txt.setText("0");
                        category_combo.removeAllItems();
                        
                        category_combo.addItem("BANGLE");
                        category_combo.addItem("BASER");
                        category_combo.addItem("CHAIN");
                        category_combo.addItem("HAAR");
                        category_combo.addItem("JHALA");
                        category_combo.addItem("JHUMAD");
                        category_combo.addItem("JHUMKI");
                        category_combo.addItem("KUNDAL");
                        category_combo.addItem("KUNDALIYA");
                        category_combo.addItem("PANDAL");
                        category_combo.addItem("RING");
                        category_combo.addItem("TIKKA");
                        category_combo.addItem("TOPAS");
                        
                        break;
                    
                    case "SILVER":
                        silver_weight_txt.setEnabled(true);
                        silver_weight_txt.setText("");
                        
                        pure_silver_weight_txt.setEnabled(true);
                        pure_silver_weight_txt.setText("");
                        
                        gold_weight_txt.setText("0");
                        gold_weight_txt.setEnabled(false);
                        
                        pure_gold_weight_txt.setEnabled(false);
                        pure_gold_weight_txt.setText("0");
                        
                        category_combo.removeAllItems();
                        
                        category_combo.addItem("BICHIYA");
                        category_combo.addItem("BICHUA");
                        category_combo.addItem("BRACELET");
                        category_combo.addItem("SILVER CHAIN");
                        category_combo.addItem("CHILD KARDHANI");
                        category_combo.addItem("CHILD KHADUA");
                        category_combo.addItem("COIN");
                        category_combo.addItem("HATH PHOOL");
                        category_combo.addItem("KHADUA");
                        category_combo.addItem("SILVER MANGALSUTRA");
                        category_combo.addItem("PAYAL");
                        category_combo.addItem("TODA");
                        
                        break;
                        
                    default:
                        break;
                }
            }
        }).start();
        
    }//GEN-LAST:event_type_comboItemStateChanged

    private void tunch_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tunch_txtKeyReleased

        new Thread(new Runnable()
        {
            public void run()
            {
                switch (type_combo.getItemAt(type_combo.getSelectedIndex())) 
                {
                    case "GOLD":
                        float pure_gold = (Float.parseFloat(gold_weight_txt.getText()) * Float.parseFloat(tunch_txt.getText()))/100;
                        pure_gold_weight_txt.setText(pure_gold + "");
                        
                        break;
                    
                    case "SILVER":
                        float pure_gold1 = (Float.parseFloat(silver_weight_txt.getText()) * Float.parseFloat(tunch_txt.getText()))/100;
                        pure_silver_weight_txt.setText(pure_gold1 + "");
                        
                    default:
                        break;
                }
            }
        }).start();        
        
    }//GEN-LAST:event_tunch_txtKeyReleased

    private void labour_charge_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labour_charge_txtKeyReleased

        new Thread(new Runnable()
        {
            public void run()
            {
                switch (type_combo.getItemAt(type_combo.getSelectedIndex())) 
                {
                    case "GOLD":
                        float rupess = (Float.parseFloat(pure_gold_weight_txt.getText()) * Float.parseFloat(rate_txt.getText()))/10 + Integer.parseInt(labour_charge_txt.getText());
                        rupess_txt.setText(rupess + "");
                        
                        break;
                    
                    case "SILVER":
                        float rupess1 = (Float.parseFloat(pure_silver_weight_txt.getText()) * Float.parseFloat(rate_txt.getText()))/1000 + Integer.parseInt(labour_charge_txt.getText());
                        rupess_txt.setText(rupess1 + "");
                        
                    default:
                        break;
                }
            }
        }).start();
        
    }//GEN-LAST:event_labour_charge_txtKeyReleased

    private void getIdCount(KeyEvent event)
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                if(id_combo.getEditor().getItem().toString().equals("") )
                {
                    
                }
                else
                {
                    ResultSet rs;
                    rs = connect.get_id_count(id_combo.getEditor().getItem().toString());
                    //System.out.println(id_combo.getEditor().getItem().toString());
                    id_combo.removeAllItems();
                    try 
                    {
                        while(rs.next())
                        {
                            String str = rs.getString(1);
                            int value = rs.getInt(2) + 1;
                            str = str + value;
                            id_combo.addItem(str);
                        }
                    } 
                    catch (SQLException ex) 
                    {
                        Logger.getLogger(AddJewellery.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
    
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
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJewellery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JButton browse_btn;
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JTextArea description_txt;
    private com.toedter.calendar.JDateChooser dt_picker;
    private javax.swing.JTextField gold_weight_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JComboBox<String> id_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField labour_charge_txt;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField pure_gold_weight_txt;
    private javax.swing.JTextField pure_silver_weight_txt;
    private javax.swing.JTextField rate_txt;
    private javax.swing.JTextField rupess_txt;
    private javax.swing.JTextField silver_weight_txt;
    private javax.swing.JTextField tunch_txt;
    private javax.swing.JComboBox<String> type_combo;
    // End of variables declaration//GEN-END:variables
}
