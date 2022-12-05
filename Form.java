import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Form {
    String wayofPayment = null;
    HashMap<String, String> attr = new HashMap<>();
    Scanner cin = new Scanner(System.in);

    public void paymentMethod() {
        do {
            System.out.println("Choose way of payment \n 1.Cedit Card (defualt)\n2.Wallet \n3.Cashe");
            wayofPayment = cin.next();
        }while (wayofPayment==null);
    }
}
