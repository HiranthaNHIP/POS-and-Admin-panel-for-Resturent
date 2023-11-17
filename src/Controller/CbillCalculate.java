/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;

/**
 *
 * @author User
 */
public class CbillCalculate {
    
    public double calSubtotal(String billno)
    {
        MbillCalculate bill=new MbillCalculate();
        double subtotal=bill.calSubtotal(billno);
        return subtotal;
        
    }
    
    // CALCULATE TAX
    public double caltax( String billno )
    {
        MbillCalculate bill=new MbillCalculate();
        double tax=bill.caltax(billno);
        return tax;
        
        
    }
    // CALCULATE SERVICE CHARGE
    public double calservice(String billno)
    {
        MbillCalculate bill=new MbillCalculate();
        double servise=bill.calservice(billno);
        return servise; 
    }
    //CALCULATE TOTAL CHARGE
    public double caltotal(String billno)
    {
        MbillCalculate bill=new MbillCalculate();
        double total=bill.caltotal(billno);
        return total; 
    }
    
}
