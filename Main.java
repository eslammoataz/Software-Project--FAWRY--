import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Admin> admins = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        // creating admin object  "account"
        Admin admin = new Admin("eslam@gmail.com","eslam","123");

        //creating customers object " account
        Customer customer1 = new Customer("ali@gmail.com", "ali","235");
        Customer customer2 = new Customer("oka@gmail.com", "oka","365");
        Customer customer3 = new Customer("maged@gmail.com", "maged","987");

        //adding admins to the list of admins authorized
        admins.add(admin);

        //adding Customers to the list of admins authorized
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        String email;
        String username;
        String password;


        // choice to signin or signup
        String Signtype; // holds Signtype of operation in or up
        System.out.println("if you want to : \n Signin Enter (1) \n Signup Enter (2) \n");
        Signtype = cin.next();

        if (Signtype.equals("1")) { // sign in
            //get input from user
            String Usertype;
            while (true) {
                System.out.println("User Signtype \n 1.Admin \n 2.Customer");
                Usertype = cin.next();
                if (Usertype.equals("1")){ // handling sign in for the admin
                    System.out.println("Enter Email: ");
                    email = cin.next();
                    System.out.println("Enter UserName: ");
                    username = cin.next();
                    System.out.println("Enter Password");
                    password = cin.next();
                    int ok = 0;
                    for (Admin value : admins) {
                        if (value.email.equals(email) &&value.userName.equals(username) && value.password.equals(password)) {
                            System.out.println("Sing in Succesfully");
                            ok = 1;
                            break;
                        }
                    }
                    if (ok == 0) {
                        System.out.println("No such user registerd to the System");
                    }else break;
                } else {
                    // handling sign in for the customer
                    System.out.println("Enter Email: ");
                    email = cin.next();
                    System.out.println("Enter UserName: ");
                    username = cin.next();
                    System.out.println("Enter Password");
                    password = cin.next();
                    int ok = 0;
                    for (Customer customer : customers) {
                        if (customer.email.equals(email) &&customer.userName.equals(username) && customer.password.equals(password)) {
                            System.out.println("Sing in Succesfully");
                            ok = 1;
                            break;
                        }
                    }
                    if (ok == 0) { // not signed in
                        System.out.println("No such user registerd to the System");
                    }else break;
                }
            }
        } else if (Signtype.equals("2")) {  // sign up
            String Usertype;
            while (true) {
                System.out.println("User Signtype \n 1.Admin \n 2.Customer");
                Usertype = cin.next();
                if (Usertype.equals("1")) { // handling sign in for the admin
                    System.out.println("Enter Email: ");
                    email = cin.next();
                    System.out.println("Enter UserName: ");
                    username = cin.next();
                    System.out.println("Enter Password");
                    password = cin.next();
                    int ok = 1;
                    // check if the user is registered before
                    for (Admin value : admins) {
                        if (value.email.equals(email) &&value.userName.equals(username) && value.password.equals(password)) {
                            System.out.println("user registerd to the System before ");
                            ok = 0;
                            break;
                        }
                    }
                    if (ok == 1) { // user not registered before
                        System.out.println("Sing up Succesfully");
                        admins.add(new Admin(email, username, password));
                        break;
                    }
                } else {
                    // handling sign up for the customer
                    System.out.println("Enter Email: ");
                    email = cin.next();
                    System.out.println("Enter UserName: ");
                    username = cin.next();
                    System.out.println("Enter Password");
                    password = cin.next();
                    int ok = 1;
                    // check if the user is registered before
                    for (Customer customer : customers) {
                        if (customer.email.equals(email) &&customer.userName.equals(username) && customer.password.equals(password)) {
                            System.out.println("user registerd to the System before ");
                            ok = 0;
                            break;
                        }
                    }
                    if (ok == 1) { // user not registered before
                        System.out.println("Sing up Succesfully");
                        customers.add(new Customer(email,username, password));
                        break;
                    }
                }
            }
        }
    }

}


