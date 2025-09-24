class Solution {
    public static int count_ones(int num)
    {
        int count = 0;
        while(num != 0)
        {
            if((num & 1) == 1)
                count++;
            num >>= 1;
        }
        return count;
    }
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0;i<ans.length;i++)
        {
            int count = count_ones(i);
            ans[i] = count;
        }
        return ans;
    }
}