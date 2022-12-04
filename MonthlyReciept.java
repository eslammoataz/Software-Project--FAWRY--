public class MonthlyReciept extends LandlineService{

    @Override
    public double createReciept() {
        System.out.println("your monthly reciept is "+Amount);
        return Amount;
    }
}
