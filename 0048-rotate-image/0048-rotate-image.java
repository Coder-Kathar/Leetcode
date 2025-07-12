class Solution {
    public static void reverse(int[] row)
    {
        // Reverse the array by array
        int st = 0;
        int end = row.length - 1;
        while(st<end)
        {
            int temp = row[st];
            row[st] = row[end];
            row[end] = temp;
            st++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        // Transpose the matrix
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] row : matrix)
        {
            reverse(row);
        }
    }
}