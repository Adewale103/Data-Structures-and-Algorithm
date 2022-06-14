package data_structures;

import java.util.LinkedList;

public class StackChallenge {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a car i saw?"));
        System.out.println(checkForPalindrome("I did, did i?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    private static boolean checkForPalindrome(String string) {
       LinkedList<Character> list = new LinkedList<>();
       StringBuilder stringWithoutPunctuation = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char c = string.toLowerCase().charAt(i);
            if(c >= 'a' && c <= 'z'){
                list.push(c);
                stringWithoutPunctuation.append(c);
            }
        }
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < stringWithoutPunctuation.length(); i++) {
            reversedString.append(list.pop());
        }
        return stringWithoutPunctuation.toString().equals(reversedString.toString());
    }


}
