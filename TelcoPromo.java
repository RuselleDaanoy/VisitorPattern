public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer: " + smart.accept(promo));
        System.out.println("Globe Data Usage Offer: " + globe.accept(promo));
        System.out.println("Ditto Data Usage Offer: " + ditto.accept(promo));

        System.out.println("\nSmart Call/Text Offer: " + smart.accept(unli));
        System.out.println("Globe Call/Text Offer: " + globe.accept(unli));
        System.out.println("Ditto Call/Text Offer: " + ditto.accept(unli));
    }
}
