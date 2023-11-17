/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import View.VcashierPOS;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MaddItemCart {
    
    //CURRENTLY THIS IS NOT USING
    public void addItem(String billno)
    {
        int count=0;
        try
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("SELECT COUNT(*) FROM orders WHERE OrderBILL = '"+billno+"'");
            
            if (rs.next()) 
            {
                count=rs.getInt(1);
                
            }
           if(count>0)
           {
              VcashierPOS obj=new VcashierPOS();
              obj.addItemCart();
            
           }
            else
            {
                billToDB(billno);
                VcashierPOS obj=new VcashierPOS();
                obj.addItemCart();
            
            }
            
            
        st.close();
        rs.close();
        }
        
       
        catch (SQLException ex) 
        {
           JOptionPane.showMessageDialog(null,ex.getMessage());  
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage());
 
        }
    }
    
    
    
    public void billToDB(String billno)
    {    
        
        try
        {
            
            Statement st =MDBconnection.connectDB().createStatement();
            st.executeUpdate("insert into orders (OrderBILL) values ('"+billno+"')");
            
            st.close();
            
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    
    
    
}
