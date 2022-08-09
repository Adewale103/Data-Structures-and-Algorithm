package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(birthday(s,3,2));

    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int sum = 0;
        int result = 0;
        for (int i = 0; i < s.size()-m+1; i++) {
            for (int j = i; j < i+m; j++) {
                sum+=s.get(j);
            }
            if(sum == d){
                result+=1;
            }
            sum = 0;
        }
     return result;
    }
}
