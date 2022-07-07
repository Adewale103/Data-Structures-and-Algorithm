package practice;

import java.util.HashSet;
import java.util.Set;

public class WithRepetition {
    public static void main(String[] args) {
        String s = "abcabdeccdccd";
        String j = "wwsadertwwod";
        System.out.println(longestSubstring(s));
        System.out.println(longestSubstring(j));

    }
    public static int longestSubstring(String string){
        Set<Character> store = new HashSet<>();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {
                if(store.contains(string.charAt(j))){
                    count = 0;
                    store.clear();
                    break;
                }
                else{
                    count++;
                    maxCount = Math.max(maxCount,count);
                }
                store.add(string.charAt(j));
            }

        }
        return maxCount;
    }

//    public static int longestSubstring2(String string){
//        Set<Character> store = new HashSet<>();
//        int left = 0;
//        int right = 0;
//        while(right < string.length()){
//            if(store.contains(string.charAt(right))){
//               store.remove(string.charAt(right));
//               left = string.indexOf(right) + 1;
//
//
//            }
//        }
//
//
//    }
}
