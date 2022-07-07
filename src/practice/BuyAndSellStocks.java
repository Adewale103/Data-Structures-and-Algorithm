package practice;

import static java.lang.Math.max;

public class BuyAndSellStocks {
    public static void main(String[] args) {
   int[] array = {8,1,5,3,7,4};
        System.out.println(computeMaximumProfit(array));
    }

    public static int computeMaximumProfit(int[] array){
       int l = 0;
       int r = 1;
       int maxProfit = 0;
       int profit;
       while(r < array.length){
           if(array[r] > array[l]){
               profit = array[r] - array[l];
               maxProfit = max(profit,maxProfit);
           }
           else{
               l = r;
           }
           r+=1;
           
       }
       return maxProfit;
    }
}
