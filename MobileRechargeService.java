import java.util.*;

public class MobileRechargeService implements Services{
    Scanner sc= new Scanner(System.in);

 static void display(){
    System.out.println("Mobile Recharge Running");
}
void payment(String s,double amount){
    System.out.println("Which Company You Deal With : \n--------------------------------\n1.Vodafone\n2.Etisalat\n3.Orange\n4.We");
    s = sc.next();
    CompanyFactory.selectCompany(s);
    System.out.println("How Much Do you Want to Pay : ");
    amount = sc.nextDouble();
    Transaction transaction = new Transaction();
    transaction.amount = amount;
}

}
