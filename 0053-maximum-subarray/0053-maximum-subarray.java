class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for(int x : nums)
        {
            if( (cursum + x) < x)
            {
                cursum = x;
            }   
            else
            {
                cursum = cursum + x;
            }
            if(cursum > maxsum)
                maxsum = cursum;
        }
        return maxsum; 
    }
}