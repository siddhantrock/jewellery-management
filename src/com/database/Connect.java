package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.jewellery.Jewellery;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Connect 
{
    private Connection con;
    private Statement st;
    private PreparedStatement pst;
    
    public Connect()
    {
        try 
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jewellery_management","root","siddhu1234@#");
           st=con.createStatement();
       }
       catch (ClassNotFoundException | SQLException ex) 
       {
          ex.printStackTrace();
       }
    }
    
    public void closeConnection()
    {
        try 
        {
            st.close();
            con.close();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insertJewellery(Jewellery jewellery)
    {
        int i=0;
        
        try 
        {
            pst=con.prepareStatement("insert into table1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try 
        {
            File f=new File(jewellery.getImage_path());
            FileInputStream fis=new FileInputStream(f);
            
            pst.setString(1, jewellery.getId());
            pst.setString(2, jewellery.getName());
            pst.setString(3, jewellery.getType());
            pst.setString(4, jewellery.getCategory());
            pst.setFloat(5, jewellery.getGold_weight());
            pst.setFloat(6, jewellery.getSilver_weight());
            pst.setFloat(7, jewellery.getTunch());
            pst.setFloat(8, jewellery.getPure_gold_weight());
            pst.setFloat(9, jewellery.getPure_silver_weight());
            pst.setInt(10, jewellery.getRate());
            pst.setFloat(11, jewellery.getLabour_charge());
            pst.setInt(12, jewellery.getRupess());
            pst.setString(13, jewellery.getDate());
            pst.setString(14, jewellery.getDescription());
            pst.setBinaryStream(15, fis, f.length());
            
            i=pst.executeUpdate();
            
        } 
        catch (FileNotFoundException | SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
