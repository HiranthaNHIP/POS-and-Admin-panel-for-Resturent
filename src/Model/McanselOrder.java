
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;


public class McanselOrder {
    
    
    public  void deleteSelectedRow(String bill) {
       int option = JOptionPane.showConfirmDialog(null, "Are You You Want To Cansel This Order", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (option == JOptionPane.YES_OPTION)
                {
                     try
                    {
                      //connection.setAutoCommit(false);
                      Statement st=MDBconnection.connectDB().createStatement();
                      st.executeUpdate("update orders set OrderStatus='Canseled'where OrderBILL='"+bill+"'");

                     st.close();
            
           
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
    
}
