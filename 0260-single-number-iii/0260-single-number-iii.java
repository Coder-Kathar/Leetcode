class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
            map.put(x,map.getOrDefault(x,0)+1);
        int ans[] = new int[2];
        int ind = 0;
        for(int x : map.keySet())
        {
            if(map.get(x) == 1)
                ans[ind++] = x;
        }
        return ans;
    }
}