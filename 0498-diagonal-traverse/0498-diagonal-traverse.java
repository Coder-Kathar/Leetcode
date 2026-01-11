class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int ind = 0;
        int row = 0;
        int col = 0;
        String dir = "UP";
        while(row < m && col < n)
        {
            res[ind++] = mat[row][col];
            if(dir.equals("UP"))
            {
                if(col == n - 1)
                {
                    row += 1;
                    dir = "DOWN";
                }
                else if(row == 0)
                {
                    col += 1;
                    dir = "DOWN";
                }
                else
                {
                    row -= 1;
                    col += 1;
                }
            }
            else
            {
                if(row == m - 1)
                {
                    col += 1;
                    dir = "UP";
                }
                else if(col == 0)
                {
                    row += 1;
                    dir = "UP";
                }
                else
                {
                    row += 1;
                    col -= 1;
                }
            }
        }
        return res;
    }
}