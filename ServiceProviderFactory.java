public interface ServiceProviderFactory {
    public MobileRechargeService createMobileService();
    public InternetService createInternetService();
}
