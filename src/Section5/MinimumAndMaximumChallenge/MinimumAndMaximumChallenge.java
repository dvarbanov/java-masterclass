package Section5.MinimumAndMaximumChallenge;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min number: " + minNumber + ", Max number: " + maxNumber);
        scanner.close();
    }
}
