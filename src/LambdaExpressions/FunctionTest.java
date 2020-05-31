package LambdaExpressions;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, String> composition = s1 -> s1.stripLeading();
        String ourString = "       Some Random string.";
        System.out.println(ourString + " -> "+ composition.andThen(String::toLowerCase).apply(ourString));
    }
}

