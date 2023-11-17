
package Controller;

import Model.*;


public class CaddItemCart {
    public void billtoDB(String billno)
    {
        MaddItemCart cart=new MaddItemCart();
        cart.billToDB(billno);
     
    
    }
    //CURRENTLY THIS IS NOT USING
    public void addItem(String billno)
    {
        MaddItemCart cart =new MaddItemCart();
        cart.addItem(billno);
        
    }
    
    
   
    
    
}
