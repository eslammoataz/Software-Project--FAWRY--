public class ServiceFactory {
    //use getService methode
    public static Object getService(String ServiceName) {
        if (ServiceName.equalsIgnoreCase("Mobile Recharge Service")) {
            return new MobileRechargeService();
        } else if (ServiceName.equalsIgnoreCase("Internet Service")) {
            return new InternetService();
        } else if (ServiceName.equalsIgnoreCase("Landline Service")){
            return new LandlineService();
        } else if (ServiceName.equalsIgnoreCase("Donation Services")){
            return new DonationService();
        }
        return null;
    }
}
