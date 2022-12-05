import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Double> discounts = new ArrayList<>();
    ArrayList<Refund> refundRequest = new ArrayList<>();
    Scanner cin = new Scanner(System.in);
    public DataBase(){
        discounts.add(0.25);
        discounts.add(0.50);
        discounts.add(0.75);
        Transaction t = new Transaction();
        t.userName="dsds";
        t.amount=4554;
        Refund refund = new Refund(t);
        refundRequest.add(refund);
        Transaction t2 = new Transaction();
        t2.userName="a7a";
        t2.amount=111;
        Refund refund1 = new Refund(t2);
        refundRequest.add(refund1);

    }



    //adding admins to the list of admins authorized
    public void addAdmin(String email, String username, String passwrod ) {
        Admin admin = new Admin(email, username, passwrod);
        admins.add(admin);
    }

    public Boolean checkAdmin(String email,String password) {
        for (Admin value : admins)
            if (value.email.equals(email) && value.password.equals(password))
                return true;
        return false;
    }
    public Admin setAdmin(String email,String password) {
        Admin tempAdmin = null;
        for (Admin value : admins)
            if (value.email.equals(email) && value.password.equals(password))
                tempAdmin = value;
        return tempAdmin;
    }


    public void addCustomer(String email, String username, String passwrod) {
        Customer customer = new Customer(email, username, passwrod);
        customers.add(customer);
    }

    public Boolean checkCustomer(String email, String password) {
        for (Customer value : customers)
            if (value.email.equals(email) && value.password.equals(password))
                return true;
        return false;
    }


}
