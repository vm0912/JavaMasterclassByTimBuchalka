package ExpressionsStatementsMethodsEtc;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(0);
        printConversion(1);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kmph) {
        if (kmph < 0) {
            return -1;
        }
        return Math.round(kmph * 0.62d);
    }

    public static void printConversion(double kmph) {
//        if(kmph <0){
//            System.out.println("Invalid Value");
//        }
        long mph = toMilesPerHour(kmph);
        if (mph != -1) {
            System.out.println(kmph + "km/h = " + mph + "mi/h");

        }
        else {
            System.out.println("Invalid Value");
        }

    }
}
