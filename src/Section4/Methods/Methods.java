package Section4.Methods;

public class Methods {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score is " + highScore);

//        Challenge

        int myHighScore = 1000;
        int position = calculateHighScorePosition(myHighScore);
        displayHighScorePosition("Dani", position);

        myHighScore = 900;
        position = calculateHighScorePosition(myHighScore);
        displayHighScorePosition("Dani", position);

        myHighScore = 400;
        position = calculateHighScorePosition(myHighScore);
        displayHighScorePosition("Dani", position);

        myHighScore = 50;
        position = calculateHighScorePosition(myHighScore);
        displayHighScorePosition("Dani", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {   // same as if (gameOver == true) {
            int finalScore =  score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

//    Challenge
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position = 4; // assuming posiotion 4 will be returned
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100); {
            position = 3;
        }

        return position;
    }
}
