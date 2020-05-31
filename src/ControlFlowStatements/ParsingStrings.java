package ControlFlowStatements;

public class ParsingStrings {
    public static void main(String[] args) {
        String stringNumber = "2020";
        System.out.println("current type is " + stringNumber.getClass());
        int intNumber = Integer.parseInt(stringNumber);
        System.out.println("current type is " +((Object) intNumber).getClass().getCanonicalName());
        System.out.println("current type is Integer " + Integer.class.isInstance(intNumber));
        System.out.println("current type is Integer " + ((Object) intNumber instanceof Integer));


    }
}
