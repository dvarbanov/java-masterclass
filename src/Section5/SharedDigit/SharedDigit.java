package Section5.SharedDigit;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12345, 16789));
    }

    private static boolean hasSharedDigit(int num1, int num2) {

        boolean sharedDigit = false;

        while (num1 > 0) {
            int lastDigitOfNum1 = num1 % 10;
//            System.out.println("Loop 1, lastDigitOfNum1 = " + lastDigitOfNum1);
            num1 /= 10;
//            System.out.println("Loop 1, num1 = " + num1);

            int num2Copy = num2;

            while (num2Copy > 0) {
                int lastDigitOfNum2 = num2Copy % 10;
//                System.out.println("Loop 2, lastDigitOfNum2 = " + lastDigitOfNum2);
                num2Copy /= 10;
//                System.out.println("Loop 2, num2 = " + num2Copy);

                if (lastDigitOfNum1 == lastDigitOfNum2) {
                    sharedDigit = true;
                    System.out.println("The first shared digit found is: " + lastDigitOfNum1);
                    break;
                }
            }
            if (sharedDigit) {
                break;
            }
        }

        return sharedDigit;
    }
}
