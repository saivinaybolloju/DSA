class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int profit=0;
        int cost=0;
        for(int i=1;i<prices.length;i++){
            // cost=a[i]-mini;
            profit=Math.max(profit,prices[i]-mini);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
}
