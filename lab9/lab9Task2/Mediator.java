public class Mediator {

    private DollarConverter dollarConverter;
    private AmericanSeller americanSeller;
    private FrenchBuyer frenchBuyer;
    private SwedishBuyer swedishBuyer;

    public void registerDollarConverter(DollarConverter dc) {
        this.dollarConverter = dc;
    }

    public void registerAmericanSeller(AmericanSeller as) {
        this.americanSeller = as;
    }

    public void registerFrenchBuyer(FrenchBuyer fb) {
        this.frenchBuyer = fb;
    }

    public void registerSwedishBuyer(SwedishBuyer sb) {
        this.swedishBuyer = sb;
    }

    public boolean placeBid(float bid, String unitOfCurrency) {
        float dollar = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency);
        return this.americanSeller.isBidAccepted(dollar);
    }
}
