package leet_code_solutions;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {
    public static void main(String[] args) {
        String word = "FeEbubEgarr";

        System.out.println(longestPalindrome(word));
    }

    private static String longestPalindrome(String word) {
        String longest = word.substring(0,1);
        for (int i = 0; i < word.length(); i++) {
            String utm = helper(word,i,i);
            if(utm.length() > longest.length()){
                longest = utm;
            }
            utm = helper(word,i,i+1);
            if(utm.length() > longest.length()){
                longest = utm;
            }
        }
        return longest;
    }

    private static String helper(String word, int start, int end) {
        while(start >= 0 && end <= word.length()-1 && word.charAt(start) == word.charAt(end)){
            start--;
            end++;
        }
        return word.substring(start+1,end);
    }


}