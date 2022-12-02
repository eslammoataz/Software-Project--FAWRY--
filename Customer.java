public class Customer implements User{
    int wallet=0;
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

}
