package Section7.OOPMasterChallengeExercise;

public class Hamburger {

    private String burgerName;
    private String bread;
    private String meat;

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean mustard;

    private double totalAdditions = 0;
    private int additionsLimit = 4;

    private double burgerPrice;
    private double totalAdditionsPrice = 0;
    private double orderPrice;


    public Hamburger(String bread, String meat, int burgerPrice) {
        this.burgerName = "Hamburger";
        this.bread = bread;
        this.meat = meat;
        this.burgerPrice = burgerPrice;
    }


    public double getBurgerPrice() {
        System.out.println("The base price of the Hamburger is: " + burgerPrice + "$");
        return burgerPrice;
    }

    public double getTotalAdditionsPrice() {
        System.out.println("Your current additions price is: " + totalAdditionsPrice + "$");
        return totalAdditionsPrice;
    }

    public double getOrderPrice() {
        orderPrice = burgerPrice + totalAdditionsPrice;
        System.out.println("Your total price of the order is: " + orderPrice + "$");
        return orderPrice;
    }

    public void addLettuce(double additionPrice) {
        if (totalAdditions < additionsLimit) {
            this.lettuce = true;
            totalAdditionsPrice += additionPrice;
            totalAdditions++;
            System.out.println("An addition 'Letuce' is added to the order");
        } else {
            System.out.println("You can't add more additions. Max allowed: " + additionsLimit);
        }
    }

    public void addTomato(double additionPrice) {
        if (totalAdditions < additionsLimit) {
            this.tomato = true;
            totalAdditionsPrice += additionPrice;
            totalAdditions++;
            System.out.println("An addition 'Tomato' is added to the order");
        } else {
            System.out.println("You can't add more additions. Max allowed: " + additionsLimit);
        }
    }

    public void addCarrot(double additionPrice) {
        if (totalAdditions < additionsLimit) {
            this.carrot = true;
            totalAdditionsPrice += additionPrice;
            totalAdditions++;
            System.out.println("An addition 'Carrot' is added to the order");
        } else {
            System.out.println("You can't add more additions. Max allowed: " + additionsLimit);
        }
    }

    public void addMustard(double additionPrice) {
        if (totalAdditions < additionsLimit) {
            this.mustard = true;
            totalAdditionsPrice += additionPrice;
            totalAdditions++;
            System.out.println("An addition 'Mustard' is added to the order");
        } else {
            System.out.println("You can't add more additions. Max allowed: " + additionsLimit);
        }
    }
}
