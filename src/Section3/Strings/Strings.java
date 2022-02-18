package Section3.Strings;

public class Strings {

    public static void main(String[] args) {

        String myString = "This is a string";
        myString = myString + " with some more";
        System.out.println(myString);

        myString = myString + " \u00A9 2021";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 10;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

//        Challenge

    }
}
