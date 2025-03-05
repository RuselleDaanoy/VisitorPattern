public class UnliCallTextPackage implements UnliCallTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + (unliCallText ? " includes unlimited calls and texts." : " does not offer unlimited calls and texts.");
    }
}