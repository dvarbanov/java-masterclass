package Section4.IfKeywordAndCodeBlocks;

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000) {
//            System.out.println("Your score is < 5000");
//        } else if (score == 5000) {
//            System.out.println("Your score is = 5000 ");
//        }
//        else {
//            System.out.println("Your score is > 5000");
//        }

        if (gameOver == true) {   // same as if (gameOver) {
            int finalScore =  score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

//        int savedFinalScore = finalScore; //the var finalScore can't be found inside the code block

        //Challenge

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println(("Second final score is " + finalScore));
        }


    }
}
