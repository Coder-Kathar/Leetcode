class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k == 0)
            return new int[code.length];
        int n = code.length;
        int ans[] = new int[n];
        if(k > 0)
        {
            for(int i=0;i<n;i++)
            {
                int sum = 0;
                for(int j=i+1;j<k+i+1;j++)
                {
                    sum += code[j%n];
                }
                ans[i] = sum;
            }
        }
        if(k < 0)
        {
            for(int i=n-1;i>=0;i--)
            {
                int sum = 0;
                for(int j=1;j<=k*-1;j++)
                {
                    int ind = (i - j + n) % n;
                    sum += code[ind];
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}