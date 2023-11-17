
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;

public class MshowOrders {
    // THIS CODE IS USED TO RETIVE DATABASE DEATILS TO THE JTABLE

    public String[] showOrdersTbl(String todayDate) {
        String[] tbdata = null;

    try {
        Statement st = MDBconnection.connectDB().createStatement();
        ResultSet rs = st.executeQuery("select OrderBILL, customerTel, OrderDate, OrderTime, OrderType, OrderStatus, OrderTotal,PaidAmount,Balance from Orders where OrderDate='" + todayDate + "' ");

        // Using ArrayList to dynamically store results
        ArrayList<String> allitem = new ArrayList<>();

        while (rs.next()) 
        {
             String Bill = rs.getString("OrderBILL");
            String cusTel = rs.getString("customerTel");
            String date = rs.getString("OrderDate");
            String time = rs.getString("OrderTime");
            String type = rs.getString("OrderType");
            String sta = rs.getString("OrderStatus");
            String total = String.valueOf(rs.getInt("OrderTotal"));
            String paid = String.valueOf(rs.getInt("PaidAmount"));
            String balance = String.valueOf(rs.getInt("Balance"));
           

            
            
            
             // Adding each result set data to the ArrayList
            allitem.add(Bill);
            allitem.add(cusTel);
            allitem.add(date);
            allitem.add(time);
            allitem.add(type);
            allitem.add(sta);
            allitem.add(total);
            allitem.add(paid);
            allitem.add(balance);
        }
           

        tbdata = allitem.toArray(new String[0]);

       
        
        
    }
    catch (SQLException ex)
    {
        JOptionPane.showMessageDialog(null, ex.getMessage());
         
    } 
    catch (Exception ex) 
    {
     JOptionPane.showMessageDialog(null, ex.getMessage());

        
    }

     // Return the 2D array
        return tbdata;
}
}

