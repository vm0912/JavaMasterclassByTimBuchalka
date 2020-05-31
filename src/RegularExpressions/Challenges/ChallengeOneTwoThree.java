package RegularExpressions.Challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CHALLENGE 1: Write the string literal regular expression that will match the following string, use the String.matches()
 * to verify.
 * CHALLENGE 2: Write the regex to match the two strings in the code and use String.matches() to verify.
 * CHALLENGE 3: Use Matcher.matches() to check for matches for the regex that uses \w+.
 * SOLUTION:
 * The code below.
 */
public class ChallengeOneTwoThree {
    public static void main(String[] args) {
        //challenge 1
        String challenge1 = "I want a bike.";
        String regex = "^I want a bike.$";
        System.out.println("Regex matches string 1: "+challenge1.matches(regex));
        System.out.println("--------------------------------------------");

        //challenge 2
        String challenge2 = "I want a ball.";
        String regex2 = "^I want a b.+.$";
        System.out.println("CHALLENGE 2:");
        System.out.println("Regex matches string 1: "+challenge1.matches(regex2));
        System.out.println("Regex matches string 2: "+challenge2.matches(regex2));
        System.out.println("--------------------------------------------");

        //challenge 3
        String regex3 = "I want a \\w+.";
        System.out.println("CHALLENGE 3:");
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println("Pattern matches string 1: "+ matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println("Pattern matches string 2: "+matcher.matches());
        System.out.println("--------------------------------------------");


    }
}
