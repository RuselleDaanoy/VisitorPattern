public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(String telcoName, double promoPrice, int dataAllowance, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public boolean hasUnliCallText() {
        return unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(this.telcoName, price, this.dataAllowance);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(this.telcoName, unliCallText);
    }
}