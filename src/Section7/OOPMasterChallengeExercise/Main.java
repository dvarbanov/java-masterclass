package Section7.OOPMasterChallengeExercise;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("white", "beef", 5);
//        hamburger.getBaseBurgerPrice();

        HealthyBurger healthyBurger = new HealthyBurger("Seitan", 6);
//        healthyBurger.getBaseBurgerPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger("fish",8);
//        deluxeBurger.getBaseBurgerPrice();

        hamburger.addCarrot(0.25);
        hamburger.addLettuce(0.20);
        hamburger.addMustard(0.20);
        hamburger.addTomato(0.30);
        hamburger.addCarrot(0.25);
        hamburger.getTotalAdditionsPrice();
        hamburger.getBurgerPrice();
        hamburger.getOrderPrice();

        healthyBurger.addTofu(1.00);
        healthyBurger.addCucumber(0.30);
        hamburger.addCarrot(0.25);
        healthyBurger.addCucumber(0.30);
        hamburger.addCarrot(0.25);
        hamburger.addCarrot(0.25);
        hamburger.addTomato(0.30);
        hamburger.addTomato(0.30);

        healthyBurger.getTotalExtraAdditionsPrice();
        healthyBurger.getBurgerPrice();
        healthyBurger.getOrderPrice();

//        deluxeBurger.addCarrot();

    }
}
