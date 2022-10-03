package data_structures;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] array = {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
        wavePrintColumnWise(array);
    }
    public static void wavePrintColumnWise(int[][] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i % 2 == 0) System.out.print(array[j][i]+", ");
                else{System.out.print(array[array.length-1-j][i]+", ");}
            }
        }
        System.out.println("END");
    }
}
