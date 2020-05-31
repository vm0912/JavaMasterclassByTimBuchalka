package ExpressionsStatementsMethodsEtc;

//check if numbers are equal to three decimal places
public class DecimalComparator {
    public static void main(String[] args) {

        checkNumberEquality(1.456, 1.456);
        checkNumberEquality(0., 0.);
        checkNumberEquality(0.123, 0.1234);
        checkNumberEquality(0.234, 0.235);



    }

    public static boolean checkNumberEquality(double first, double second){
        if((int) (first*1000) == (int)(second*1000)) {
            System.out.println(first + " and " + second + " are equal to three decimal places");
            return true;
        }
        return false;
    }
}
