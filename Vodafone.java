public class Vodafone implements ServiceProviderFactory{

    @Override
    public MobileRechargeService createMobileService() { return new VodafoneMobileService();
    }

    @Override
    public InternetService createInternetService() {
        return new VodafoneInternerService();
    }
}
