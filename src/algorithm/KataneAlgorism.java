package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class KataneAlgorism {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        int result = checkForUnique(list);
        System.out.println(result);
    }

    private static int checkForUnique(List<Integer> list) {
       Set<Integer> bowl = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(bowl.contains(list.get(i))){
                bowl.remove(list.get(i));
            }
            else{
                bowl.add(list.get(i));
            }
        }
        if(bowl.isEmpty()){
            return -1;

        }
        return bowl.stream().toList().get(0);
    }
}
