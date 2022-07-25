package leet_code_solutions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {7,4,1,2,9,8,3};
        rotateArray(array,3);
        System.out.println(Arrays.toString(array));

    }
    public static void rotateArray(int[] array, int k){
        reverse(array,0,array.length-k-1);
        reverse(array, array.length-k, array.length-1);
        reverse(array,0, array.length-1);
    }
    public static  void reverse(int[] array, int left, int right){
        while(left < right){
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
            left++;
            right--;
        }
    }
}
