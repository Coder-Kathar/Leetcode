class Solution {
    public int repeatedNTimes(int[] nums) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x, map.getOrDefault(x,0)+1);
            if(map.get(x) > 1)
            {
                ans = x;
                break;
            }        
        }
        return ans;
    }
}