package Section5.AllFactors;

public class AllFactors {

    // All factors of a number

    public static void main(String[] args) {

        allFactors(100);
    }

    public static void allFactors(int number) {

        System.out.println("Found factors of number " + number + ":");

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}