import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class FormHandler {
    Form form;
    Services service;
    Payment payment;
    Customer customer;
    Double amountEntered;
    Transaction transaction;
    Scanner cin = new Scanner(System.in);

    public FormHandler(Customer customer, Services service, Form form) {
        this.service = service;
        this.form = form;
        setPayment(form);
        this.customer = customer;
        transaction = new Transaction();
    }

    void setPayment(Form form) {
        if (form.wayofPayment.equals("Credit Card"))
            payment = new CreditCardPayment();
        else if (form.wayofPayment.equals("Wallet"))
            payment = new WalletPayment();
        else payment = new CashPayment();
    }

    void procesaInformation() {
        int exit = -1;
        if (payment instanceof WalletPayment) {
            amountEntered = Double.parseDouble(form.attr.get("Amount"));
            if (amountEntered > customer.wallet) {
                System.out.println("Not Enough Wallet Money :(\n 1.Pay with another method \n2. Exit");
                exit = cin.nextInt();
            }
            if (exit == 2)
                System.exit(0);
            form.paymentMethod();
        }
        System.out.println("Cofirmation");
        for (Map.Entry<String, String> mapElement : form.attr.entrySet()) {
            String key = mapElement.getKey();
            String value = (mapElement.getValue() + 10);
            System.out.println(key + " : " + value);
        }
        int agree = -1;
        System.out.println("1.Confirm\n2.Decline");
        agree = cin.nextInt();
        if (agree == 2) {
            System.out.println("Try another Time");
            System.exit(0);
        }
        transaction=payment.pay(customer,amountEntered);
        customer.transactions.add(transaction);
        System.exit(0);
    }


}
