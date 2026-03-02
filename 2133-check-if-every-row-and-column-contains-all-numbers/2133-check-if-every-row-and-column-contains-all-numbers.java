class Solution {
    public boolean checkValid(int[][] matrix) {
        boolean flag1,flag2;
        for(int[] x : matrix)
        {
            flag1 = checkRow(x);
            if(!flag1)
                return false;
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            flag2 = checkCol(matrix,j);
            if(!flag2)
                return false;
        }
        return true;
    }
    private static boolean checkCol(int[][] mat, int col)
    {
        int n = mat.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(mat[i][col] > n)
                return false;
            set.add(mat[i][col]);
        }
        return set.size() == n;
    }
    private static boolean checkRow(int[] arr)
    {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int x : arr)
        {
            if(x > n)   return false;
            set.add(x);
        }
        return set.size() == n;
    }
}