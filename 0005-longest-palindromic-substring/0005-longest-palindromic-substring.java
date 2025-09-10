class Solution {
    private String check(String s, String ans, int l, int r)
    {
        while(s.charAt(l) == s.charAt(r))
        {
            l--;
            r++;
            if(l == -1 || r == s.length())
                break;
        }
        String pali = s.substring(l+1,r);
        if(pali.length() > ans.length())
            ans = pali;
        return ans;
    }
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        String ans = "";
        for(int i=1;i<s.length();i++)
        {
            ans = check(s,ans,i,i);
            ans = check(s,ans,i-1,i);
        }
        return ans;
    }
}