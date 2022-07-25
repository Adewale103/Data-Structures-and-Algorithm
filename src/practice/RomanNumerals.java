package practice;

import java.util.TreeMap;

public class RomanNumerals {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        String result = romanNumerals(map, 678, sb);
        System.out.println(result);
    }

    private static String romanNumerals(TreeMap<Integer, String> map, int i, StringBuilder sb) {
        if(i <= 0){
            return sb.toString();
        }
        int firstPart = map.floorKey(i);
        sb.append(map.get(firstPart));
        return romanNumerals(map,i-firstPart,sb);
    }
}
