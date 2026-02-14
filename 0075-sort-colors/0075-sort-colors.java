class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        for(int x : nums)
        {
            if(x == 0)  c0++;
            if(x == 1)  c1++;
        }
        for(int i=0;i<c0;i++)
            nums[i] = 0;
        for(int i=c0;i<c0+c1;i++)
            nums[i] = 1;
        for(int i=c0+c1;i<nums.length;i++)
            nums[i] = 2;
    }
}