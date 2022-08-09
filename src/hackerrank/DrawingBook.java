package hackerrank;

public class DrawingBook {
    public static void main(String[] args) {
        int a = 2;
        int b = 25;
        int c = 1;
        int d = 14;
        System.out.println(Math.sqrt(b));
    }
    public static int pageCount(int n, int p) {
        // Write your code here
        int flipCount = 0;
        if(p == 1 || p == n){
            return 0;
        }
        if(p == 2 || p == n-1){
            return 1;
        }
        int fromFront = p;
        int fromBack = n-p;
        if(fromFront <= fromBack){
            for (int i = 1; i <= n; i++) {
                if(p == i){
                    if(p%2==0){
                        p+=1;
                    }
                   flipCount = (p-1)/2;
                    break;
                }
            }
        }
        else{
            for (int i = n; i >=1; i--) {
                if (p == i) {
                    if((n-p)%2==0){
                        n+=1;
                    }
                    flipCount = (n - p) / 2;
                    break;
                }
            }
        }
     return flipCount;
    }
}
