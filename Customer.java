public class Customer implements User , Observer {

    double wallet=0;
    //list transactions
    //list refunds
    String email ;
    String userName;
    String password;
    public Customer(String _email , String _userName , String _password) {
        this.email=_email;
        this.userName=_userName;
        this.password=_password;
    }

    @Override
    public void login() {
    }

    @Override
    public void register() {

    }
    public void signOut(){

    }
    public static void searchService(){

    }
    public void refundRequest (Transaction a){
        Refund refund = new Refund(a);
        refund.transaction.userName = a.userName;
        refund.transaction.amount= a.amount;
        refund.state= "Pending";
    }

    @Override
    public void update(String message) {
        System.out.println("Got New Notification about Refund !"+userName+" \n"+message);
    }
}
