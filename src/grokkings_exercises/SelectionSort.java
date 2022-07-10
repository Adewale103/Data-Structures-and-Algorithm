package grokkings_exercises;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {23,102,3,45,6,78,76,43,2,99,85,7};
        System.out.println(Arrays.toString(selectionSort(numbers)));
    }
    public static int findSmallest(int[] array){
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[smallestIndex]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int[] selectionSort(int[] array){
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallest(array);
            newArray[i] = array[smallest];
            array[smallest] = Integer.MAX_VALUE;
        }
        return newArray;
    }
}
