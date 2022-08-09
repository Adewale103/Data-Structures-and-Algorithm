package hackerrank;

import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) {

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Set<Integer> storageHouse = new HashSet<>();
        int pairs = 0;
        for (Integer eachElement : ar) {
            if (!storageHouse.contains(eachElement)) {
                storageHouse.add(eachElement);
            } else {
                pairs++;
                storageHouse.remove(eachElement);
            }
        }
        return pairs;

    }

}
