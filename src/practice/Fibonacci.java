package practice;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(checkIfFibonacci(54));
    }
    public static String checkIfFibonacci(int num){
        List<Integer> cache = new ArrayList<>();
        int previousNum = 0;
        int sum;
        int nextNum = 1;

        while(previousNum <= num){
            cache.add(previousNum);
            sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
        if(cache.contains(num)){
            return "yes";
        }
        return "no";

    }
}
