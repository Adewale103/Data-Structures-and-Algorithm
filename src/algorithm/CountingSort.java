package algorithm;

public class CountingSort {
    public static void main(String[] args) {
        int[] intArray = {2,5,9,8,2,8,7,10,4,3};
        countingSort(intArray, 2,10);
        for (int num : intArray){
            System.out.println(num);
        }

        }

    private static void countingSort(int[] array, int min, int max) {
        int[] newArray = new int[(max - min)+1];
        for (int i = 0; i < array.length; i++) {
            newArray[array[i] - min]++;
        }
        int j = 0;

        for (int i = min; i <= max; i++) {
            while(newArray[i-min] > 0){
                array[j++] = i;
                newArray[i-min]--;
            }
        }
    }

}
