package ExpressionsStatementsMethodsEtc;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(feetAndInchesToCms(5, 10));
        System.out.println(feetAndInchesToCms(70));

        System.out.println(feetAndInchesToCms(6,0));
        System.out.println(feetAndInchesToCms(72));

        System.out.println(feetAndInchesToCms(8, 4));
        System.out.println(feetAndInchesToCms(100));
    }

    public static double feetAndInchesToCms(double feet, double inches) {
        int ft2in = 12;
        double in2cm = 2.54;
        if (feet >= 0 && (inches <= 12 && inches >= 0)) {
            return ((feet * ft2in) + inches) * in2cm;
        } else {
            return -1;
        }
    }

    public static double feetAndInchesToCms(double inches) {
        int ft2in = 12;
        double in2cm = 2.54;
        if (inches >= 0) {
            double feet = inches / ft2in;
            inches -= (feet * ft2in);
            System.out.println("calling a second method...");
            return feetAndInchesToCms(feet, inches);

        } else {
            return -1;
        }
    }

}
