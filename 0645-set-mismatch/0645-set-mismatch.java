class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans[] = new int[2];
        for(int x : nums)
        {
            if(set.contains(x))
            {
                ans[0] = x;
            }
            set.add(x);
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(!set.contains(i))
            {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}