package Section7.PolymorphismChallenge;

class Mercedes extends Car {
    public Mercedes(int cylinders) {
        super("Mercedes", cylinders);
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes is flyin'");
    }
}
