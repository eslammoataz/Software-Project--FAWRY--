public class WalletPayment implements Payment{


    @Override
    public void paymentCost(String amount) {
        System.out.println("Customer pays the money " + amount + " using his Wallet " );
    }


}
