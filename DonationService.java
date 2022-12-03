import java.util.Random;

public class DonationService implements Services{
    public void  display(){
        System.out.println("Donation Service Running");
    }

    @Override
    public int getCost() {
        Random r = new Random();
        return r.nextInt(150) + 1;
    }
}

