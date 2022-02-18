package Section7.PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Subaru subaru = new Subaru(6);
        subaru.accelerate();

        Mercedes mercedes = new Mercedes(10);
        mercedes.accelerate();

        Audi audi = new Audi(6);
        audi.accelerate();
    }
}
