class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int x : nums)
        {
            if(x > 0)
            {
                ans[pos] = x;
                pos += 2;
            }
            else
            {
                ans[neg] = x;
                neg += 2;
            }
        }
        return ans;
    }
}