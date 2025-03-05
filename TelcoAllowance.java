public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double price, int dataAllowance) {
        return telcoName + " offers " + dataAllowance + "GB for ₱" + price + ".";
    }
}