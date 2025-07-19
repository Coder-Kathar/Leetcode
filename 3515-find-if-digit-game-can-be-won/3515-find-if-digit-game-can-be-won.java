class Solution {
    public boolean canAliceWin(int[] nums) {
        boolean ans1 = false;
        boolean ans2 = false;
        int sum = 0;
        for(int x : nums)
            sum += x;
        int single_sum = 0;
        for(int x : nums)
        {
            if(x < 10)
                single_sum  += x;
        }
        ans1 = single_sum > (sum - single_sum);
        ans2 = (sum - single_sum) > single_sum;
        return ans1 || ans2;
    }
}