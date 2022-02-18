package Section5.ReadingUserInput;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        System.out.println("Enter your year of birth:");
        Scanner scanner = new Scanner(System.in);


        boolean hasNextInt = scanner.hasNextInt(); // Checks if the next input is a number

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // !! handle next line character (enter key) (Enter key which is pressed when entering int input)

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and your age is " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}
