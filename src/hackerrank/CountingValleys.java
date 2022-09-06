package hackerrank;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(12,"DDUUDDUDUUUD"));
    }
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int up = 0;
        int down = 0;
        int valley = 0;
        boolean potentialValley = false;
        boolean isOnGroundLevel = true;

        for (int i = 0; i < steps; i++) {
            char x = path.charAt(i);
            if (up == down){
                up = 0;
                down = 0;
                isOnGroundLevel = true;
            }
            if(!(isOnGroundLevel) && x == 'D'){
                down += 1;

            }
            if(!(isOnGroundLevel) && x == 'U'){
                up += 1;
            }
            if(isOnGroundLevel && x == 'D'){
                potentialValley = true;
                down += 1;
                isOnGroundLevel = false;
            }
            if(isOnGroundLevel && x == 'U'){
                up += 1;
                isOnGroundLevel = false;
            }

            if(potentialValley && up == down){
                valley += 1;
                up = 0;
                down = 0;
                potentialValley = false;
                isOnGroundLevel = true;
            }
        }
   return valley;
    }
}
