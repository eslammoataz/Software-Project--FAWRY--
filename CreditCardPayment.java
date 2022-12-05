public class CreditCardPayment implements Payment{

    public Transaction pay(Customer customer, double amount) {
        Transaction transaction = new Transaction();
        System.out.println("Transaction Done Succesfully by Credit Card");
        transaction.amount = amount;
        transaction.userName = customer.userName;
        return transaction;
    }
}
