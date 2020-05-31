package LambdaExpressions.Challenges;

/**
 * CHALLENGE:
 * Write the anonymous class as a lambda expression.
 * SOLUTION:
 * The code below the anonymous class.
 */
public class Challenge1 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for(String part : parts){
                    System.out.println(part);
                }
            }
        };

        Runnable lambda = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part : parts){
                System.out.println(part);
            }
        };

        //testing the output of the two runnables, they were executed in the same thread for simplification purposes
        System.out.println("The anonymous class thread...");
        runnable.run();
        System.out.println("The lambda thread...");
        lambda.run();
    }
}
