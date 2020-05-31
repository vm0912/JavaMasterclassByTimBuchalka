package RegularExpressions.Challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CHALLENGE 11:
 * Extract the content of the curly braces in strings.
 * CHALLENGE 12:
 * Write the regex that matches a 5-digit US zip code, use the "11111" for testing.
 * CHALLENGE 13:
 * Write the regex that matches a US zip code in format od five digits, then dash, then four more digits,
 * for example "11111-1111".
 * CHALLENGE 14:
 *  Write the regex that matches a US zip code in both formats (from previous two challenges).
 * SOLUTION:
 * The code below.
 */

public class Challenges11to14 {
    public static void main(String[] args) {
        System.out.println("CHALLENGE 11:");
        String challenge11 = "{0,2},{0,5},{1,3},{2,4}";
        String regex11 = "\\{(\\d+,\\d+)\\}";
        Pattern pattern11 = Pattern.compile(regex11);
        Matcher matcher11 = pattern11.matcher(challenge11);
        while(matcher11.find()){
            System.out.println("Result => "+ matcher11.group(1));
        }
        System.out.println("-----------------");

        System.out.println("CHALLENGE 12:");
        String challenge12 = "11111";
        String regex12 = "^\\d{5}$";
        Pattern pattern12 = Pattern.compile(regex12);
        Matcher matcher12 = pattern12.matcher(challenge12);
        System.out.println("The string matches the pattern: " + matcher12.matches());
        System.out.println("-----------------");

        System.out.println("CHALLENGE 13:");
        String challenge13 = "11111-1111";
        String regex13 = "^\\d{5}-\\d{4}$";
        Pattern pattern13 = Pattern.compile(regex13);
        Matcher matcher13 = pattern13.matcher(challenge13);
        System.out.println("The string matches the pattern: " + matcher13.matches());
        System.out.println("-----------------");

        System.out.println("CHALLENGE 14:");
        String regex14 = "^\\d{5}(-\\d{4})?$";
        System.out.println("The first zip code matches the regex: " + challenge12.matches(regex14));
        System.out.println("The second zip code matches the regex: " + challenge13.matches(regex14));
        System.out.println("-----------------");

    }
}
