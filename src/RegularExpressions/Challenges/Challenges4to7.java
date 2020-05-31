package RegularExpressions.Challenges;

/**
 * CHALLENGE 4: Replace all blanks  in the string with the underscore and print it to the console.
 * CHALLENGE 5: Write the regex to match the entire string and use String.matches() to verify.
 * CHALLENGE 6: Write a regex to match ONLY the string from the challenge 5.
 * CHALLENGE 7: Write a regex to match a string that starts with a series of letters followed by a period after which
 * comes the numerical sequence.
 * SOLUTION:
 * The code below.
 */
public class Challenges4to7 {
    public static void main(String[] args) {
        //challenge 4
        System.out.println("CHALLENGE 4:");
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s","_"));
        //alternatively we could use .replaceAll(" ","_");
        System.out.println("------------------------------------");

        //challenge 5
        System.out.println("CHALLENGE 5:");
        String challenge5 = "aaabccccccccdddefffg";
        String regex5 = "^a+bc+d+ef+g$";
        System.out.println("The regex matches the string: "+ challenge5.matches(regex5));
        //alternatively we could use the following regex
        regex5 = "^[a-g]+$";
        System.out.println("The regex matches the string: "+ challenge5.matches(regex5));
        System.out.println("------------------------------------");

        //challenge 6
        System.out.println("CHALLENGE 6:");
        String regex6 = "^a{3}bc{8}d{3}ef{3}g$";
        System.out.println("The regex matches the string: "+ challenge5.matches(regex6));
        System.out.println("Trying to match with a similar string... ");
        String challenge6 = "abccccccccdddefffg";
        System.out.println("The regex matches the string: "+ challenge6.matches(regex6));
        System.out.println("------------------------------------");

        //challenge 7
        System.out.println("CHALLENGE 7:");
        String regex7 ="^[A-z]+\\.[0-9]+$";
        String challenge7 = "abcd.135";
        System.out.println("The regex matches the string: "+ challenge7.matches(regex7));
        //the following string doesn't match
        String notMatching = "f5.12a";
        System.out.println("The regex matches the string: "+ notMatching.matches(regex7));
        System.out.println("------------------------------------");

    }
}
