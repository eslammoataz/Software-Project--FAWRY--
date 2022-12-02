public class Admin implements User{
    String email;
    String userName;
    String password;
    public  Admin(String _email , String _userName , String _password){
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
    public void addDiscount(){

    }
    public void viewRefunds(){
    }
    public void signOut(){

    }
    public void dealWithRefund(){

    }

}
