package Section5.SumOddRange;

public class SumOddRange {

    public static void main(String[] args) {

        // Program returns the sum of the odd numbers between a given range or -1 if the input is invalid
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));

    }

    public static boolean isOdd(int number) {
        return (number > 0) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        if ((start < 0) || (end < 0) || (start > end)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
