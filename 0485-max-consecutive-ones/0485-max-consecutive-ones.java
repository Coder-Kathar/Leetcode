class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for(int x : nums)
        {
            if(x == 1)
            {
                count++;
                if(count > maxcount)
                    maxcount = count; 
            }  
            else    count = 0;
        }
        return maxcount;
    }
}