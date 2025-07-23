class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row : grid)
        {
            for(int val : row)
            {
                if(val < 0)     count++;
            }
        }
        return count;
    }
}