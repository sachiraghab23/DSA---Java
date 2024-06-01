/*
Q. You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class BuySellStocks{
  public static int findMaxProfit(int prices[]){
    int n = prices.length;
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i = 0; i<n; i++){
      if(buyPrice < prices[i]){
        int profit = prices[i] - buyPrice; //today profit
        maxProfit = Math.max(profit, maxProfit);
      }
      else{
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }
  public static void main(String[] args){
    int stockPrices[] = {7,1,5,3,6,4};
    System.out.println("Maximum profit: "+findMaxProfit(stockPrices));
  }
}

// java BuySellStocks.java