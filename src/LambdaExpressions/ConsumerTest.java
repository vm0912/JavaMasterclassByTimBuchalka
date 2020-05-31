package LambdaExpressions;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> c1 = s1 -> System.out.println(s1.toUpperCase());
        Consumer<String> c2 = s1 -> System.out.println(s1.toLowerCase());
        Consumer<String> c3 = System.out::println;


        c1.andThen(c2).andThen(c3).accept("Hello, World!");

    }

}
