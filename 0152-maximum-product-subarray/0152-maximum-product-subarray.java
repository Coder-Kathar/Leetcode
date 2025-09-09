class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int lproduct = 1;
        int rproduct = 1;
        int max1 = nums[0];
        int max2 = nums[n-1];
        for(int i=0;i<n;i++)
        {
            lproduct *= nums[i];
            if(lproduct > max1)
                max1 = lproduct;
            if(lproduct == 0)
            {
                lproduct = 1;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            rproduct *= nums[i];
            if(rproduct > max2)
                max2 = rproduct;
            if(rproduct == 0)
            {
                rproduct = 1;
            }
        }
        return Math.max(max1,max2);
    }
}