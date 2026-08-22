class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int boughtFor = prices[0];
        for(int i=0;i<prices.length;i++){
            int sellFor = prices[i] - boughtFor;
            maxProfit = (maxProfit < sellFor) ? sellFor : maxProfit;
            boughtFor = (boughtFor < prices[i]) ? boughtFor : prices[i];
        }
        return maxProfit;
    }
}
