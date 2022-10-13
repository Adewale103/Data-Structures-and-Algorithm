package leet_code_solutions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List<List<Integer>>  result = generatePascalTriangle(5);
        System.out.println(result);
    }

    private static List<List<Integer>> generatePascalTriangle(int numberOfRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numberOfRows == 0){
            return triangle;
        }
        List<Integer> first_row  = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);
        for (int i = 1; i < numberOfRows; i++) {
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j-1)+ prev_row.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
