package practice;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class GenerateUniqueStrings {
//    private static Set<String> cache = new HashSet<>();
//    public static void main(String[] args) {
//        generatePermutation("funmii",0,6);
//    }
//    public static String swapString(String a, int i, int j) {
//        char[] b =a.toCharArray();
//        char ch;
//        ch = b[i];
//        b[i] = b[j];
//        b[j] = ch;
//        return String.valueOf(b);
//    }
//
//    public static void generatePermutation(String str, int start, int end)
//    {
//
//        //Prints the permutations
//        if (start == end-1 && (!cache.contains(str))) {
//                System.out.println(str);
//                cache.add(str);
//        }
//        else
//        {
//            for (int i = start; i < end; i++)
//            {
//                //Swapping the string by fixing a character
//                str = swapString(str,start,i);
//                //Recursively calling function generatePermutation() for rest of the characters
//                generatePermutation(str,start+1,end);
//                //Backtracking and swapping the characters again.
//                str = swapString(str,start,i);
//            }
//        }
//    }
static int count = 0;
public static void main(String[] args) {
    File file = new File("");
    String  x=  file.getAbsolutePath();
    System.out.println(x);
//    String[] elements = {"a", "b", "c"};
//    int maxLength = 5;
//    combineStringFromElements(elements, "", maxLength);
//    System.out.println(count);
}

    private static void combineStringFromElements(String[] elements, String currentString, int maxLength) {
        if (currentString.length() == maxLength) {
            count++;
            System.out.println(currentString);
            return;
        }
        for (String element : elements) {
            combineStringFromElements(elements, currentString + element, maxLength);
        }
    }
}
