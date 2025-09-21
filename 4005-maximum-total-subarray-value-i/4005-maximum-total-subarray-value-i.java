class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int x : nums)
            {
                min = Math.min(min,x);
                max = Math.max(max,x);
            }
        ans = max - min;
        return ans * k;
    }
}