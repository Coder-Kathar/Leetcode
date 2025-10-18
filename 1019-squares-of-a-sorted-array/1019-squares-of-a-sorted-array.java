class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int pos = nums.length-1;
        int res[] = new int[nums.length];
        while(l <= r)
        {
            if(Math.abs(nums[l]) < Math.abs(nums[r]))
            {
                res[pos--] = nums[r] * nums[r];
                r--;
            }
            else
            {
                res[pos--] = nums[l] * nums[l];
                l++;
            }
        }
        return res;
    }
}