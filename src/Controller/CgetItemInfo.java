
package Controller;
import Model.*;

/**
 *
 * @author User
 */
public class CgetItemInfo {
     public void getItem(String type)//currently iam not using this code
    {
      MgetItemInfo item=new MgetItemInfo();
      item.getItems(type);
    }
     
     
     public double getprice(String selectvalue)
     {double value;
         
         MgetItemInfo item1=new MgetItemInfo();
         value=item1.getprice(selectvalue);
         return value;
     }
     
     public String getItemID(String selectvalue)
     {
         String ItemID;
         MgetItemInfo item2=new MgetItemInfo();
         ItemID=item2.getItemID(selectvalue);
         return ItemID;
         
     }
         
    
}
