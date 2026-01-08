class Solution {
    public int repeatedNTimes(int[] nums) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(Integer x : map.keySet())
        {
            if(map.get(x) == nums.length / 2)
            {
                ans = x;
                break;
            }
        }
        return ans;
    }
}