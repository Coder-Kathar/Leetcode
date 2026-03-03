class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return count(m,n,dp);
    }
    public int count(int r, int c, int[][] dp)
    {
        if(r == 1 || c == 1)
            return 1;
        if(dp[r][c] != 0)
            return dp[r][c];
        dp[r][c] = count(r-1,c,dp) + count(r,c-1,dp);
        return dp[r][c];
    }
}