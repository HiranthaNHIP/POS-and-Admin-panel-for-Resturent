/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MemployeeManage {
    
    
     // auto increment ID
    public String autoID()
    {
        try {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("select MAX(EmpID)from employee");
            if(rs.next())
            {
                String maxid=rs.getString(1);
                if(maxid==null)
                {
                    
                    String ID="EID000001";
                    return ID;
                    
                }
                else
                {
                    int num=Integer.parseInt(maxid.substring(3,9));
                    num++;
                    String id=(String.format("EID%06d", num));
                    return id;

 
                }
                
            }
            else
            {
                
                String ID="EID000001";
                return ID;
            }
            
         
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQL ERROR "+ex.getMessage());
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Found exception"+e.getMessage());
 
        }
        return null;
   
    }
    
    
    /*public void addemp (String ids,String fname,String Lname,char[] password,String email,int no,String gender,String emptype,String username,String DOB,InputStream empimage);
    {
        String sql=("insert into employee (EmpID,Fname,Lname,Position,Gender,Email,TelephoneNo,Username,DOB,Image)values (?,?,?,?,?,?,?,?,?,?)");

        try {
    
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            PreparedStatement pst=connection.prepareStatement(sql);

            pst.setString(1, ids);
            pst.setString(2, name);
            pst.setString(3, cat);
            pst.setDouble(4, price);
            pst.setString(5, avai);
            pst.setBlob(6, image);
            
            int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data Saved successfully!","Info",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert data.","Error",JOptionPane.ERROR_MESSAGE);
        }
            
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Found sql error "+ex.getMessage());
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "found Exception "+ex.getMessage());
        }
    }*/
    
    
    
    
    
    
}
