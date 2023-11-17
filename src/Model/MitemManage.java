/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Image;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class MitemManage {
    
    public void additem(String id, String name,String cat,double price,String avai,InputStream image)
    {
        String sql=("insert into menuitem (ItemID,Item_name,Item_Category,Item_price,Item_availability,item_Image)values (?,?,?,?,?,?)");

        try {
    
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            PreparedStatement pst=connection.prepareStatement(sql);

            pst.setString(1, id);
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
    }
    // auto increment ID
    public String autoID()
    {
        try {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("select MAX(ItemID)from menuitem");
            if(rs.next())
            {
                String maxid=rs.getString(1);
                if(maxid==null)
                {
                    
                    String ID="MID0001";
                    return ID;
                    
                }
                else
                {
                    int num=Integer.parseInt(maxid.substring(3,7));
                    num++;
                    String id=(String.format("MID%04d", num));
                    return id;

 
                }
                
            }
            else
            {
                
                String ID="MID0001";
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
    
    //GENERIC THYPE METHOD IS USED FOR RETIVE DATA TO THE COMBO BOX
    public List<String>searchitems()
    {
        List<String> search=new ArrayList<>();
        try 
        {
            Statement st=MDBconnection.connectDB().createStatement();
            ResultSet rs=st.executeQuery("select Item_name from menuitem");
            while(rs.next())
            {
                search.add(rs.getString("Item_name"));
                
            }
            st.close();
            rs.close();
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "exception "+e.getMessage());
        }
        return search;
        
    }
    
    
    // THIS IS UDED GET ITeM INFO(GENERICS)
    public ArrayList<String[]> getInformation(String selectValue) {
        ArrayList<String[]> itemsArray = new ArrayList<>();

        try {
            Statement st = MDBconnection.connectDB().createStatement();
            ResultSet rs = st.executeQuery("SELECT ItemID, Item_name, Item_price, Item_Category, Item_availability FROM menuitem WHERE Item_name = '" + selectValue + "';");

            // Iterate through the ResultSet and store each row in an array
            while (rs.next()) {
                String[] itemData = new String[5]; // Assuming 5 columns are retrieved

                // Retrieve data for each column and store it in the array
                itemData[0] = rs.getString("ItemID");
                itemData[1] = rs.getString("Item_name");
                itemData[2] = rs.getString("Item_price");
                itemData[3] = rs.getString("Item_Category");
                itemData[4] = rs.getString("Item_availability");

                itemsArray.add(itemData); // Add the array to the ArrayList
            }

            st.close();
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace(); // Print the stack trace for debugging purposes
            // Handle the exception as required
        }

        return itemsArray;
    }

       
    
    
    
    
    public Image getimage(String selectvalue )
    {
        
        // THIS CODE IS USED TO RETERIVE IMAGE FROM THE DATABASE
        String sql="select item_Image from menuitem where Item_name='"+selectvalue+"'; ";
       
       
        try 
        {
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb","root","");
            PreparedStatement pst=connection.prepareStatement(sql);
            ResultSet rt=pst.executeQuery();
            if(rt.next())
            {
                Blob image=rt.getBlob(1);
                byte[]bytea=image.getBytes(1,(int)image.length());
                
                 ImageIcon originalIcon = new ImageIcon(bytea);
                 Image originalImage = originalIcon.getImage();
                 return originalImage;
                
            }
            
            
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
        
    }
    
    
    
    public void updateItem(String id, String name, String cat, double price, String avai) {
    String sql = "UPDATE menuitem SET Item_name = ?, Item_Category = ?, Item_price = ?, Item_availability = ? WHERE ItemID = ?";

    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb", "root", "");
        PreparedStatement pst = connection.prepareStatement(sql);

        pst.setString(1, name);
        pst.setString(2, cat);
        pst.setDouble(3, price);
        pst.setString(4, avai);
        
        pst.setString(5, id);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data updated successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Found SQL error " + ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Found Exception " + ex.getMessage());
    }
}

    
    
    public void deleteItem(String id) {
    String sql = "DELETE FROM menuitem WHERE ItemID = ?";

    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/resdb", "root", "");
        PreparedStatement pst = connection.prepareStatement(sql);

        pst.setString(1, id);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data deleted successfully!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Found SQL error " + ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Found Exception " + ex.getMessage());
    }
}

    
    
    
    
    
}
