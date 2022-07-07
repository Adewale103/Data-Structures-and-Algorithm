package practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(array)));
    }
    private static int[] productOfArrayExceptSelf(int[] array){
       int prefix = 1;
       int postFix = 1;
       int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = prefix;
            prefix*= array[i];
        }
        for (int i = array.length-1; i >= 0; i--) {
            result[i] *= postFix;
            postFix *= array[i];

        }
        return result;
    }
}
