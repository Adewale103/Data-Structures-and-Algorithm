package hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BetweenTwoSets {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);

        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a, b));

    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        int maxA = a.stream().mapToInt(x -> x).max().getAsInt();
        int maxB = b.stream().mapToInt(x -> x).max().getAsInt();

        int[] array = IntStream.rangeClosed(maxA,maxB).toArray();

        int minCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < a.size(); j++) {
                if(array[i]%a.get(j)==0){minCount+=1;}
            }
            if(minCount == a.size()){
                result.add(array[i]);
            }
            minCount = 0;
        }

        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < b.size(); j++) {
                if(b.get(j)%array[i]==0){maxCount+=1;}
            }
            if(maxCount == b.size()){
                result2.add(array[i]);
            }
            maxCount = 0;
        }
        System.out.println(result);
        System.out.println(result2);

        return (int) result.stream().mapToInt(x->x).filter(result2::contains).count();
    }
}

