class Solution {
    private static boolean isPali(String x)
    {
        int i=0;
        int j=x.length()-1;
        while(i < j)
        {
            if(x.charAt(i) != x.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String x : words)
        {
            if(isPali(x))
            {
                return x;
            }
        }
        return "";
    }
}