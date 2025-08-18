class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, count = 0;
        int prod = 1;
        for(int right = 0; right < nums.length;right++)
        {
            prod *= nums[right];
            while(prod >= k && left <= right)
            {
                prod /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}