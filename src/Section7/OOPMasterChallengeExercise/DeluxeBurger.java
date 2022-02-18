package Section7.OOPMasterChallengeExercise;

public class DeluxeBurger extends Hamburger {

    private String notAllowedMessage = "You can't add any additions to the Deluxe Burger.";

    private boolean chips;
    private boolean drink;

    @Override
    public void addLettuce(double additionPrice) {
        System.out.println(notAllowedMessage);
    }

    @Override
    public void addTomato(double additionPrice) {
        System.out.println(notAllowedMessage);
    }

    @Override
    public void addCarrot(double additionPrice) {
        System.out.println(notAllowedMessage);
    }

    @Override
    public void addMustard(double additionPrice) {
        System.out.println(notAllowedMessage);
    }

    public DeluxeBurger(String meat, int baseBurgerPrice) {

        super("Deluxe Burger", meat, baseBurgerPrice);
        this.chips = true;
        this.drink = true;

    }
}
