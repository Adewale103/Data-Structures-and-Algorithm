package practice;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] array = {-3,-2,4,1,-2,1,4};
        System.out.println(maximumProductSubArray(array));

    }
    public static int maximumProductSubArray(int[] array){
       int curMin = 1;
       int curMax = 1;
       int result = array[0];
        for (int i = 0; i < array.length; i++) {
            int temp = curMax * array[i];
            curMax = Math.max(Math.max(curMin * array[i], array[i]), curMax* array[i]);
            curMin = Math.min(Math.min(curMin * array[i], array[i]), temp);
            result = Math.max(result,curMax);
        }
        return result;
    }

}
