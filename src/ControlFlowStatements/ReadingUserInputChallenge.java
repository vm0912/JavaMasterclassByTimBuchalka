package ControlFlowStatements;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberCount = 1;
            int sum = 0;
            while (numberCount <= 10) {
                System.out.println("Enter number #" + numberCount + ":");
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                } else {
                    System.out.println("Invalid input.");
//                    break;
                    scanner.next();
//                    scanner.nextLine();
                }
                numberCount++;
            }
            System.out.println("Sum of the numbers is " + sum);
        }


    }

}
