
package Controller;
import Model.*;


public class CaddOrder {
    public void addcusinfo(String custel, String name,String adress)
    {
        MaddOrder order=new MaddOrder();
        order.addcusinfo(custel, name, adress);
        
    }
    public void addorder(String custel,String billno, String date,String time,String ordertype,double total,String orderstatus,double service,double tax,String table,String user)
    {
        MaddOrder order=new MaddOrder();
        order.addorder(custel, billno, date, time, ordertype, total, orderstatus, service, tax, table,user);
        
    }
    public void placeorder(String custel,String name,String adress,String billno, String date,String time,String ordertype,double total,String orderstatus,double service,double tax,String table,String user)
    {
         MaddOrder order=new MaddOrder();
         order.placeorder(custel, name, adress, billno, date, time, ordertype, total, orderstatus, service, tax, table,user);

        
    }
    public void paidorder(String billno,String paymentmethod,double paidamount,double balance,String orderstatus)
    {
         MaddOrder order=new MaddOrder();
         order.paidorder(billno, paymentmethod, paidamount, balance, orderstatus);
        
    }


    
}
