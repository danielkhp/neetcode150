class Solution {
  public int maxProfit(int[] prices) {
      int maxP = 0;
      int minPrice = prices[0];

      for (int i = 1; i < prices.length; i++) {
          minPrice = Math.min(minPrice, prices[i]);
          maxP = Math.max(maxP, prices[i] - minPrice);
      }

      return maxP;
  }
}
