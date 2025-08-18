class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        while(n > 0)
        {
            int r = n-1;
            int prod = 1;
            while(r >= 0)
            {
                prod *= nums[r];
                if(prod < k)
                    count++;
                else if(prod > k)
                    break;
                r--;
            }
            n--;
        }
        return count;
    }
}