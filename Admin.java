import javax.xml.crypto.Data;
import java.util.Scanner;

public class Admin implements User{
    String email;
    Scanner cin = new Scanner(System.in);
    String userName;
    String password;
    public  Admin(String _email , String _userName , String _password){
        this.email=_email;
        this.userName=_userName;
        this.password=_password;
    }
    @Override
    public Boolean login(DataBase dataBase ,String email , String password) {
        Boolean ok = dataBase.checkAdmin(email,password);
        return ok;
    }
    @Override
    public Boolean register(DataBase dataBase , String email ,String userName, String password) {
        Boolean ok = dataBase.checkAdmin(email, password);
        if (!ok) {
            dataBase.addAdmin(email, userName, password);
            return true;
        }
        return false;
    }
    public void addDiscount(){

    }
    public void viewRefunds(){
    }
    public Boolean signOut(){

        return null;
    }
    public void dealWithRefund(){

    }

}
