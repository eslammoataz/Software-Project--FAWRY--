import com.sun.source.tree.BreakTree;

public class BigFactory {
    public Services createBig(String choice, String chooseProvider) { // choice = service name
        ServiceProviderFactory providerFactory;
        Services service = null;
        if (choice.equals("1") || choice.equals("2")) {
            System.out.println("1.Vodafone \n 2.Etisalat \n 3.Orange \n 4.WE");
            if (chooseProvider.equals("1") || chooseProvider.equals("Vodafone")) {
                providerFactory = new Vodafone();
                service = providerFactory.Create(choice);
            }
            if (chooseProvider.equals("2") || chooseProvider.equals("Etisalat")) {
                providerFactory = new Etisalat();
                service = providerFactory.Create(choice);
            }
            if (chooseProvider.equals("3") || chooseProvider.equals("Orange")) {
                providerFactory = new Orange();
                service = providerFactory.Create(choice);
            }
            if (chooseProvider.equals("4") || chooseProvider.equals("WE")) {
                providerFactory = new We();
                service = providerFactory.Create(choice);
            }
        } else if (choice.equals("3")) {
            System.out.println("1.MonthlyRecipet \n 2.Quarter Recipet");
            if (chooseProvider.equals("1"))
                service = new MonthlyReciept();
            else service = new QuarterReciept();
        } else {
            service = new DonationService();
        }
    return service;
    }
}
