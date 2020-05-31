package ControlFlowStatements;

public class WhileAndDoWhile {
    public static void main(String[] args) {

//        System.out.println("number is even "+ isEvenNumber(5));
//        System.out.println("number is even "+ isEvenNumber(2));
//        System.out.println("number is even "+ isEvenNumber(11));
//        System.out.println("number is even "+ isEvenNumber(8));

        int startNumber= 4;
        int finishNumber = 20;
        while(startNumber<=finishNumber){
            System.out.println("Number "+ startNumber+" is even number: "+ isEvenNumber(startNumber));
            startNumber++;
        }

    }

    public static boolean isEvenNumber (int number){
        return (number%2 ==0 );

    }
}
