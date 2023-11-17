/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import java.awt.Image;
import java.awt.ItemSelectable;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CitemManage {
    
   public String autoID()
   {
       MitemManage item=new MitemManage();
        return item.autoID();
   }
   
   
   public void additem(String id, String name,String cat,double price,String avai,InputStream image)
   {
       MitemManage item=new MitemManage();
       item.additem(id, name, cat, price, avai, image);
   }
   
    public void Updateitem(String id, String name,String cat,double price,String avai)
   {
       MitemManage item=new MitemManage();
       item.updateItem(id, name, cat, price, avai);
   }
    public void deleteItem(String id)
    {
         MitemManage item=new MitemManage();
         item.deleteItem(id);
        
    }
   
   
   
   //   THIS IS FOR SEARCH ITEMS
   public List<String>searchitems()
   {
       MitemManage item=new MitemManage();
       List<String> search=item.searchitems();
       return search;
       
   }
    
   // THIS FOR GET MENUE ITEM DEATILS
    // THIS IS UDED GET ITRM INFO
    public ArrayList<String[]> getInformation(String selectValue)
    {
        MitemManage item=new MitemManage();
        ArrayList<String[]>items=item.getInformation(selectValue);
        return items;
        
    }
    
    //IMAGE RETEVE
      public Image getimage(String selectvalue )
     {
         MitemManage item=new MitemManage();
         return item.getimage(selectvalue);
         
         
         
     }
   
    
    
    
    
    
    
}
