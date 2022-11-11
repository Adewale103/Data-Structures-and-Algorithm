package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GenerateUniqueStrings2 {

    public static List<String> getAllLists(String[] elements, int lengthOfList)
    {
        if(lengthOfList == 1) return Arrays.stream(elements).toList();
        else {
            List<String> allLists = new ArrayList<>();

            List<String> allSublists = getAllLists(elements, lengthOfList-1);

            for (String element : elements) {
                for (String allSublist : allSublists) {
                    //add the newly appended combination to the list
                    allLists.add((element + allSublist));
                }
            }
            return allLists;
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> totalResult = new ArrayList<>();
        String chars = "a,b,c,d,f,g,h,j";
        String[] database = chars.split(",");
        for (int i = 0; i < database.length; i++) {
            if(database[i].length() != 1){
                throw new RuntimeException("Invalid input, Separate each character by a comma");
            }
        }
        int minimumLength = 2;
        int maximumLength = 7;
        int expectedNumberOfStrings = 5000;
        int sum = 0;
        if(minimumLength < 1){
            throw  new RuntimeException("The minimum length can not be less than 1");
        }
        for (int i = minimumLength; i <= maximumLength ; i++) {
            sum += (Math.pow(database.length, i));
        }

        System.out.println("Maximum number of strings that can be generated is: "+sum);
        if(expectedNumberOfStrings > sum){
            throw new RuntimeException("The requested number of strings is greater than the strings that can be generated. Only "+sum+" strings can be generated");
        }
        for(int i=minimumLength; i<=maximumLength; i++){
            List<String> result = getAllLists(database, i);
            totalResult.addAll(result);
        }
        BufferedWriter out = null;
        for (int i = 0; i < expectedNumberOfStrings; i++) {
            try {
                FileWriter fstream = new FileWriter("text.txt", true);
                out = new BufferedWriter(fstream);
                out.write(totalResult.get(i));
                out.newLine();
                out.close();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
