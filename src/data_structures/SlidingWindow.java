package data_structures;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = {1,4,2,10,2,3,1,0,20};
        int k = 4;
        int result = calculate(array, k);
        System.out.println(result);
    }

    private static int calculate(int[] array, int k) {
        int firstSum= 0;
        int maxSum;
        for (int i = 0; i < k; i++) {
            firstSum+= array[i];
        }
        maxSum = firstSum;
        for (int i = k; i < array.length; i++) {
            firstSum += array[i]-array[i-k];
            maxSum = Math.max(maxSum,firstSum);
        }
        return maxSum;
    }
}
