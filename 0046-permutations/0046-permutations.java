class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }
    public static void backtrack(List<List<Integer>> ans, List<Integer> l, int nums[])
    {
        if(nums.length == l.size())
        {
            ans.add(new ArrayList(l));
            return;
        }
        for(int num : nums)
        {
            if(l.contains(num))
                continue;
            l.add(num);
            backtrack(ans, l, nums);
            l.remove(l.size()-1);
        }
    }
}