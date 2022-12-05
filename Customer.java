import javax.xml.crypto.Data;
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

    public static void searchService() {

    }

    public Refund refundRequest(Transaction a, DataBase dataBase) {
        Refund refund = null;
        int counter = 1;
        for (Transaction transaction : transactions) {
            System.out.println("Transaction " + counter + " " + transaction.amount);
            counter++;
        }
        int choice = 0;
        System.out.println("choose trancation to do refund request");
        choice = cin.nextInt();
        for (Transaction transaction : transactions) {
            choice--;
            if (choice == 0) {
                refund = new Refund(transaction);
                refund.state = "pending";
                break;
            }
        }
        return refund;
    }

    @Override
    public void update(String message) {
        System.out.println("Got New Notification about Refund !" + userName + " \n" + message);
    }
}
