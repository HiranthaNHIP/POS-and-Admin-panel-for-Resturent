/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.CaddOrder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MaddOrder {
    
     public void addcusinfo(String custel, String name,String adress)
    {
        try {
    
            Statement st=MDBconnection.connectDB().createStatement();
            st.executeUpdate("insert into customer (CustomerTel,CusName,CUSaddress) values ('"+custel+"','"+name+"','"+adress+"')");
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
     
     
      public void addorder(String custel,String billno, String date,String time,String ordertype,double total,String orderstatus,double service,double tax,String table,String user)
    {
       try {
  
            Statement st=MDBconnection.connectDB().createStatement();
            int value =st.executeUpdate("update orders set customerTel='"+custel+"', TableID='"+table+"', OrderDate='"+date+"', OrderTime='"+time+"', OrderType='"+ordertype+"', OrderTotal='"+total+"', OrderStatus='"+orderstatus+"', Service_charges= '"+service+"',Tax='"+tax+"',EmpID='"+user+"' where OrderBILL='"+billno+"'");
            if(value>0)
            {
               JOptionPane.showMessageDialog(null, "Order placed succsessfully" ,"Info", JOptionPane.INFORMATION_MESSAGE, null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Unable to place Order" ,"Info", JOptionPane.ERROR_MESSAGE, null);
  
            }
            st.close();
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }
    
    public void placeorder(String custel,String name,String adress,String billno, String date,String time,String ordertype,double total,String orderstatus,double service,double tax,String table,String user)
    {
  
        int count=0;
        try
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("SELECT COUNT(*) FROM customer where CustomerTel = '"+custel+"'");
            
            if (rs.next()) 
            {
                count=rs.getInt(1);
                
            }
           if(count>0)
           {
              
               addorder(custel, billno, date, time, ordertype, total, orderstatus, service, tax, table,user);
            
           }
            else
            {
                addcusinfo(custel, name, adress);
                
                
                addorder(custel, billno, date, time, ordertype, total, orderstatus, service, tax, table,user);
            
            
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
    
    
    public void paidorder(String billno,String paymentmethod,double paidamount,double balance,String orderstatus)
    {
        try {
      
            Statement st=MDBconnection.connectDB().createStatement();
            int value =st.executeUpdate("update orders set  OrderStatus='"+orderstatus+"', PaymentMethod= '"+paymentmethod+"',PaidAmount='"+paidamount+"',Balance='"+balance+"' where OrderBILL='"+billno+"'");
            /*if(value>0)
            {
               JOptionPane.showMessageDialog(null, "Order placed succsessfully" ,"Info", JOptionPane.INFORMATION_MESSAGE, null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Unable to place Order" ,"Info", JOptionPane.ERROR_MESSAGE, null);
  
            }*/
            st.close();
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
    
    
    
}
