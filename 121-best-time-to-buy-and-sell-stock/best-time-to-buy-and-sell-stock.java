class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxPf=0;
        for(int i=0;i<prices.length;i++){
            maxPf=Math.max(maxPf,prices[i]-min);
            min=Math.min(prices[i],min);
        }
       return maxPf;
    }
}