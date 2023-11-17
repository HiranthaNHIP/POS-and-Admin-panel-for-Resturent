
package Model;


import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class MbillCalculate {
    //CALCULATE SUBTOTAL
    public double calSubtotal(String billno)
    {
        double subtotal=0;
        try 
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("select SUM(Total)AS subtotal from orderitems where OrderBILL='"+billno+"'");
            while(rs.next())
            {
              subtotal=rs.getDouble("subtotal");
            }
           
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return subtotal;
    }
    // CALCULATE TAX
    public double caltax( String billno )
    {
        double subtotal= calSubtotal(billno);
        double tax=(subtotal*0.05);
        return tax;
        
    }
    // CALCULATE SERVICE CHARGE
    public double calservice(String billno)
    {
       double subtotal= calSubtotal(billno);
       double service=(subtotal*0.1);
       return service;
    }
    //CALCULATE TOTAL CHARGE
    public double caltotal(String billno)
    {
      double subtotal= calSubtotal(billno);
      double tax=caltax(billno);
      double service=calservice(billno);
      double total= (subtotal+tax+service);
      return total;
        
    }
    
    
}
