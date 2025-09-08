class Solution {
    public static boolean haveZero(int a, int b)
    {
        while(a != 0)
        {
            if(a%10 == 0)
                return false;
            a /= 10;
        }
        while(b != 0)
        {
            if(b%10 == 0)
                return false;
            b /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int ans[] = new int[2];
        for(int i=1;i<n;i++)
        {
            if(haveZero(i,n-i))
            {
                ans[0] = i;
                ans[1] = n-i;
                return ans;
            }
        }
        return new int[0];
    }
}