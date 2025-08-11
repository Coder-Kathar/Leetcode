class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int x : nums)
        {
            if(x > 0)
                pos.add(x);
            else
                neg.add(x);
        }
        int ans[] = new int[nums.length];
        int i = 0, j = 0, ind = 0;
        while(i < pos.size() && j < neg.size())
        {
            ans[ind++] = pos.get(i++);
            ans[ind++] = neg.get(j++);
        }
        while(i < pos.size())
            ans[ind++] = pos.get(i++);
        while(j < neg.size())
            ans[ind++] = neg.get(j++);
        return ans;
    }
}