package Section6.SumCalculator;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("First number: " + calculator.getFirstNumber());
        System.out.println("Second number: " + calculator.getSecondNumber());
        System.out.println("Add: " + calculator.getAdditionResult());
        System.out.println("Subtract: " + calculator.getSubtractionResult());
        System.out.println("Multiply: " + calculator.getMultiplicationResult());
        System.out.println("Divide: " + calculator.getDivisionResult());
    }
}
