package practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int[] array = {2,7,9,4,3,11,15};
        System.out.println(Arrays.toString(indicesOfSum(array,20)));
        }

//        int[] array = {2,7,11,15};
//        int target = 99;
//        int[] result = indicesOfSum(array,target);
//        System.out.println(Arrays.toString(result));


    public static int[] indicesOfSum(int[] array, int target){
        int[] result = new int[2];
        int diff;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            diff = target - array[i];
            if(map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
            }
            map.put(array[i],i );
        }
        return result;
    }
}
