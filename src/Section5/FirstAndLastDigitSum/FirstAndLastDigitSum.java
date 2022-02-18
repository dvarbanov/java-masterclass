package Section5.FirstAndLastDigitSum;

public class FirstAndLastDigitSum {

//   Find the sum of the first and last digit of a number

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(3564));
        System.out.println(sumFirstAndLastDigit(1));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(90211219));
        System.out.println(sumFirstAndLastDigit(39023117));
    }

    private static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            System.out.println("Only positive numbers are accepted");
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        if (number < 10) {
            System.out.println("This is a one digit number " + number + ". So the sum of its first and last digit is:");
        } else {
            System.out.println("The sum of the first and the last digits of " + number + " is:");
        }

        return firstDigit + lastDigit;
    }
}
