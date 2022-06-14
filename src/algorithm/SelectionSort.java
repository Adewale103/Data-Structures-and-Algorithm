package algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[largest] < intArray[i]){
                    largest = i;
                }
            }
            swap(intArray, lastUnsortedIndex, largest);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] array, int i, int j){
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

