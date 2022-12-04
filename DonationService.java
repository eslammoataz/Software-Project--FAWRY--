import java.util.Random;

public class DonationService implements Services{
    public double Amount=0;
    Form form;
    public DonationService(){
        Random r = new Random();
        Amount= r.nextInt(150) + 1;
    }
    public void  display(){
        System.out.println("Donation Service Running");
    }

    @Override
    public void pay() {
        System.out.println("pay insider donation service");
    }

    @Override
    public double getCost() {
       return Amount;
    }

    @Override
    public void generateForm() {
        System.out.println("donaton generate form");

    }
}

