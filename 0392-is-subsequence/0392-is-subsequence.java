class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(""))
            return true;
        if(s.length() > t.length())
            return false;
        int i=0;
        int j=0;
        while(i < t.length())
        {
            if(t.charAt(i) == s.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
            if(j == s.length())
                return true;
        }
        return false;
    }
}