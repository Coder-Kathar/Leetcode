class Solution {
    public static String baseCon(int n, int k)
    {
        StringBuilder ans = new StringBuilder();
        while(n != 0)
        {
            ans.append(n%k);
            n/=k;
        }
        return ans.reverse().toString();
    }
    public static boolean isPali(String str)
    {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++)
        {
            String val = baseCon(n,i);
            if(!isPali(val))
                return false;
        }
        return true;
    }
}