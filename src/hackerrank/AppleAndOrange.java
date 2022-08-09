package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppleAndOrange {
    public static void main(String[] args) {

    }
    public static String countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int[] appleArray = apples.stream().mapToInt(x->x+a).toArray();
        int[] orangeArray = oranges.stream().mapToInt(x->x+b).toArray();
        return Arrays.stream(appleArray).filter(x-> x>=s && x<=t).count() + "\n"+ Arrays.stream(orangeArray).filter(x-> x>=s && x<=t).count();
    }

}


