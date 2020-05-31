package ControlFlowStatements;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(11));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(11111));
        System.out.println(sumDigits(10203040));
    }

    public static int sumDigits(int number){
        if(number<10)
            return -1;
        int sum=0;
        while(number>0){
            int remainder =number%10;
            number/=10;
            sum+=remainder;
        }
        return sum;

    }
}
