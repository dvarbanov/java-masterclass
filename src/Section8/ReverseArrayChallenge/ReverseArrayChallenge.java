package Section8.ReverseArrayChallenge;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] intArray = new int[] {2, 5, 8, 43, 23};

        System.out.println(Arrays.toString(intArray));

        reverse(intArray);

        System.out.println(Arrays.toString(intArray));
    }

    public static void reverse(int[] array) {

        int temp;
        int halfLength = array.length / 2;
        int maxIndex = array.length - 1;

        for (int i = 0; i < halfLength; i++) {

            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
