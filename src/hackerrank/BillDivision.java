package hackerrank;

import java.util.List;

public class BillDivision {
    public static void main(String[] args) {

    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int totalBill = bill.stream().mapToInt(x->x).sum();
        int MinusAnnaBill = totalBill-bill.get(k);
        int AnnaBill = MinusAnnaBill/2;
        if(AnnaBill == b){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-AnnaBill);
        }

    }
}
