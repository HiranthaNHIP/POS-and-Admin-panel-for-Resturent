
package Model;
import View.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Mlogin {
     public String position;
    
    public void login(String type,String username,String password)
    {
        ResultSet rst1;
        
        try 
        {
            Statement st=MDBconnection.connectDB().createStatement();
            rst1=st.executeQuery("select * from employee where Username='"+username+"'and Password='"+password+"'and Position='"+type+"';");
            
            if(rst1.next())
            {
               //JOptionPane.showMessageDialog(null, type +" Login Sucsessfully");
                
                
                if(type=="Manager")
                {
                    //lbl_login lable in manger interfce but ichnage lbl_login lable in public the i can accsess that componand
                    //anyware of my code
                    //i got the EmpID from bellow code from the above select query
                    
                    String itemlist=rst1.getString("EmpID");
                    VmangerDashboard win=new VmangerDashboard();
                    win.lbl_login.setText(itemlist);
                    
                    win.setVisible(true);
                    VLogin old =new VLogin();
                    old.setVisible(false);
                    
                    
                    
                    
                }
                else if(type=="Cashier")
                {
                    String itemlist=rst1.getString("EmpID");
                    Vcashier win=new Vcashier();
                    
                    win.lbl_login.setText(itemlist);
                    win.setVisible(true);
                    
                    VLogin old =new VLogin();
                    old.setVisible(false);
                    
                    
                    
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Login Credentials","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        } 
        catch (SQLException e)
        {
           JOptionPane.showMessageDialog(null,e.getMessage()); 
            
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null,ex.getMessage()); 
 
        }
        
        
    }
    
}
