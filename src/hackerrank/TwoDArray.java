package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArray {
    public static void main(String[] args) {
        List<List<Integer>> master = new ArrayList<>();
        Integer[] firstRow = {1, 1, 1, 0, 0, 0};
        List<Integer> row1 = Arrays.asList(firstRow);
        Integer[] secondRow = {0, 1, 0, 0, 0, 0};
        List<Integer> row2 = Arrays.asList(secondRow);
        Integer[] thirdRow = {1, 1, 1, 0, 0, 0};
        List<Integer> row3 = Arrays.asList(thirdRow);
        Integer[] fourthRow = {0, 9, 2, -4, -4, 0};
        List<Integer> row4 = Arrays.asList(fourthRow);
        Integer[] fifthRow = {0, 0, 0, -2, 0, 0};
        List<Integer> row5 = Arrays.asList(fifthRow);
        Integer[] sixRow = {0, 0, -1, -2, -4, 0};
        List<Integer> row6 = Arrays.asList(sixRow);

        master.add(row1);
        master.add(row2);
        master.add(row3);
        master.add(row4);
        master.add(row5);
        master.add(row6);
        System.out.println("answer= "+hourglassSum(master));
    }
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int sum;
        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = 0; j < arr.size()-2; j++) {
                sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+1)
                        + arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1)
                        + arr.get(i+2).get(j+2);
                System.out.println(sum);
                result.add(sum);
                sum = 0;
            }
        }
        return result.stream().mapToInt(x->x).max().getAsInt();

    }
}
