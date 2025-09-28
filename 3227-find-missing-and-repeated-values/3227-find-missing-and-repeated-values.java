class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int ans[] = new int[2];
        int freq[] = new int[n*n+1];
        for(int x[] : grid)
        {
            for(int y : x)
            {
                freq[y]++;
            }
        }
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i] > 1)
                ans[0] = i;
            if(freq[i] == 0)
                ans[1] = i;
        }
        return ans;
    }
}