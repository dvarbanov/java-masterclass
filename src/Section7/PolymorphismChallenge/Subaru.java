package Section7.PolymorphismChallenge;

class Subaru extends Car {
    public Subaru(int cylinders) {
        super("Subaru", cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Subaru is acceleratin'");
    }
}
