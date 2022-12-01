public class Customer implements User{
    int wallet=0;
    String userName;
    String password;
    public Customer(String _userName , String _password) {
        this.userName=_userName;
        this.password=_password;
    }

    @Override
    public void singin() {

    }

    @Override
    public void singout() {

    }
}
