package LambdaExpressions.Challenges;

import java.util.function.Function;

/**
 * CHALLENGE:
 * Write the code that will execute the function with an argument of "1234567890".
 * SOLUTION:
 * The code below the method.
 */
public class Challenge3 {
    public static void main(String[] args) {
        Function<String,String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i<s.length(); i++){
                if(i%2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        //The solution
        System.out.println(lambdaFunction.apply("1234567890"));
    }
}
