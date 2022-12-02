public class Customer implements User{
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
    public void searchService(){

    }
    public void refundRequest(){

    }
}
