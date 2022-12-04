import java.util.*;

public abstract class MobileRechargeService implements Services {
    double Amount;
    Form form;
    Scanner sc = new Scanner(System.in);


    public MobileRechargeService() {
        Random r = new Random();
        Amount = r.nextInt(1000) + 1;
    }

//    public void display() {
//        System.out.println("Mobile Recharge Running");
//    }

//    public void pay() {
//        System.out.println("pay inside mobile service");
//    }

    @Override
    public double getCost() {
        return Amount;
    }

    @Override
    public void generateForm() {
        System.out.println("mobile service genearte form");
    }
}
