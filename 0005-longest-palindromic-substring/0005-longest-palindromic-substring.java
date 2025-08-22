class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)
            return s;
        String ans = "";
        for(int i=1;i<s.length();i++)
        {
            int l = i;
            int r = i;
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
            l = i-1;
            r = i;
            while(s.charAt(l) == s.charAt(r))
            {
                l--;
                r++;
                if(l == -1 || r == s.length())
                    break;
            }
            pali = s.substring(l+1,r);
            if(pali.length() > ans.length())
                ans = pali;
        }
        return ans;
    }
}