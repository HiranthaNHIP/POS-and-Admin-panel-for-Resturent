/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class MgetCUSinfo {
    
    //THIS METHOD IS USED GET CUSTOMER NAME WHEN PHONE IS NUMBER TYPED

     public String getCusname(String telno)
    {
         String name="";
        
        try 
        {
 
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT CusName from Customer WHERE CustomerTel='"+telno+"';");
     
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the NAME from the result set
            name = rs.getString("CusName");
    
        } 
        else
        {
            
        }
           st.close();
           rs.close();
           
        } 
        
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex.getMessage());
 
        }
         return name; 
    
    }
     
     
     
     //THIS METHOD IS USED GET CUSTOMER NAME WHEN PHONE IS NUMBER TYPED
     
     public String getCusaddress(String telno)
    {
         String address="";
        
        try 
        {
 
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT CUSaddress from Customer WHERE CustomerTel='"+telno+"';");
     
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the NAME from the result set
            address = rs.getString("CUSaddress");
    
        } 
        else
        {
            
        }
           st.close();
           rs.close();
           
        } 
        
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex.getMessage());
 
        }
         return address; 
    
    }
     
     
    
    
}
