import java.util.Random;

public class LandlineService implements Services{
    static void display(){
        System.out.println("Landline Service Running");
    }

    @Override
    public int getCost() {
        Random r = new Random();
        return r.nextInt(400) + 1;
    }
}
