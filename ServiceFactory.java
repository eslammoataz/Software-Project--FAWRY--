public class ServiceFactory {
    //use getService methode
    public Services getService(String ServiceName) {
        if (ServiceName.equalsIgnoreCase("Mobile Recharge Service") || ServiceName.equals("1")) {
            return new MobileRechargeService();
        } else if (ServiceName.equalsIgnoreCase("Internet Service") || ServiceName.equals("2")) {
            return new InternetService();
        } else if (ServiceName.equalsIgnoreCase("Landline Service") || ServiceName.equals("3")){
            return new LandlineService();
        } else if (ServiceName.equalsIgnoreCase("Donation Services") || ServiceName.equals("4")){
            return new DonationService();
        }
        return null;
    }
}
