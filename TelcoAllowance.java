public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double money, int dataAllowance) {
        return telcoName + " offers " + dataAllowance + "GB for ₱" + money + ".";
    }
}