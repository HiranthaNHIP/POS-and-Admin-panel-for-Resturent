/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MDBconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Model.*;

/**
 *
 * @author User
 */
public class CgetCUSinfo {
    
   public String getCusname(String telno)
   {
       MgetCUSinfo cus=new MgetCUSinfo();
       String name=cus.getCusname(telno);
       return name;
       
   }
   
   public String getCusaddress(String telno)
   {
       MgetCUSinfo cus=new MgetCUSinfo();
       String address=cus.getCusaddress(telno);
       return address;
   }
   
}
