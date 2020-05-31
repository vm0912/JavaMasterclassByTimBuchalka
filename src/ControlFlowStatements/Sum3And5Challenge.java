package ControlFlowStatements;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int sum=0;
        int increment=0;
        for(int i=1; i<=1000; i++){
            if(((i%3) ==0) && ((i%5) ==0)){
                System.out.println("Current number dividable by 3 and 5 is "+i);
                sum+=i;
                increment++;
                if(increment ==5){
                    break;
                }
            }
        }
        System.out.println("The sum of the first " + increment +" numbers dividable by 3 and 5 is "+sum);
    }

}
