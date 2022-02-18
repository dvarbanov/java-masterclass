package Section7.OOPMasterChallengeExercise;

public class HealthyBurger extends Hamburger {

    private boolean tofu;
    private boolean cucumber;

    private double totalExtraAdditions = 0;
    private int extraAdditionsLimit = 2;
    private double totalExtraAdditionsPrice = 0;

    public HealthyBurger(String meat, int baseBurgerPrice) {
        super( "brown", meat, baseBurgerPrice);
    }

    public void addTofu(double additionPrice) {
        if (totalExtraAdditions < extraAdditionsLimit) {
            this.tofu = true;
            totalExtraAdditionsPrice += additionPrice;
            totalExtraAdditions++;
            System.out.println("An addition 'Tofu' is added to the order");
        } else {
            System.out.println("You can't add more extra additions. Max allowed: " + extraAdditionsLimit);
        }
    }

    public void addCucumber(double additionPrice) {
        if (totalExtraAdditions < extraAdditionsLimit) {
            this.cucumber = true;
            totalExtraAdditionsPrice += additionPrice;
            totalExtraAdditions++;
            System.out.println("An addition 'Cucumber' is added to the order");
        } else {
            System.out.println("You can't add more extra additions. Max allowed: " + extraAdditionsLimit);
        }
    }

    public double getTotalExtraAdditionsPrice() {
        System.out.println("Your current extra additions price is: " + totalExtraAdditionsPrice + "$");
        return totalExtraAdditionsPrice;
    }
}
