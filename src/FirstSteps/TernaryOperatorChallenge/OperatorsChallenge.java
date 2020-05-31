package FirstSteps.TernaryOperatorChallenge;

public class OperatorsChallenge {
    public static void main(String[] args) {

        double firstDouble = 20.00 ;
        double secondDouble = 80.00;
//        System.out.println("\u0003");
        double solution3 = (firstDouble + secondDouble) * 100.00 ;
        double solution4 = solution3 % 40.;
//        System.out.println(solution4);
//        boolean test = (solution4==0.0) ? true : false;
        boolean test = (solution4==0);
        System.out.println("Output value of the boolean is: " + test);
        if(!test){
            System.out.println("Got some reminder!");
        }

    }
}
