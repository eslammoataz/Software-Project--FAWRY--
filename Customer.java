import java.util.ArrayList;
import java.util.Scanner;

public class Customer implements User, Observer {

    double wallet = 200;
    Scanner cin = new Scanner(System.in);
    //list transactions
    //list refunds
    String email;
    String userName;
    String password;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public Customer(String _email, String _userName, String _password) {
        this.email = _email;
        this.userName = _userName;
        this.password = _password;
    }

    @Override
    public Boolean login(DataBase dataBase, String email, String password) {
        Boolean ok = dataBase.checkCustomer(email, password);
        return ok;

    }

    @Override
    public Boolean register(DataBase dataBase, String email, String userName, String password) {
        Boolean ok = dataBase.checkCustomer(email, password);
        if (!ok) {
            dataBase.addCustomer(email, userName, password);
            return true;
        }
        return false;
    }

    public Boolean signOut() {

        return null;
    }

    public static void searchService() {

    }

    public void refundRequest(Transaction a) {
        Refund refund = new Refund(a);
        refund.transaction.userName = a.userName;
        refund.transaction.amount = a.amount;
        refund.state = "Pending";
    }

    @Override
    public void update(String message) {
        System.out.println("Got New Notification about Refund !" + userName + " \n" + message);
    }
}
