public class MonthlyReciept extends LandlineService{

    @Override
    public double createReciept() {
        System.out.println("your monthly reciept is "+Amount);
        return Amount;
    }

    @Override
    public void display() {
        System.out.println("Monthly landline Recharge Running");
    }

    @Override
    public void pay() {
        System.out.println("Monthly landline Recharge Running pay function");
    }
}
