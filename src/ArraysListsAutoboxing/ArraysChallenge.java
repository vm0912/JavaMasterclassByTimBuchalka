package ArraysListsAutoboxing;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    public static void main(String[] args) {
        int arraySize = 5;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Please input " + arraySize + " integers>\r");
            int[] beginningArray = getIntegers(arraySize,scanner);
            printArray(beginningArray);
            int[] sortedDescending = sortIntegers(beginningArray);

        }
    }

    public static int[] getIntegers(int arraySize, Scanner scanner){
        int[] beginningArray = new int[arraySize];
        for(int i= 0 ; i<arraySize; i++){
            beginningArray[i] = scanner.nextInt();
        }
        return beginningArray;
    }

    public static void printArray(int[] arrayToPrint){
        for(int i = 0; i<arrayToPrint.length; i++){
            System.out.println("Element #"+ i + ": "+ arrayToPrint[i]);
        }
    }

    public static int[] sortIntegers(int[] beginningArray){
        System.out.println("sortIntegers() called.");
        int[] sortedDescending = Arrays.copyOf(beginningArray,beginningArray.length);
        for(int i = 0; i<sortedDescending.length;i++){
            sortedDescending[i]*=(-1);
        }
        Arrays.sort(sortedDescending);
        for(int i = 0; i<sortedDescending.length;i++){
            sortedDescending[i]*=(-1);
        }
        printArray(sortedDescending);
        return sortedDescending;
    }
}
