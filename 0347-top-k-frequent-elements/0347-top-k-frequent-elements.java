class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i : nums)
        {
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        int ind = 0;
        while(k != 0)
        {
            int max = 0;
            int val = 0;
            for(int i : hmap.keySet())
            {
                if(hmap.get(i) > max)
                {
                    max = hmap.get(i);
                    val = i;
                }
            }
            ans[ind++] = val;
            hmap.remove(val);
            k--;
        }
        return ans;
    }
}