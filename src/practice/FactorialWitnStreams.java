package practice;

import java.util.stream.IntStream;

public class FactorialWitnStreams {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }
    public static int factorial(int x){
        return IntStream.rangeClosed(1,x).reduce((m,y)->y*m).getAsInt();
    }
}
