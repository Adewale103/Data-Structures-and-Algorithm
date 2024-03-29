package leet_code_solutions;

public class MaxBinaryGap {
    public static int solution(int N) {
        int max = 0;
        int count = -1;
        int r = 0;
        while (N > 0) {
// get right most bit & shift right
            r = N & 1;
            N = N >> 1;
            if (0 == r && count >= 0) {
                count++;
            }
            if (1 == r) {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }
}
