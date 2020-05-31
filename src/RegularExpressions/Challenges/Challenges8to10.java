package RegularExpressions.Challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CHALLENGE 8: Modify the regex in challenge 7 to use a group so the pattern can occur multiple times as shown in the
 * string below, print all the digits in the string.
 * CHALLENGE 9: The same as the challenge 8, but with modified string.
 * CHALLENGE 10: Using the string from the challenge 9, print the start and end indices of the numbers, indices are inclusive!
 * SOLUTION:
 * The code below.
 */
public class Challenges8to10 {
    public static void main(String[] args) {

        System.out.println("CHALLENGE 8:");
        String challenge8 = "abcd.135uvqz.7tzik.999";
//        String regex7 ="^[A-z]+\\.[0-9]+$";
        String regex8 = "[A-z]+\\.([0-9]+)";
        Pattern pattern = Pattern.compile(regex8);
        Matcher matcher = pattern.matcher(challenge8);
        while(matcher.find()){
            System.out.println("group: " + matcher.group(1));

        }

        System.out.println("CHALLENGE 9:");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String regex9 = "[A-z]+\\.([0-9]+)\\s";
        Pattern pattern9 = Pattern.compile(regex9);
        Matcher matcher9 = pattern.matcher(challenge9);
        while(matcher9.find()){
            System.out.println("group: " + matcher9.group(1));

        }
        System.out.println("---------------------");

        System.out.println("CHALLENGE 10:");
        matcher9.reset();
        while(matcher9.find()){
            System.out.println("group start: " + matcher9.start(1) + " group end: " + ( matcher9.end(1)-1));

        }
        System.out.println("---------------------");



    }
}
