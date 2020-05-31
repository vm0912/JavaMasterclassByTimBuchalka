package ControlFlowStatements;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("greatest common divisor is " + greatestCommonDivisor(5,1));
        System.out.println("greatest common divisor is " + greatestCommonDivisor(8,4));
        System.out.println("greatest common divisor is " + greatestCommonDivisor(1,1));
        System.out.println("greatest common divisor is " + greatestCommonDivisor(10,12));
        System.out.println("greatest common divisor is " + greatestCommonDivisor(3,7));
        System.out.println("greatest common divisor is " + greatestCommonDivisor(256,16));
        System.out.println("greatest common divisor is " + greatestCommonDivisor(55,55));

    }
    public static int greatestCommonDivisor(int first, int second){
        for(int i = Math.min(first,second); i>=1;i--){
            if(first % i == 0 && second % i == 0){
                return i;
            }
        }
        return -1;
    }
}
