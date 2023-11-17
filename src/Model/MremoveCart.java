/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class MremoveCart {
    
    public  void deleteSelectedRow(int recordId) {
        try
        {
            //connection.setAutoCommit(false);
            Statement st=MDBconnection.connectDB().createStatement();
            st.executeUpdate("DELETE FROM orderitems WHERE OrderItemID = '"+recordId+"'");
            
            st.close();
            
            //connection.commit();
            //connection.setAutoCommit(true);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "SQL exception error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Please Try Again: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

      
    }

    


    
    
    
    
}
