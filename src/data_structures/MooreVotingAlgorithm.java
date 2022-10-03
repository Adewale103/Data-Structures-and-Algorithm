package data_structures;

import java.util.HashMap;
import java.util.Map;

public class MooreVotingAlgorithm {
    public static void main(String[] args) {
    int[] array = {4,5,6,7,8,4,4};
    int k = 3;
    mooreVotingAlgorithm(array, k);
    }
    public static void mooreVotingAlgorithm(int[] array, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int check = array.length/k;
        for (int j : array) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        for(Map.Entry<Integer, Integer> integerEntry: map.entrySet()){
            if(integerEntry.getValue() > check){
                System.out.println(integerEntry.getKey());

            }
        }

    }
}
