package leet_code_solutions;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(4);
        list1.add(7);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(19);
        list2.add(1);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(3);
        list3.add(45);

        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(diagonalDifference(mainList));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(arr.size()-1-i);
        }
        int total = leftDiagonal - rightDiagonal;
        return Math.abs(total);
    }

}
