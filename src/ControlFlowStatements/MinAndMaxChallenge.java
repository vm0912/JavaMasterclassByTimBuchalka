package ControlFlowStatements;

import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
           int min = Integer.MAX_VALUE;
           int max = Integer.MIN_VALUE;
           int next;
            while (true) {
                System.out.println("Enter number:");
                if (scanner.hasNextInt()) {
                  next = scanner.nextInt();
                  max = Math.max(next,max);
                  min = Math.min(next,min);
                } else {
                    System.out.println("Invalid input.");
                    break;
                }
            }
            System.out.println("The minimum is "+ min + " and the maximum is "+ max);
        }
    }
}
