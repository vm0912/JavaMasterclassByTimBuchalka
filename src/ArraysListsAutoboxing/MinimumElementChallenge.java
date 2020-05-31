package ArraysListsAutoboxing;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int arraySize = 5;
        System.out.println("Please input " + arraySize + " integers>\r");
        int[] beginningArray = readIntegers(arraySize,scanner);
        System.out.println("Minimum value in array "+ Arrays.toString(beginningArray) + " is " + findMin(beginningArray));
    }

    public static int[] readIntegers(int arraySize, Scanner scanner){
        int[] beginningArray = new int[arraySize];
        for(int i= 0 ; i<arraySize; i++){
            beginningArray[i] = scanner.nextInt();
        }
        return beginningArray;
    }


    public static int findMin(int[] array){
        int minimum=Integer.MAX_VALUE;
        for(int i = 0; i<array.length; i++){
            if(minimum > array[i]){
                minimum= array[i];
            }
        }
        return minimum;
    }
}
