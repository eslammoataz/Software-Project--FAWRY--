import java.util.Random;
import java.util.Scanner;

public class InternetService implements Services{
    Scanner sc= new Scanner(System.in);

    static void display(){
        System.out.println("Internet Service Running");
    }
    void payment(String a,double amount){
        System.out.println("Which Company You Deal With : \n--------------------------------\n1.Vodafone\n2.Etisalat\n3.Orange\n4.We");
        a = sc.next();
        CompanyFactory.selectCompany(a);
        System.out.println("How Much Do you Want to Pay : ");
        amount = sc.nextDouble();
        Transaction transaction = new Transaction();
        transaction.amount = amount;
    }


    @Override
    public int getCost() {
        Random r = new Random();
        return r.nextInt(700) + 1;
    }
}
