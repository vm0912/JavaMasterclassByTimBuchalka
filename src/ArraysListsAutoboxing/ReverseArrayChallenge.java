package ArraysListsAutoboxing;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        System.out.println("Array value is " + Arrays.toString(array));
        reverse(array);
        System.out.println("Array value after calling the reverse() method " + Arrays.toString(array));
    }

    public static void reverse(int [] array){
        int temp;
            for(int i = 0; i< array.length/2; i++){
                temp = array[i];
                System.out.println("Temp value is " + temp);
                array[i]= array[array.length-1-i];
                array[array.length-1-i] = temp;
            }
    }
}
