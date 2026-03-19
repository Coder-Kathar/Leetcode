class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = nums[0];
        int max = nums[0];
        for(int x : nums)
        {
            min = Math.min(min,x);
            max = Math.max(max,x);
            set.add(x);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
}