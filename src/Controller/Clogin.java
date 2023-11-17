
package Controller;
import Model.*;

public class Clogin {
    
    public void login(String type ,String username,String password)
    {
        Mlogin obj=new Mlogin();
        obj.login(type, username, password);
        
    }
    
}
