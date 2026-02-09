class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int x : prices)
        {
            if(x < min)
                min = x;
            if(min < x)
                maxProfit = Math.max(maxProfit, x - min);
        }
        return maxProfit;
    }
}