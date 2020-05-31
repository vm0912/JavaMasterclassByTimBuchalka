package LambdaExpressions.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CHALLENGE 13:
 * Why doesn't the print in the peek method in the code below execute?
 * SOLUTION: The terminal operation on the stream is missing so the stream isn't evaluated/executed.
 * CHALLENGE 14:
 * Modify the stream from challenge 13 so the print in the peek method could execute
 * SOLUTION:
 * The code below.
 */
public class Challenges13and14 {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie","harry", "Jacob");
        //challenge 13
        topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo);

        //challenge 14
        topNames2015.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

    }
}
