package RegularExpressions;

public class RegularExpressionTest {
    public static void main(String[] args) {

        String someString = "anefekefGGGt35wwv";
        System.out.println(someString.replaceAll("a","OO"));
        System.out.println(someString);
        System.out.println(someString.replaceAll("^..","OO"));
        System.out.println(someString.matches("^anefekefGGGt35ww"));
        System.out.println(someString.matches("^.+"));
        System.out.println(someString.matches("^.*"));
        System.out.println(someString.replaceAll("...$"," FINITO"));
        System.out.println(someString.replaceAll("[e]","55"));
        System.out.println(someString.replaceAll("(?iu)[a-h1-5]","66"));
        System.out.println(someString.replaceAll("\\D","s"));

        String newString = "abc abc def def ghi ghi ";
        System.out.println(newString.replaceAll("\\b","s"));
        System.out.println(newString.replaceAll("\\B","s"));

        System.out.println("Run".replaceAll("[Rr]un","sun"));


    }
}
