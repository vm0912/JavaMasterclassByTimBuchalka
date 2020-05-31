package ControlFlowStatements;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            System.out.println();
            for (int i = 0; i < number; i++) {
                // a loop which prints * and a space
                for (int j = 0; j < number; j++) {

                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ( j==(number -1) -i ) ) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
