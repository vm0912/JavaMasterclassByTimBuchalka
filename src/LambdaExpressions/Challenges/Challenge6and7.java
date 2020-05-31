package LambdaExpressions.Challenges;

import java.util.function.Supplier;

/**
 * CHALLENGE 6:
 * Write a lambda that maps to the java.util.Supplier interface which should return a string "I love Java!"
 * and assign it to a variable called iLoveJava.
 * CHALLENGE 7:
 * Use the supplier to assign the result string to a variable called supplierResult and print it to the console.
 * SOLUTION:
 * The code below.
 */
public class Challenge6and7 {
    private static Supplier<String> iLoveJava = () -> "I love Java!";

    public static void main(String[] args) {
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

}
