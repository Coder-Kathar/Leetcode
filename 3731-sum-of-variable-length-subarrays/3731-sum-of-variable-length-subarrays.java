class Solution {
    public int subarraySum(int[] nums) {
        int total = 0;
        int start = 0;
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;
            start = Math.max(0,i-nums[i]);
            for(int j=start;j<=i;j++)
            {
                sum += nums[j];
            }
            total += sum;
        }
        return total;
    }
}