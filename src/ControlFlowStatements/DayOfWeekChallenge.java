package ControlFlowStatements;

public class DayOfWeekChallenge {
    public static void main(String[] args) {

        printDayOfTheWeek(5);
        printDayOfTheWeek(3);
        printDayOfTheWeek(7);
        printDayOfTheWeek(-5);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("MONDAY");
                break;
            case 1:
                System.out.println("TUESDAY");
                break;
            case 2:
                System.out.println("WEDNESDAY");
                break;
            case 3:
                System.out.println("THURSDAY");
                break;
            case 4:
                System.out.println("FRIDAY");
                break;
            case 5 :
                System.out.println("SATURDAY");
                break;
            case 6:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;
        }
    }
}
