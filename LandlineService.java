import java.util.Random;

public abstract class LandlineService implements Services{
    public double Amount=0;
    Form form;

    public LandlineService(){
        Random r = new Random();
        Amount =  r.nextInt(400) + 1;
    }

     public void display(){
        System.out.println("Landline Service Running");
    }

    @Override
    public double getCost() {
        return Amount;
    }

    public void generateForm() {
        System.out.println("landline service genearte form");
    }
    abstract public double createReciept();
    public void pay(){
        System.out.println("pay inside landline service");
    }
}
