import java.util.Random;
import java.util.Scanner;

public abstract class InternetService implements Services{
    double Amount;
    Form form;
    Scanner sc= new Scanner(System.in);
    public InternetService(){
        Random r = new Random();
        Amount = r.nextInt(700) + 1;
    }
//    void payment(String a,double amount){
//        System.out.println("Which Company You Deal With : \n--------------------------------\n1.Vodafone\n2.Etisalat\n3.Orange\n4.We");
//        a = sc.next();
//        CompanyFactory.selectCompany(a);
//        System.out.println("How Much Do you Want to Pay : ");
//        amount = sc.nextDouble();
//        Transaction transaction = new Transaction();
//        transaction.amount = amount;
//    }


    @Override
    public double getCost() {
        return Amount;
    }

    @Override
    public void generateForm() {
        System.out.println("internet service genearte form");
    }

}
