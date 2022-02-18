package Section3.ByteShortInt;

public class ByteShortInt {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);


        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        //Challenge

        byte byteNumber = 10;
        short shortNumber = 20;
        int intNumber = 50;
        long longNumber = 50_000L + 10L * (byteNumber + shortNumber + intNumber);
        System.out.println("longNumber = " + longNumber);

        short shortTotal = (short) (1000 + 10 * (byteNumber + shortNumber + intNumber));
        System.out.println("shortTotal = " + shortTotal);



    }
}
