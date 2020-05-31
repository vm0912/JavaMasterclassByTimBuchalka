package ExpressionsStatementsMethodsEtc;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver){
            int finalScore = score + (bonus*levelCompleted);
            System.out.println("Your final score is " + finalScore);
        }

         score = 10000;
         levelCompleted = 8;
         bonus = 200;

        if(gameOver){
            int finalScore = score + (bonus*levelCompleted);
            System.out.println("New final score is " + finalScore);
        }
    }
}
