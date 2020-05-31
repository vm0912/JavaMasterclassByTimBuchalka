package ExpressionsStatementsMethodsEtc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 12));
        System.out.println(getDurationString(77, 2));

        System.out.println(getDurationString(3600));

        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

        System.out.println(getDurationString(0,-44));

    }

    public static String getDurationString(int minutes, int seconds) {
        String duration;
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMins = minutes % 60;
            NumberFormat numberFormat = new DecimalFormat("00");
            duration = numberFormat.format(hours) + "h " + numberFormat.format(remainingMins) + "m " + numberFormat.format(seconds) + "s";
        } else {
            duration = "Invalid value.";
        }
        return duration;
    }

    public static String getDurationString(int seconds) {
        String duration;
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println("calling the nested method...");
            duration = getDurationString(minutes, remainingSeconds);
        } else {
            duration = "Invalid value.";
        }
        return duration;
    }
}
