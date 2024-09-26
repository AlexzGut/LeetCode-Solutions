class Solution {
    /*
    Using one single loop
    To solve this problem with a time complexity of O(N) instead of O(N^2), is important
    to keep track of the cheapest price while iterating through the array of prices, then 
    while the cheapest price remains the same, find the profit on that day and replace the
    maxProfit if applicable.
    runtime 2ms 
    Time Complexity O(N)
    */
    public int maxProfit(int[] prices) {
        int cheapestPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // Get the cheapest price until the current iteration
            if (prices[i] < cheapestPrice) {
                cheapestPrice = prices[i];
            // If the cheapest price remains the same, calculate the profit
            } else {
                profit = prices[i] - cheapestPrice;
                // Get the maxProfit
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
