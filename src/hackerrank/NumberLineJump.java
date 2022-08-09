package hackerrank;

public class NumberLineJump {
    public static void main(String[] args) {

    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 > v2){
            if((x1-x2)%(v2-v1)==0){
                return "YES";
            }
        }
        return "NO";
    }
}
