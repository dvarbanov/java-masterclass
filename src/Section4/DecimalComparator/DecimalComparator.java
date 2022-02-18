package Section4.DecimalComparator;

public class DecimalComparator {

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result);

        result = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result);

        result = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(result);

        result = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        int a = (int) (firstNumber * 1000);
        int b = (int) (secondNumber * 1000);

        System.out.println("First: " + a + ", Second:" + b);
        return (a == b);
    }
}

//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//EXAMPLES OF INPUT/OUTPUT:
//* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.