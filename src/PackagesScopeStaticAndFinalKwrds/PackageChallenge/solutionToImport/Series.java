package PackagesScopeStaticAndFinalKwrds.PackageChallenge.solutionToImport;

public class Series {

    /*
     nSum(int n) returns the sum of all numbers from 0 to n.
     The first 10 numbers are:
     0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
     */
    public static int nSum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        return sum;
    }

    /*
     factorial(int n) returns the product of all numbers from 1 to n
     i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
     The first 10 factorials are:
     0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
     */

    public static int factorial(int n) {
        int result = 1;
        if(n > 0){
            for(int i=1; i<=n; i++){
                result*=i;
            }
        }
        return result;
    }

/*
         fibonacci(n) returns the nth Fibonacci number. These are defined as:
         f(0) = 0
         f(1) = 1
         f(n) = f(n-1) + f(n-2)
         (so f(2) is also 1. The first 10 fibonacci numbers are:
         0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
 */
    public static int fibonacci(int n) {
        switch (n){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
