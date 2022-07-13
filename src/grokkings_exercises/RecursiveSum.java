package grokkings_exercises;

public class RecursiveSum {
    public static void main(String[] args) {
        int[] numbers ={3,7,9,2,78};
        System.out.println(recursiveSum(numbers,0));
        System.out.println(count(numbers,0));
        System.out.println(maximum(numbers,0));
    }
    public static int recursiveSum(int[] array, int count){
        int sum;
        if(count == array.length){
            return 0;
        }
        sum = array[count] + recursiveSum(array, count+1);
        return sum;
    }
    public static int count(int[] array, int count){
        int arrayCount;
        if(count == array.length){
            return 0;
        }
        arrayCount = 1 + count(array, count+1);
        return arrayCount;
    }
    public static int maximum(int[] array, int count){
        int maximum;
        if(count == array.length){
            return 0;
        }
        maximum = Math.max(array[count],maximum(array,count+1) );
        return maximum;
    }
}
