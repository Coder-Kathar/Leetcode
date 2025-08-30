class Solution {
    public static int[] rowCounter(int arr[])
    {
        int c0 = 0, c1 = 0;
        for(int x : arr)
        {
            if(x == 0)
                c0++;
            else
                c1++;
        }
        return new int[]{c0,c1};
    }
    public int[][] onesMinusZeros(int[][] grid) {
        Map<Integer,int[]> row = new HashMap<>();
        Map<Integer,int[]> col = new HashMap<>();
        int ind1 = 0;
        for(int[] x : grid)
        {
            int ans[] = rowCounter(x);
            row.put(ind1, ans);
            ind1++;
        }
        int ind2 = 0;
        for(int j=0;j<grid[0].length;j++)
        {
            int c0 = 0;
            int c1 = 0;
            for(int i=0;i<grid.length;i++)
            {
                if(grid[i][j] == 0)
                    c0++;
                else
                    c1++;
            }
            col.put(j,new int[]{c0,c1});
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp1[] = row.get(i);
                int temp2[] = col.get(j);
                diff[i][j] =  temp1[1] + temp2[1] - temp1[0] - temp2[0];
            }
        }
        return diff;
    }
}