package practice;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] array = {3,6,9,5,4,11,1,4};
        System.out.println(containDuplicate(array));
    }
    public static boolean containDuplicate(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])){
                return true;
            }
            set.add(array[i]);
        }
        return false;
    }
}
