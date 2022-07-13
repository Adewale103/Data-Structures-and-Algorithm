package grokkings_exercises;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {23,67,89,76,54,3,77,90};
        quickSort(array,0,7);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = partition(array, low, high);
            quickSort(array,low,pivot-1);
            quickSort(array,pivot+1,high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int mediator = low-1;
        for (int i = low; i < high; i++) {
            if(array[i] < pivot){
                mediator++;
                int temp = array[mediator];
                array[mediator] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[mediator+1];
        array[mediator+1] = pivot;
        array[high] = temp;
        return mediator+1;
    }
}