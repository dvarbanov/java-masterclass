package Section4.MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {
//	int newScore = calculateScore("Dani",500);
//        System.out.println("New score is: " + newScore);
//
//        calculateScore(75);
//
//        calculateScore();

        calcFeetAndInchesToCentimeters(2, 1);

        calcFeetAndInchesToCentimeters(20);

    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("An unnamed player scored " + score + " points.");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("An unnamed player scored some points.");
//        return 0;
//    }

//    Challenge

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid data");
            return -1;
        }

        int inchesSum = feet * 12 + inches;
        System.out.println("inchesSum: " + inchesSum);

        double centimeters = inchesSum * 2.54;
        System.out.println("centimeters: " + centimeters);
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            System.out.println("Invalid data");
            return -1;
        }

        int feet = inches / 12;
        int remainingInches = inches % 12;

        System.out.println("Feet: " + feet);
        System.out.println("Remaining inches: " + remainingInches);

        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
