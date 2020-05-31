package LambdaExpressions.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * CHALLENGE 11:
 * Use a stream and a chain of stream operations to convert the list to upper-cased capital letter and sort.
 * CHALLENGE 12:
 * Modify the stream from challenge 11 to print out how many names start with the letter 'A'
 * SOLUTION:
 * The code below.
 */
public class Challenge11and12 {

    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie","harry", "Jacob");

        //challenge 11
        List<String> outputList = topNames2015.stream().map(s->
             s.substring(0,1).toUpperCase() + s.substring(1))
                .sorted().collect(Collectors.toList());
        outputList.forEach(System.out::println);

        //challenge 12

        System.out.println(
                "Number of names in the list starting with 'A': "
                + topNames2015.stream().map(s->
                                s.substring(0,1).toUpperCase() + s.substring(1))
                                .filter((name)-> name.startsWith("A"))
                                .count());



    }

}
