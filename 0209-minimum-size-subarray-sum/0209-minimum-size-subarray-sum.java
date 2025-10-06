class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int n = nums.length;
        int wsum = nums[j];
        while(j < n)
        {
            if(wsum >= target)
            {
                minSize = Math.min(minSize, j-i+1);
                wsum -= nums[i];
                i++;
            }
            else
            {
                j++;
                if(j < n)
                    wsum += nums[j];
            }
        }
        if(minSize == Integer.MAX_VALUE)
            return 0;
        else
            return minSize;
    }
}