class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    public static void backtrack(List<List<Integer>> ans, List<Integer> l, int nums[], int st)
    {
        ans.add(new ArrayList<>(l));
        for(int i=st;i<nums.length;i++)
        {
            l.add(nums[i]);
            backtrack(ans, l, nums, i+1);
            l.remove(l.size()-1);
        }
    }
}