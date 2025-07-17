class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            int n = nums[i];
            while(n != 0)
            {
                l.add(n%10);
                n /= 10;
            }
        }
        int ans[] = new int[l.size()];
        int ind = 0;
        for(int i = l.size()-1;i>=0;i--)
        {
            ans[ind++] = l.get(i);
        }
        return ans;
    }
}