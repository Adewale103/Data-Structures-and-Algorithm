package practice;

public class MaximumSubArray {
    public static void main(String[] args) {
     int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubArray(nums));
    }
    private static int maximumSubArray(int[] array){
        int currentSum = 0;
        int maxSum = array[0];
        for (int i = 0; i < array.length; i++) {
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum+= array[i];
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

}
