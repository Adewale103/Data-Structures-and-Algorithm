package leet_code_solutions;

import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int size = arr.size();
        double positive = arr.stream().filter(x->x>0).count() * 1.0/size;
        double zero = arr.stream().filter(x->x==0).count() * 1.0/size;
        double negative = arr.stream().filter(x->x<0).count() * 1.0/size;

        System.out.printf("%.6f\n",positive);
        System.out.printf("%.6f\n",negative);
        System.out.printf("%.6f",zero);



    }

}
