public class Admin implements User{
     String userName;
     String password;
    public  Admin(String _userName , String _password){
        this.userName=_userName;
        this.password=_password;
    }
    @Override
    public void signIn() {

    }
    @Override
    public void signOut() {

    }
}
