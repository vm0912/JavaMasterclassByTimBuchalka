package LambdaExpressions.Challenges;

import java.util.function.Function;

/**
 * CHALLENGE:
 * Write the following method as a lambda expression.
 * SOLUTION:
 * The code below the method.
 */
public class Challenge2 {
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i<source.length(); i++){
            if(i%2 == 1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static void main(String[] args) {
        Function<String,String> everySecondChar = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i<source.length(); i++){
                if(i%2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
    }
}
