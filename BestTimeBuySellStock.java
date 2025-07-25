public class BestTimeBuySellStock {

    /* You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * 
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5   // Buy at 1, sell at 6. -1+6=5
     * 
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     */

    public static int maxProfit(int[] prices) {

        int max = 0, min = 10000;
        int posMax = 0, posMin = 0;
        int result = 0;

        for(int i = 0; i<prices.length; i++){
            if(max < prices[i]){
                max = prices[i];
                posMax = i;
            }

            if(min > prices[i]){
                min = prices[i];
                posMin = i;
            }

            if(posMin>posMax){
                max = 0;
                posMax = 0;
            } else if (posMin<posMax){
                if (result < -min+max){
                    result = -min+max;
                }
            }
        }

        return result;
    }


    public static int maxProfit2(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = {3,7,1,6,4};
        System.out.println(maxProfit2(prices));
    }
    
}
