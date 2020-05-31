package ControlFlowStatements;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("number is perfect: " + isPerfectNumber(10));
        System.out.println("number is perfect: " + isPerfectNumber(5));
        System.out.println("number is perfect: " + isPerfectNumber(6));
        System.out.println("number is perfect: " + isPerfectNumber(17));
        System.out.println("number is perfect: " + isPerfectNumber(56));
        System.out.println("number is perfect: " + isPerfectNumber(28));

    }
    public static boolean isPerfectNumber(int number){
        int divisorSum= 0;
        int currentDivisor = 1;
        while(currentDivisor < number){
            if(number%currentDivisor == 0) {
                System.out.println(currentDivisor+ " is the divisor of " + number);
                divisorSum += currentDivisor;
            }
            currentDivisor++;
        }
        return divisorSum ==number;
    }
}
