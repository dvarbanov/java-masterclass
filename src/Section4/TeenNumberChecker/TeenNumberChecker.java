package Section4.TeenNumberChecker;

/*
 * Checks whether the given value is between 13-19
 */

public class TeenNumberChecker {

    public static void main(String[] args) {

        boolean result = isTeen(17);
        System.out.println(result);

    }

    public static boolean isTeen(int age) {

        return age >= 13 && age <= 19;

    }
}
