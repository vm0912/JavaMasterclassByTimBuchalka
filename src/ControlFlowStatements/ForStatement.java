package ControlFlowStatements;

public class ForStatement {
    public static void main(String[] args) {

        calculateInterest(100, 1, 5);
        System.out.println("Is it less then 3 primes? "+ checkIfLessThenThreePrimes(1,4));
    }

    public static void calculateInterest(double amount, double beginningInterestRate, double endInterestRate) {
        for (double incrementedRate = beginningInterestRate; incrementedRate < endInterestRate + 1; incrementedRate++) {
            System.out.println(amount + " at " + incrementedRate + "%" + " is " + (amount * (incrementedRate / 100)));
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
//            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean checkIfLessThenThreePrimes(int loopBeginning, int loopEnd) {
        int primeCalc = 0;
        for (int i = loopBeginning; i <= loopEnd; i++) {
            if (isPrime(i)) {
                System.out.println("number "+ i+ " is a prime number");
                primeCalc++;
                if (primeCalc == 3) {
                    return false;
                }
            }
        }
        return true;
    }
}
