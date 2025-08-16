class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x, map.getOrDefault(x,0)+1);
        for(int x : map.keySet())
        {
            if(map.get(x) > 1)
                ans.add(x);
        }
        return ans;
    }
}