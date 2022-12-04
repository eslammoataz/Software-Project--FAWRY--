public class Vodafone implements ServiceProviderFactory{

    @Override
    public MobileRechargeService createMobileserive() {
       return null;
    }

    @Override
    public InternetService createInternetserive() {
        return new VodafoneInternerService();
    }
}
