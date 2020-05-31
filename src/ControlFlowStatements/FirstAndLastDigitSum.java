package ControlFlowStatements;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println("sum of the first and the last digit is " +firstAndLastDigitSum(5));
        System.out.println("sum of the first and the last digit is " +firstAndLastDigitSum(12));
        System.out.println("sum of the first and the last digit is " +firstAndLastDigitSum(-22));
        System.out.println("sum of the first and the last digit is " +firstAndLastDigitSum(-35236));
        System.out.println("sum of the first and the last digit is " +firstAndLastDigitSum(5555));


    }

    public static int firstAndLastDigitSum(int number){
        if(number<0)
            number*=-1;
        if(number<10)
            return -1;
//        System.out.println("number is "+number);
        int reversed=0;
        int lastDigit= number%10;
        while(number>0){
            reversed=reversed*10 + (number%10);
            number/=10;
        }
//        System.out.println("reversed number is "+ reversed);
        int firstDigit= reversed%10;
        return lastDigit+firstDigit;
    }
}
