package grokkings_exercises;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {2,5,7,13,45,67,89};
        System.out.println(binarySearch(array,45));
        System.out.println(recursiveBinarySearch(array,45,0,array.length-1));
    }
    public static int binarySearch(int[] array, int number){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            int guess = array[mid];
            if(guess == number){
                return mid;
            }
            if(guess > number){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        throw new NullPointerException("Number not found!");
    }
    public static int recursiveBinarySearch(int[] array, int number, int left, int right){
        int mid = (left + right)/2;
        int guess = array[mid];
        if(number == guess){
            return mid;
        }
        else if(number > guess){
            return recursiveBinarySearch(array,number,mid+1,right);
        }
        else{
            return recursiveBinarySearch(array,number,left,mid-1);

        }
    }
}
