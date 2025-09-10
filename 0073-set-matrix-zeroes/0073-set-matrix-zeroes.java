class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> q = new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j] == 0)
                {
                    q.add(i);
                    q.add(j);
                }
            }
        }
        for(int i=0;i<q.size();i+=2)
        {
            doZero(matrix,q.get(i),q.get(i+1));
        }
    }
    void doZero(int[][] matrix, int r, int c)
    {
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[r][i] = 0;
        }
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][c] = 0;
        }
    }
}