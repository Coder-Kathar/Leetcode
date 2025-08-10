class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans[] = new int[n-k+1];

        for(int i=0;i<n;i++)
        {
            if(i%k == 0)
                prefix[i] = nums[i];
            else
                prefix[i] = Math.max(nums[i],prefix[i-1]);
        }
        suffix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(i%k == k-1)
                suffix[i] = nums[i];
            else
                suffix[i] = Math.max(nums[i],suffix[i+1]);
        }

        for(int i=0;i<ans.length;i++)
        {
            ans[i] = Math.max(suffix[i],prefix[k+i-1]);
        }
        return ans;
    }
}