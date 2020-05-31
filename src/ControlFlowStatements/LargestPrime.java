package ControlFlowStatements;

public class LargestPrime {
    public static void main(String[] args) {
//        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrimeV2(21));
//        System.out.println(getLargestPrimeV2(19));

        System.out.println(getLargestPrimeV2Reversed(21));



//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
//        System.out.println(getLargestPrime(45));
//        System.out.println(getLargestPrime(-1));
    }

    //NOT WORKING
//    public static int getLargestPrime(int number) {
//        int primeCounter = 0;
//        int loopCounter=0;
//        if (number >= 2) {
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    primeCounter++;
//                    number /= i;
//                    i--;
//                }
//                loopCounter =i;
//            }
//            System.out.println("Loop was executed "+ loopCounter + " times.");
//            return number;
//        }
//        return -1;
//    }

    public static int getLargestPrimeV2(int number) {
        int loopCounter=0;
        int largestPrime=-1;
        boolean isPrime;
        if (number >= 2) {
            for (int i = 2; i <= number; i++) {
                isPrime=true;
                for(int j = 2; j<= i/2; j++)
                {
                    // condition for nonprime number
                    if(i % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    largestPrime=i;
                loopCounter ++;
            }
            System.out.println("Loop V2 was executed "+ loopCounter + " times.");
            return largestPrime;
        }
        return -1;
    }

    public static int getLargestPrimeV2Reversed(int number) {
        int loopCounter=0;
        int largestPrime=-1;
        boolean isPrime;
        if (number >= 2) {
            for (int i = number; i >=2; i--) {
                isPrime=true;
                for(int j = 2; j<= i/2; j++)
                {

                    // condition for nonprime number
                    if(i % j == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    largestPrime = i;
                    break;
                }
                loopCounter ++;
            }
            System.out.println("Loop V2reversed was executed "+ loopCounter + " times.");
            return largestPrime;
        }
        return -1;
    }

}
