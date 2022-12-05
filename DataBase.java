import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Double> discounts = new ArrayList<>();
    Scanner cin = new Scanner(System.in);



    //adding admins to the list of admins authorized
    public void addAdmin(String email, String username, String passwrod) {
        Admin admin = new Admin(email, username, passwrod);
        admins.add(admin);
    }

    public Boolean checkAdmin(String email,String password) {
        for (Admin value : admins)
            if (value.email.equals(email) && value.password.equals(password))
                return true;
        return false;
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
