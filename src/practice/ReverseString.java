package practice;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = reverse(array,0,5);
        System.out.println(Arrays.toString(result));

    }


    public static int[] reverse(int[] array, int start, int end){
        int temp;
        while(start < end){

            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static int[] reverseB(int[] array, int start, int end){
        if(start >= end){
            return array;
        }
        int temp;
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseB(array,start+1,end-1);
        return array;

    }


}
