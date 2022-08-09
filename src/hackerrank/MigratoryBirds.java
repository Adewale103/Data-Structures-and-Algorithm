package hackerrank;

import java.util.*;
import java.util.stream.IntStream;

public class MigratoryBirds {
    public static void main(String[] args) {

        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(4);
        n.add(4);
        n.add(4);
        n.add(5);
        n.add(3);

        System.out.println(migratoryBirds(n));

    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> entries = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if(entries.containsKey(arr.get(i))){
                entries.put(arr.get(i),entries.get(arr.get(i))+1);
            }
            else{
                entries.put(arr.get(i),1);
            }
        }
        return Collections.max(entries.entrySet(),Map.Entry.comparingByValue()).getKey();





    }
}
