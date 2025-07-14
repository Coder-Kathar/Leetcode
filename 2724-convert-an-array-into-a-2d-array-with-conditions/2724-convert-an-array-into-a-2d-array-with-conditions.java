class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int freq[] = new int[nums.length+1];
        for(int x : nums)
            freq[x]++;
        int maxrun = Integer.MIN_VALUE;
        for(int x : freq)
            maxrun = Math.max(maxrun,x);
        while(maxrun > 0)
        {
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<freq.length;i++)
            {
                if(freq[i] > 0)
                {
                    l.add(i);
                    freq[i]--;
                }
            }
            ans.add(l);
            maxrun--;
        }
        return ans;
    }
}