package Section8.ArraysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printIntegers(myArray);
        int[] mySortedArray = sortIntegers(myArray);
        printIntegers(mySortedArray);

    }

    public static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        return array;

    }

    public static void printIntegers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static int[] sortIntegers(int[] array) {

       int[] sortedArray = Arrays.copyOf(array, array.length);
       int temp;
       boolean flag = true;

       while (flag) {
           flag = false;

           for (int i = 0; i < array.length - 1; i++) {

               if (sortedArray[i] < sortedArray[i + 1]) {
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray[i + 1];
                   sortedArray[i + 1] = temp;
                   flag = true;
               }
           }
       }

       return sortedArray;

    }
}
