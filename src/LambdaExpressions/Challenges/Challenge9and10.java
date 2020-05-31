package LambdaExpressions.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CHALLENGE 8 was skipped because it wasn't a programming exercise
 * CHALLENGE 9:
 * Print the items in list in a sorted order and convert to uppercase the capital letter where necessary.
 * Use lambda expressions wherever possible.
 * CHALLENGE 10:
 * Use the method references instead of lambdas
 * SOLUTION:
 * The code below.
 */
public class Challenge9and10 {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie","harry", "Jacob");

        List<String> upperCasedList = new ArrayList<>();
        //challenge 9
        topNames2015.forEach(s -> {
            upperCasedList.add(s.substring(0,1).toUpperCase() + s.substring(1));
        });
        //challenge 9
//        upperCasedList.sort((s1,s2) -> s1.compareTo(s2));
        //challenge 10
        upperCasedList.sort(String::compareTo);
        //challenge 9
//        upperCasedList.forEach(s-> System.out.println(s));
        //challenge 10
        upperCasedList.forEach(System.out::println);
    }
}
