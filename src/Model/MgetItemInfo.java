/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.awt.Image;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MgetItemInfo {
    
    public void getItems(String type)
    {
        // currently iam not using this code
        try 
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("SELECT Item_name FROM menuitem WHERE Category='"+type+"' and item_availability='Available ';");
            while(rs.next())
            {
                String itemlist=rs.getString("Category");
                
                
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex.getMessage());
 
        }
    }
    
    
    public double getprice(String selectvalue )
    {
         double price=0;
        try 
        {
            
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT Item_price from menuitem WHERE Item_name='"+selectvalue+"';");
           
           
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the price from the result set
            price = rs.getDouble("Item_price");
           
            
        } 
        else
        {
            return price;
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
         return price; 
         
         
       
    }
    
    // this code is use to get itemID
    
    public String getItemID(String selectvalue )
    {
        String itemID=""; 
        try 
        {
            
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT ItemID from menuitem WHERE Item_name='"+selectvalue+"';");

        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the itemid from the result set
            itemID = rs.getString("ItemID");
        
        } 
        else
        {
          //nothing
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
         return itemID; 
         
         
       
    }
    
    
    
    
   
    
    
    
    
    
    
}
