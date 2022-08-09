package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);

        System.out.println(breakingRecords(scores));

    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int min = scores.get(0);
        int minCount = 0;
        int maxCount = 0;
        int max = scores.get(0);

        for (int i = 1; i < scores.size(); i++) {
            if(scores.get(i) > max){
                maxCount++;
                max = scores.get(i);
            }
            if(scores.get(i) < min){
                minCount++;
                min = scores.get(i);
            }
        }
        result.add(maxCount);
        result.add(minCount);
        return result;
    }

}
