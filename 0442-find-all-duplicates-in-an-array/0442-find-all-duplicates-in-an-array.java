class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            if(set.contains(x))
                ans.add(x);
            else
                set.add(x);
        }
        return ans;
    }
}