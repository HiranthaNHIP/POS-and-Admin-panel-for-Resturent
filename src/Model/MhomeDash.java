
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MhomeDash {
    
     public double getRevenue()
    {
         double revenu=0;
        
        try 
        {
 
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT SUM(OrderTotal) AS total FROM orders WHERE DATE(OrderDate) = CURDATE() and OrderStatus='Completed';");
     
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the NAME from the result set
            revenu = rs.getDouble("total");
    
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
         return revenu; 
    
    }
     
     
     
      public int getordCount()
    {
         int count=0;
        
        try 
        {
 
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT COUNT(*) AS total_orders_today FROM orders WHERE DATE(OrderDate) = CURDATE();");
     
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the NAME from the result set
            count = rs.getInt("total_orders_today");
    
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
         return count; 
    
    }
      //AVG PER ORDER
      public double avgPerOrder()
    {
         double count=0;
        
        try 
        {
 
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT AVG(OrderTotal) AS AveragePerOrder FROM orders WHERE OrderStatus = 'completed';");
     
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the NAME from the result set
            count = rs.getInt("OrderTotal");
    
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
         return count; 
    
    }
        
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    public int canselcount()
        {
         int count=0;
        
        try 
        {
 
           Statement st=MDBconnection.connectDB().createStatement();
           ResultSet rs=st.executeQuery("SELECT COUNT(*) AS canselOrd FROM orders WHERE DATE(OrderDate) = CURDATE()and OrderStatus='Canseled';");
     
        // Check if the item exists in the database
        if (rs.next()) 
        {
            // Get the NAME from the result set
            count = rs.getInt("canselOrd");
    
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
         return count; 
    
        }
         
         
         
         
         
         
    
    
    
     
}
