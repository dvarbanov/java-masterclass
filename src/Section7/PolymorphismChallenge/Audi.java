package Section7.PolymorphismChallenge;

class Audi extends Car {
    public Audi(int cylinders) {
        super("Audi", cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Audi is fat and curious");
    }
}
