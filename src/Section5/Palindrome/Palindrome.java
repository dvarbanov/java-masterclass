package Section5.Palindrome;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(12323));
    }

    private static boolean isPalindrome(int number) {

        int reverseNumber = 0;
        int remainingNumber = number;
        while (remainingNumber > 0) {
            int lastDigit = remainingNumber % 10;
            remainingNumber = remainingNumber / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        return (number == reverseNumber);
    }
}
