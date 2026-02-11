class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            reverse(matrix,i,n);
        }
    }
    private static void reverse(int[][] arr, int r, int n)
    {
        int i=0,j=n-1;
        while(i < j)
        {
            int temp = arr[r][i];
            arr[r][i] = arr[r][j];
            arr[r][j] = temp;
            i++;
            j--;
        }
    }
}