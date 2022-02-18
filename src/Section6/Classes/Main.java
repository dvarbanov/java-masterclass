package Section6.Classes;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();  // created an object of type Car
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
