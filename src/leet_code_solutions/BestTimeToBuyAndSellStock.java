package leet_code_solutions;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2){
            return 0;
        }
        int profit = Integer.MIN_VALUE;
        for(int i=0; i<prices.length-1; i++){
            for(int j=0; j< prices.length; j++){
                if(profit < prices[j] - prices[i]){
                    profit = prices[j] - prices[i];
                }
            }
        }
        return profit;
    }
}
