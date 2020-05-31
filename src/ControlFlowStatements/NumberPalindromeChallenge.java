package ControlFlowStatements;

public class NumberPalindromeChallenge {
    public static void main(String[] args) {
        System.out.println("number is palindrome: " + isNumberPalindrome(5));
        System.out.println("number is palindrome: " + isNumberPalindrome(11));
        System.out.println("number is palindrome: " + isNumberPalindrome(21));
        System.out.println("number is palindrome: " + isNumberPalindrome(1234321));
        System.out.println("number is palindrome: " + isNumberPalindrome(12344321));
        System.out.println("number is palindrome: " + isNumberPalindrome(123000));
        System.out.println("number is palindrome: " + isNumberPalindrome(-55));
        System.out.println("number is palindrome: " + isNumberPalindrome(0));


    }

    public static boolean isNumberPalindrome(int number) {
        int reversedNumber = 0;
        if (number < 0) {
            number *= -1;
        }
        int copy = number;
        while (copy > 0) {
            int remainder = copy % 10;
            copy /= 10;
            reversedNumber = reversedNumber * 10 + remainder;
        }
        System.out.println("original number is " + number);
        System.out.println("reversed number is " + reversedNumber);

        return number == reversedNumber;
    }
}
