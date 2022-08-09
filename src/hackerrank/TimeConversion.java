package hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:02:00AM"));
    }
    public static String timeConversion(String s) {
        // Write your code here
        String[] token = s.split(":");
        if(token[0].equals("12") && token[2].charAt(2)=='A'){
            token[0] = "00";
        }
        else if (token[2].charAt(2) == 'P'){
            token[0] = String.valueOf(Integer.parseInt(token[0]) + 12);
        }
        return String.format("%s:%s:%s",token[0],token[1],token[2].substring(0,2));


    }
}
