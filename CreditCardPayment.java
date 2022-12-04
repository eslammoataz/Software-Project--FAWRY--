public class CreditCardPayment implements Payment{

    @Override
    public void paymentCost(String amount) {
        System.out.println("Customer pays the money " + amount + " using Credit Card");

    }

    @Override
    public void pay(double amount) {

    }
}
