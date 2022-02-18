package Section8.MinimumElementChallenge;

import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many numbers?");
        int count = scanner.nextInt();
        scanner.nextLine();

//        System.out.println(Arrays.toString(readIntegers(count)));

        System.out.println("Minimum value in the array: " + findMin(readIntegers(count)));

    }

    public static int[] readIntegers(int count) {

        System.out.println("Input " + count + " numbers:");

        int[] intArray = new int[count];

        for (int i = 0; i < count; i++) {
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
