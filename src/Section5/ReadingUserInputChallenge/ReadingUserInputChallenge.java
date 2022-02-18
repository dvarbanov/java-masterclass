package Section5.ReadingUserInputChallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers and their sum will be returned");

        int sum = 0;
        int count = 1;
        while (count <= 5) {

            System.out.println("Enter No:" + count);

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("Invalid number, try again.");
            }
            scanner.nextLine(); // MagicMike
        }
        System.out.println("The sum of the numbers is " + sum);

        scanner.close();
    }
}
