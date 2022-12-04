import java.util.Scanner;


public class Main {
    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Customer customer = new Customer(null, null, null);
        Admin admin = new Admin(null, null, null);
        //database of all info of the users
        DataBase dataBase = new DataBase();

        //adding admins to the list of admins authorized
        dataBase.addAdmin("ali", "eslam", "123");
        dataBase.addAdmin("kareem@gmail.com", "kareem", "123");
        dataBase.addAdmin("hassan@gmail.com", "hassan", "000");

        //adding Customers to the list of customers database
        dataBase.addCustomer("ali@gmail.com", "ali", "123");
        dataBase.addCustomer("oka", "oka", "123");
        dataBase.addCustomer("maged@gmail.com", "maged", "000");

        String email;
        String username;
        String password;

        int flag = 0;
        int login = 0;
        do {
            // choice to login or register
            String Signtype = printChoice1(); // login or register
            if (Signtype.equals("1")) { // sign in
                //get input from user
                String Usertype;
                System.out.println("    \tChoose \n----------------------- \n 1.Admin \n 2.Customer\n");
                Usertype = cin.next(); // user typer admin or customer

                System.out.println("Enter Email:");
                email = cin.next();
                System.out.println("Enter Password");
                password = cin.next();

                if (Usertype.equals("1")) { // handling sign in for the admin
                    Boolean ok = admin.login(dataBase, email, password);
                    if (ok) {
                        System.out.println("Login Successfully");
                        flag = 1;
                        login = 1;
                    } else
                        System.out.println("No such user registered to the System");
                } else {
                    // handling sign in for the customer
                    Boolean ok = customer.login(dataBase, email, password);
                    if (ok) {
                        System.out.println("Login Successfully");
                        login = 1;
                    } else
                        System.out.println("No such user registered to the System");
                }
            } else if (Signtype.equals("2")) {  // Register
                String Usertype;
                System.out.println("    \tChoose \n----------------------- \n 1.Admin \n 2.Customer");
                Usertype = cin.next();

                System.out.println("Enter Email:");
                email = cin.next();
                System.out.println("Enter User Name:");
                username = cin.next();
                System.out.println("Enter Password");
                password = cin.next();
                if (Usertype.equals("1")) { // handling sign up for the admin
                    Boolean ok = admin.register(dataBase, email, username, password);
                    // check if the user is registered before
                    if (!ok)
                        System.out.println("Already Registered :) ");
                    else {
                        // user not registered before
                        System.out.println("Registered Successfully :)");
                    }
                } else {
                    // handling registration for the customer
                    Boolean ok = customer.register(dataBase, email, username, password);
                    // check if the user is registered before
                    if (!ok)
                        System.out.println("Already Registered :) ");
                    else {
                        // user not registered before
                        System.out.println("Registered Successfully :)");
                    }
                }
            }
        } while (login == 0);

        if (flag == 1) {
            System.out.println("--------| Hello Admin |-------\n What Do You Want To Do ?\n 1.Add Discount \n 2.View Refunds Requests\n 3.Deal With Refunds");
        } else if (flag == 0) {
            System.out.println("-------| Hello Customer |-------\n 1.Show Services Menu \n 2.Search for Service ");
            String ServiceType = cin.next();
            String chooseProvider = null;
            ServiceProviderFactory providerFactory;
            Services service = null; // object of the service internet or mobile
            if (ServiceType.equals("1")) {   // The customer choose from services menu
                System.out.println("----- |Services Menu| -----\n1.Mobile Recharge Services\n2.Internet Services\n3.Landline Services\n4.Donations");
                String choice = cin.next(); // choose the recharge service  ( mob  , intern m landline , donations)
                if (choice.equals("1") || choice.equals("2")) {
                    System.out.println("1.Vodafone \n 2.Etisalat \n 3.Orange \n 4.WE");
                    chooseProvider = cin.next(); // chooses which provider to do the recharge service (ex:vod , et)
                    if (chooseProvider.equals("1") || chooseProvider.equals("Vodafone")) {
                        providerFactory = new Vodafone();
                        service = providerFactory.Create(choice);
                    }
                    if (chooseProvider.equals("2") || chooseProvider.equals("Etisalat")) {
                        providerFactory = new Etisalat();
                        service = providerFactory.Create(choice);
                    }
                    if (chooseProvider.equals("3") || chooseProvider.equals("Orange")) {
                        providerFactory = new Orange();
                        service = providerFactory.Create(choice);
                    }
                    if (chooseProvider.equals("4") || chooseProvider.equals("WE")) {
                        providerFactory = new We();
                        service = providerFactory.Create(choice);
                    }

                } else if (choice.equals("3")) {
                    System.out.println("1.MonthlyRecipet \n 2.Quarter Recipet");
                    chooseProvider = cin.next();
                    if (chooseProvider.equals("1"))
                        service = new MonthlyReciept();
                    else service = new QuarterReciept();
                } else {
                    service = new DonationService();
                }
                service.display();
                service.pay();
            } else if (ServiceType.equals("2")) {   // The Customer type the service he needs manually
                System.out.println("Enter The Service You Need : ");
                String choice = cin.next();
                if (choice.equalsIgnoreCase("Land Line Service")) {
                    System.out.println("1.Monthly Recipet \n 2.Quarter Recipet");
                    chooseProvider = cin.next();
                    if (chooseProvider.equals("Monthly Recipet"))
                        service = new MonthlyReciept();
                    else service = new QuarterReciept();
                } else if (choice.equalsIgnoreCase("Donations")) {
                    service = new DonationService();
                } else {
                    System.out.println("1.Vodafone \n 2.Etisalat \n 3.Orange \n 4.WE");
                    chooseProvider = cin.next(); // chooses which provider to do the recharge service (ex:vod , et)
                    if (chooseProvider.equals("1") || chooseProvider.equals("Vodafone")) {
                        providerFactory = new Vodafone();
                        service = providerFactory.Create(choice);
                    }
                    if (chooseProvider.equals("2") || chooseProvider.equals("Etisalat")) {
                        providerFactory = new Etisalat();
                        service = providerFactory.Create(choice);
                    }
                    if (chooseProvider.equals("3") || chooseProvider.equals("Orange")) {
                        providerFactory = new Orange();
                        service = providerFactory.Create(choice);
                    }
                    if (chooseProvider.equals("4") || chooseProvider.equals("WE")) {
                        providerFactory = new We();
                        service = providerFactory.Create(choice);
                    }
                }

            }
        }
    }


    public static String printChoice1() {
        String Signtype; // holds Signtype of operation in or up
        System.out.println("    \tChoose \n-----------------------\n1- Login\t2- Register\n");
        Signtype = cin.next();
        return Signtype;
    }
}




