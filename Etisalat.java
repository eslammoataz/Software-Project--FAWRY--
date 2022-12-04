public class Etisalat implements ServiceProviderFactory{
    @Override
    public MobileRechargeService createMobileService() { return new EtisalatMobileService();
    }

    @Override
    public InternetService createInternetService() { return new EtisalatInternetService();
    }
}
