package Section5.LastDigitChecker;

public class LastDigitChecker {

    public static void main(String[] args) {

    //Write a method named hasSameLastDigit with three parameters of type int.
    //Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
    //The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
    //Write another method named isValid with one parameter of type int.
    //The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if (isValid(firstNum) && isValid(secondNum) && isValid(thirdNum)) {

            int lastDigit1 = firstNum % 10;
            int lastDigit2 = secondNum % 10;
            int lastDigit3 = thirdNum % 10;

            return (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3);

        }
        return false;

    }
}
