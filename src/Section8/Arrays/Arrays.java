package Section8.Arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

//        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + ", values is " + myIntegers[i]);
//        }
//
//        System.out.println("Average: " + getAverage(myIntegers));


//        int[] myIntArray = new int[10]; // = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////        myIntArray[0] = 45;
////        myIntArray[1] = 476;
////        myIntArray[5] = 50;
//
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//
//        printArray(myIntArray);

        resizeArray();
        printArray(baseData);


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values: \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static void resizeArray() {

        int[] original = baseData;

        baseData = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", values is " + array[i]);
        }

    }
}
