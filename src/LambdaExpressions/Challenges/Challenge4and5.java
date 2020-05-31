package LambdaExpressions.Challenges;

import java.util.function.Function;

/**
 * CHALLENGE 4:
 * Instead of executing the function from challenge 3 directly, pass it as s parameter to a method
 * called everySecondCharacter that accepts the function as a parameter and executes it with the argument "1234567890".
 * It should return the result of the function. For bonus points, don't hardcode the argument string within the method.
 * CHALLENGE 5:
 * Call the method from the challenge 4.
 * SOLUTION:
 * The code below.
 */
public class Challenge4and5 {

    private static Function<String, String> lambdaFunction= s -> {
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(i%2 == 1){
                returnVal.append(s.charAt(i));
            }
        }
        return returnVal.toString();
    };;

    public static void main(String[] args) {
        String input = "1234567890";

        System.out.println(everySecondCharacter(lambdaFunction, input));

    }


    public static String everySecondCharacter(Function<String, String> lambdaFunction, String input){
        return lambdaFunction.apply(input);
    }

}
