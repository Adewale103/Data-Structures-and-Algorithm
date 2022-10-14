package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RearrangeSortedList {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        x.add(7);
        List<Integer> result = rearrange(x);
        System.out.println(result);
    }

    private static List<Integer> rearrange(List<Integer> x) {
        int count = 0;
        int start = 0;
        int end = x.size()-1;
        List<Integer> result = new ArrayList<>();
        while(start <= end){
            if(count % 2 == 0){
                result.add(x.get(end));
                end--;
            }
            else{
                result.add(x.get(start));
                start++;
            }
            count++;
        }
        return result;
    }
}
