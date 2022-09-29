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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;

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
    
    public int insertJewellery(Jewellery jewellery, String id, int id_count)
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
            
            st.executeUpdate("update id_count set count=" + id_count + " where id='" + id + "'");
            
        } 
        catch (FileNotFoundException | SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
    
    public ResultSet getJewellery(String id, String table)
    {
        ResultSet rs = null;
        
        try 
        {
            rs = st.executeQuery("select * from " + table +" where id='" + id + "'");
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    public boolean deleteJewellery(String id, int sell_price, String sell_date)
    {
        boolean flag=false;
        try 
        {
            ResultSet rs = st.executeQuery("select * from table1 where id = '" + id + "'");
            
            rs.next();
            
            pst = con.prepareStatement("insert into table2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, rs.getString("id"));
            pst.setString(2, rs.getString("name"));
            pst.setString(3, rs.getString("type"));
            pst.setString(4, rs.getString("category"));
            pst.setFloat(5, rs.getFloat("gold_weight"));
            pst.setFloat(6, rs.getFloat("silver_weight"));
            pst.setFloat(7, rs.getFloat("tunch"));
            pst.setFloat(8, rs.getFloat("pure_gold"));
            pst.setFloat(9, rs.getFloat("pure_silver"));
            pst.setInt(10, rs.getInt("rate"));
            pst.setFloat(11, rs.getFloat("labour_charge"));
            pst.setInt(12, rs.getInt("rupess"));
            pst.setString(13, rs.getString("date1"));
            pst.setString(14, rs.getString("description"));
            
            InputStream is=rs.getBinaryStream("picture");
            FileOutputStream fos=new FileOutputStream("a.jpg");
                
            byte b1[]=new byte[5000];
                
            int c;
            while((c=is.read(b1)) >0)
            {
                fos.write(b1, 0, c);
                fos.flush();
            }
            
            File f=new File("a.jpg");
            FileInputStream fis=new FileInputStream(f);
            
            pst.setBinaryStream(15, fis, f.length());
            pst.setInt(16, sell_price);
            pst.setString(17, sell_date);
            
            pst.executeUpdate();
            
            st.execute("delete from table1 where id = '" + id + "'");
            
            flag = true;
        }
        catch (SQLException | IOException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return flag;
    }
    
    public ResultSet get_id_count(String xyz)
    {
        ResultSet rs = null;
        
        try 
        {
            rs = st.executeQuery("select * from id_count where id like '" + xyz + "%'");
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
