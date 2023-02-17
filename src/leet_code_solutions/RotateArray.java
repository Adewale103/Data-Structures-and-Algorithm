package leet_code_solutions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {7,4,1,2,9,8,3};
        rotateArray(array,3);
        System.out.println(Arrays.toString(array));

    }

    private static void rotateArray(int[] array, int k) {
        reverse(array, 0,array.length-1-k);
        reverse(array, array.length-k, array.length-1);
        reverse(array, 0, array.length-1);
    }

    private static void reverse(int[] array, int left, int right) {
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }


}
