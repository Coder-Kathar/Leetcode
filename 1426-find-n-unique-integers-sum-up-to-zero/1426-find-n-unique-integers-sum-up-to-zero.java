class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        if(n == 1)
            return ans;
        int val = 1; 
        for(int i=0;i<n/2;i++)
        {
            ans[i] = val * -1;
            ans[n-i-1] = val;
            val++;
        }
        return ans;
    }
}