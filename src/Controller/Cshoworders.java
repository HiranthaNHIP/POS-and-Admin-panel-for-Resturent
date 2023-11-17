/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.MDBconnection.*;
import Model.MshowOrders;
import java.util.List;

/**
 *
 * @author User
 */
public class Cshoworders {
   // THIS CODE IS USED TO RETIVE DATABASE DEATILS TO THE JTABLE

   public String[] showOrdersTbl(String todayDate)
   {
       MshowOrders model=new MshowOrders();
       String[] result = model.showOrdersTbl(todayDate); 
       return result;
   }
    
}
