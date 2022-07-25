import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        System.out.println(extraLongFactorials(5));

    }
    public static BigInteger extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        // Write your code here
        if(n < 2){
            return BigInteger.ONE;
        }
        result = BigInteger.valueOf(n).multiply(extraLongFactorials(n-1));
        return result;
    }
}
