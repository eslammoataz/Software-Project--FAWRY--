public class Orange implements ServiceProviderFactory{
    @Override
    public MobileRechargeService createMobileService() { return new OrangeMobileService();
    }

    @Override
    public InternetService createInternetService() { return new OrangeInternetService();
    }

    }

