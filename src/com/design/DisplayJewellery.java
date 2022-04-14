package com.design;

import com.database.Connect;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.AreaBreakType;
import com.itextpdf.layout.property.TextAlignment;
import com.jewellery.Jewellery;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class DisplayJewellery extends javax.swing.JFrame 
{
    Connect connect;
    ResultSet rs;
    String id;
    String table;
    int row;
    
    public DisplayJewellery() 
    {
        initComponents();
    }
    
    public void setData(Connect connect, ResultSet rs,String table)
    {
        this.connect = connect;
        this.rs = rs;
        this.table = table;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sell_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        data_report_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Category", "Date", "Rupess"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        sell_btn.setText("Sell");
        sell_btn.setEnabled(false);
        sell_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sell_btnActionPerformed(evt);
            }
        });

        update_btn.setText("Update");
        update_btn.setEnabled(false);

        data_report_btn.setText("Data report");
        data_report_btn.setEnabled(false);
        data_report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_report_btnActionPerformed(evt);
            }
        });

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(sell_btn)
                .addGap(114, 114, 114)
                .addComponent(update_btn)
                .addGap(131, 131, 131)
                .addComponent(data_report_btn)
                .addGap(125, 125, 125)
                .addComponent(back_btn)
                .addGap(112, 112, 112)
                .addComponent(home_btn)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sell_btn)
                    .addComponent(update_btn)
                    .addComponent(data_report_btn)
                    .addComponent(back_btn)
                    .addComponent(home_btn))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        new Thread(new Runnable()
        {
            public void run()
            {
                ArrayList<Jewellery> al = new ArrayList();
                
                try 
                {
                    do
                    {
                        Jewellery jewellery = new Jewellery(rs.getString("id"), rs.getString("name"), rs.getString("type"), rs.getString("category"),
                                rs.getFloat("gold_weight"), rs.getFloat("silver_weight"), rs.getFloat("tunch"), rs.getFloat("pure_gold"), rs.getFloat("pure_silver"), 
                                rs.getInt("rate"), rs.getFloat("labour_charge"), rs.getInt("rupess"), rs.getString("date1"), rs.getString("description"));
                        al.add(jewellery);
                    }while(rs.next());
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Object[] obj = new Object[6];
                DefaultTableModel model1 = (DefaultTableModel)jTable1.getModel();
                
                for(int i=0;i<al.size();i++)
                {   
                    obj[0] = al.get(i).getId();
                    obj[1] = al.get(i).getName();
                    obj[2] = al.get(i).getType();
                    obj[3] = al.get(i).getCategory();
                    obj[4] = al.get(i).getDate();
                    obj[5] = al.get(i).getRupess();
                    model1.addRow(obj);
                }
                
                ListSelectionModel model = jTable1.getSelectionModel();
                model.addListSelectionListener(new ListSelectionListener()
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        if(! model.isSelectionEmpty())
                        {
                            if(table.equals("table1"))
                            {
                                sell_btn.setEnabled(true);
                                update_btn.setEnabled(true);
                                data_report_btn.setEnabled(true);
                            }
                            else if(table.equals("table2"))
                            {
                                data_report_btn.setEnabled(true);
                            }
                                 
                            if(model1.getValueAt(model.getMinSelectionIndex(),0) == "")
                            {
                                jTable1.setSelectionMode(0);
                                return;
                            }
                            
                            id = model1.getValueAt(model.getMinSelectionIndex(),0)+"";
                            row = model.getMinSelectionIndex();
                            
                            
                        }
                        else
                        {
                            sell_btn.setEnabled(false);
                            update_btn.setEnabled(false);
                            data_report_btn.setEnabled(false);
                        }
                    }
                    
                });
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

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                new Searching().setVisible(true);
                connect.closeConnection();
                dispose();
            }
        }).start();
        
    }//GEN-LAST:event_back_btnActionPerformed

    private void sell_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sell_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                int i = JOptionPane.showConfirmDialog(DisplayJewellery.this, "Do you really want to delete this record");
            
                 if(i != 0)
                {
                    return;
                }
                 
                int price = Integer.parseInt(JOptionPane.showInputDialog(DisplayJewellery.this, "Enter sell price"));
                
                SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                String date = sdf.format(new Date());
                
                boolean flag = connect.deleteJewellery(id, price, date);
                
                if(flag == true)
                {
                    JOptionPane.showMessageDialog(DisplayJewellery.this, "Deletion Successfull");
                    if(row != -1)
                    {
                        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                        model.removeRow(row);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(DisplayJewellery.this, "Something went wrong please try again later");
                    return;
                }
                
            }
        }).start();
        
    }//GEN-LAST:event_sell_btnActionPerformed

    private void data_report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_report_btnActionPerformed

        new Thread(new Runnable()
        {
            public void run()
            {
                String file_name = "Report.pdf";
                ResultSet rs = connect.getJewellery(id, table);
                
                try 
                {
                    if(rs.next())
                    {
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(DisplayJewellery.this, "Something went wrong please try again later");
                    }
                }
                catch (SQLException ex) 
                {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                PdfWriter writer=null;
        
                try 
                {
                  writer = new PdfWriter(file_name);
                }
                catch (FileNotFoundException ex) 
                {
                   //Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                PdfDocument pdfDoc=new PdfDocument(writer);
        
                Document document = new Document(pdfDoc);
         
                float cloumn[]={500f,500f};
                Table table1=new Table(cloumn);
                
                Cell id_c = new Cell();
                id_c.add(new Paragraph("ID").setBold());
                id_c.setBorder(Border.NO_BORDER);
                id_c.setTextAlignment(TextAlignment.CENTER);
                id_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(id_c);
                
                Cell id_c1 = new Cell();
                try {
                    id_c1.add(new Paragraph(rs.getString("id")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                id_c1.setBorder(Border.NO_BORDER);
                id_c1.setTextAlignment(TextAlignment.CENTER);
                id_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(id_c1);
                
                Cell thing_c = new Cell();
                thing_c.add(new Paragraph("name").setBold());
                thing_c.setBorder(Border.NO_BORDER);
                thing_c.setTextAlignment(TextAlignment.CENTER);
                thing_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_c);
                
                Cell thing_c1 = new Cell();
                try {
                    thing_c1.add(new Paragraph(rs.getString("name")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_c1.setBorder(Border.NO_BORDER);
                thing_c1.setTextAlignment(TextAlignment.CENTER);
                thing_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_c1);
                
                Cell type_c = new Cell();
                type_c.add(new Paragraph("Type").setBold());
                type_c.setBorder(Border.NO_BORDER);
                type_c.setTextAlignment(TextAlignment.CENTER);
                type_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(type_c);
                
                Cell type_c1 = new Cell();
                try {
                    type_c1.add(new Paragraph(rs.getString("type")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                type_c1.setBorder(Border.NO_BORDER);
                type_c1.setTextAlignment(TextAlignment.CENTER);
                type_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(type_c1);
                
                Cell n_gold_c = new Cell();
                n_gold_c.add(new Paragraph("Gold weight").setBold());
                n_gold_c.setBorder(Border.NO_BORDER);
                n_gold_c.setTextAlignment(TextAlignment.CENTER);
                n_gold_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_gold_c);
                
                Cell n_gold_c1 = new Cell();
                try {
                    n_gold_c1.add(new Paragraph(rs.getFloat("gold_weight") + ""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_gold_c1.setBorder(Border.NO_BORDER);
                n_gold_c1.setTextAlignment(TextAlignment.CENTER);
                n_gold_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_gold_c1);
                
                Cell n_silver_c = new Cell();
                n_silver_c.add(new Paragraph("Silver weight").setBold());
                n_silver_c.setBorder(Border.NO_BORDER);
                n_silver_c.setTextAlignment(TextAlignment.CENTER);
                n_silver_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_silver_c);
                
                Cell n_silver_c1 = new Cell();
                try {
                    n_silver_c1.add(new Paragraph(rs.getFloat("silver_weight")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_silver_c1.setBorder(Border.NO_BORDER);
                n_silver_c1.setTextAlignment(TextAlignment.CENTER);
                n_silver_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_silver_c1);
                
                Cell n_total_c = new Cell();
                n_total_c.add(new Paragraph("Tunch").setBold());
                n_total_c.setBorder(Border.NO_BORDER);
                n_total_c.setTextAlignment(TextAlignment.CENTER);
                n_total_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_total_c);
                
                Cell n_total_c1 = new Cell();
                try {
                    n_total_c1.add(new Paragraph(rs.getFloat("tunch")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                n_total_c1.setBorder(Border.NO_BORDER);
                n_total_c1.setTextAlignment(TextAlignment.CENTER);
                n_total_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(n_total_c1);
                
                Cell thing_date_c = new Cell();
                thing_date_c.add(new Paragraph("Pure gold").setBold());
                thing_date_c.setBorder(Border.NO_BORDER);
                thing_date_c.setTextAlignment(TextAlignment.CENTER);
                thing_date_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date_c);
                
                Cell thing_date_c1 = new Cell();
                try {
                    thing_date_c1.add(new Paragraph(rs.getFloat("pure_gold")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                thing_date_c1.setBorder(Border.NO_BORDER);
                thing_date_c1.setTextAlignment(TextAlignment.CENTER);
                thing_date_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(thing_date_c1);
                
                Cell interest_c = new Cell();
                interest_c.add(new Paragraph("Pure silver").setBold());
                interest_c.setBorder(Border.NO_BORDER);
                interest_c.setTextAlignment(TextAlignment.CENTER);
                interest_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(interest_c);
                
                Cell interest_c1 = new Cell();
                try {
                    interest_c1.add(new Paragraph(rs.getFloat("pure_silver")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                interest_c1.setBorder(Border.NO_BORDER);
                interest_c1.setTextAlignment(TextAlignment.CENTER);
                interest_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(interest_c1);
                
                Cell g_gold_c = new Cell();
                g_gold_c.add(new Paragraph("Rate").setBold());
                g_gold_c.setBorder(Border.NO_BORDER);
                g_gold_c.setTextAlignment(TextAlignment.CENTER);
                g_gold_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_gold_c);
                
                Cell g_gold_c1 = new Cell();
                try {
                    g_gold_c1.add(new Paragraph(rs.getInt("rate")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                g_gold_c1.setBorder(Border.NO_BORDER);
                g_gold_c1.setTextAlignment(TextAlignment.CENTER);
                g_gold_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_gold_c1);
                
                Cell g_silver_c = new Cell();
                g_silver_c.add(new Paragraph("Labour charge").setBold());
                g_silver_c.setBorder(Border.NO_BORDER);
                g_silver_c.setTextAlignment(TextAlignment.CENTER);
                g_silver_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_silver_c);
                
                Cell g_silver_c1 = new Cell();
                try {
                    g_silver_c1.add(new Paragraph(rs.getFloat("labour_charge")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                g_silver_c1.setBorder(Border.NO_BORDER);
                g_silver_c1.setTextAlignment(TextAlignment.CENTER);
                g_silver_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(g_silver_c1);
                
                Cell rupess_c = new Cell();
                rupess_c.add(new Paragraph("Rupess").setBold());
                rupess_c.setBorder(Border.NO_BORDER);
                rupess_c.setTextAlignment(TextAlignment.CENTER);
                rupess_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(rupess_c);
                
                Cell rupess_c1 = new Cell();
                try {
                    rupess_c1.add(new Paragraph(rs.getInt("rupess")+""));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                rupess_c1.setBorder(Border.NO_BORDER);
                rupess_c1.setTextAlignment(TextAlignment.CENTER);
                rupess_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(rupess_c1);
                
                Cell date_diff_c = new Cell();
                date_diff_c.add(new Paragraph("Date").setBold());
                date_diff_c.setBorder(Border.NO_BORDER);
                date_diff_c.setTextAlignment(TextAlignment.CENTER);
                date_diff_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(date_diff_c);
                
                Cell date_diff_c1 = new Cell();
                try {
                    date_diff_c1.add(new Paragraph(rs.getString("date1")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                date_diff_c1.setBorder(Border.NO_BORDER);
                date_diff_c1.setTextAlignment(TextAlignment.CENTER);
                date_diff_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(date_diff_c1);
                
                Cell si_c = new Cell();
                si_c.add(new Paragraph("Description").setBold());
                si_c.setBorder(Border.NO_BORDER);
                si_c.setTextAlignment(TextAlignment.CENTER);
                si_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(si_c);
                
                Cell si_c1 = new Cell();
                try {
                    si_c1.add(new Paragraph(rs.getString("description")));
                } catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                si_c1.setBorder(Border.NO_BORDER);
                si_c1.setTextAlignment(TextAlignment.CENTER);
                si_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(si_c1);
                
                Cell total_c = new Cell();
                total_c.add(new Paragraph("Picture").setBold());
                total_c.setBorder(Border.NO_BORDER);
                total_c.setTextAlignment(TextAlignment.CENTER);
                total_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(total_c);
                
                Cell total_c1 = new Cell();
                try {
                     InputStream is=rs.getBinaryStream(15);
                     FileOutputStream fos=new FileOutputStream("a.jpg");
                
                     byte b1[]=new byte[5000];
                
                     int c;
                     while((c=is.read(b1)) >0)
                     {
                       fos.write(b1, 0, c);
                       fos.flush();
                     }
                     
                     
                     ImageData data = ImageDataFactory.create("a.jpg");
                     Image image = new Image(data);
                     
                    total_c1.add(image.setAutoScale(true));
                } catch (SQLException | FileNotFoundException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                total_c1.setBorder(Border.NO_BORDER);
                total_c1.setTextAlignment(TextAlignment.CENTER);
                total_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                table1.addCell(total_c1);
                
                if(table.equals("table2"))
                {
                    Cell pending_date_c = new Cell();
                    pending_date_c.add(new Paragraph("Sell price").setBold());
                    pending_date_c.setBorder(Border.NO_BORDER);
                    pending_date_c.setTextAlignment(TextAlignment.CENTER);
                    pending_date_c.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(pending_date_c);
                
                    Cell pending_date_c1 = new Cell();
                    try {
                        pending_date_c1.add(new Paragraph(rs.getString("sell_price")));
                    } catch (SQLException ex) {
                         Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pending_date_c1.setBorder(Border.NO_BORDER);
                    pending_date_c1.setTextAlignment(TextAlignment.CENTER);
                    pending_date_c1.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(pending_date_c1);
                    
                    Cell pending_date_c11 = new Cell();
                    pending_date_c11.add(new Paragraph("Sell date").setBold());
                    pending_date_c11.setBorder(Border.NO_BORDER);
                    pending_date_c11.setTextAlignment(TextAlignment.CENTER);
                    pending_date_c11.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(pending_date_c11);
                
                    Cell pending_date_c2 = new Cell();
                    try {
                        pending_date_c2.add(new Paragraph(rs.getString("date2")));
                    } catch (SQLException ex) {
                         Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pending_date_c2.setBorder(Border.NO_BORDER);
                    pending_date_c2.setTextAlignment(TextAlignment.CENTER);
                    pending_date_c2.setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f);
                    table1.addCell(pending_date_c2);
                }
                
                document.add(table1);
                
                document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
                document.add(new Paragraph("Description").setBold().setBackgroundColor(com.itextpdf.kernel.colors.Color.convertCmykToRgb(DeviceCmyk.CYAN), .10f));
                try 
                {
                    if(rs.getString("description") == null)
                    {
                        
                    }
                    else
                    {
                        document.add(new Paragraph(rs.getString("description")));
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
                document.close();
                
                
                try 
                {
                    Desktop.getDesktop().open(new File("Report.pdf"));
                }
                catch (IOException ex) 
                {
                    Logger.getLogger(DisplayJewellery.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        
    }//GEN-LAST:event_data_report_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayJewellery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton data_report_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sell_btn;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
