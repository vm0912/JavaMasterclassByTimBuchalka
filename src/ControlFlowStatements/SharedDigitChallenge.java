package ControlFlowStatements;
/*
The algorithm works for the numbers between 10 and 99
 */
public class SharedDigitChallenge {
    public static void main(String[] args) {
        System.out.println("numbers have shared digits: "+ checkForSharedDigits(11, 23));
        System.out.println("numbers have shared digits: "+ checkForSharedDigits(11, 21));
        System.out.println("numbers have shared digits: "+ checkForSharedDigits(-54, 0));
        System.out.println("numbers have shared digits: "+ checkForSharedDigits(-33, 23));

    }
    public static boolean checkForSharedDigits(int firstNum, int secondNum){
        if(firstNum<0)
            firstNum*=-1;
        if(secondNum<0)
            secondNum*=-1;
        if((firstNum>=10)&& (firstNum<=99)&&((secondNum>=10)&& (secondNum<=99))) {
            int firstNumLastDigit = firstNum%10;
            int secondNumLastDigit = secondNum%10;

            int firstNumFirstDigit = firstNum/10;
            int secondNumFirstDigit = secondNum/10;

            return (firstNumFirstDigit ==secondNumFirstDigit || firstNumFirstDigit == secondNumLastDigit ||
                    firstNumLastDigit== secondNumFirstDigit || firstNumLastDigit == secondNumLastDigit);
        }
        return false;
    }
}
