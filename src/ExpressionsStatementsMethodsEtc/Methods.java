package ExpressionsStatementsMethodsEtc;

public class Methods {
    public static void main(String[] args) {

        int finalScore = calculateScore(true, 800, 5, 100);

        System.out.println("Your final score is " + finalScore);

        finalScore = calculateScore(true, 10000, 8, 200);

        System.out.println("Your final score is " + finalScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Vitomir", position);

        position = calculateHighScorePosition(800);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(200);
        displayHighScorePosition("Bob", position);

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        System.out.println("Method called");
        if (gameOver) {
            int finalScore = score + (bonus * levelCompleted);
//            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int tablePosition) {

        System.out.println("Player " + playerName + " managed to get to the position " + tablePosition
                + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500)
//            return 2;
//        else if (playerScore >= 100)
//            return 3;
//        else
//            return 4;
        int scorePosition = 4;
        if(playerScore >= 1000) {
            scorePosition = 1;
        } else if (playerScore >= 500){
            scorePosition = 2;
        } else if (playerScore >= 100){
        scorePosition = 3;
    }
//        {scorePosition++;}
        return scorePosition;
    }

}
