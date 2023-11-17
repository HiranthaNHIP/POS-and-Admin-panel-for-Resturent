
package Model;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MDBconnection {
    
    static Connection conn;
    
    public static Connection connectDB()
    {
        try 
        {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    
}
