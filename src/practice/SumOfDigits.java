package practice;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(3451));
    }

    public static int sumOfDigit(int number) {
//       int sum;
//        for (sum = 0; number > 0; sum+=number%10, number/=10);
//        return sum;

//        int sum = 0;
//        while(number > 0){
//            sum = sum + number%10;
//            number/=10;
//        }
//        return sum;

        if(number == 0){
            return 0;
        }
        return (number%10) + sumOfDigit(number/10);

    }
}

