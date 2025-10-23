class Solution {
    public boolean hasSameDigits(String s) {
        return fun(s);
    }
    private static boolean fun(String s)
    {
        if(s.length() == 2)
        {
            if(s.charAt(0) == s.charAt(1))
                return true;
            else
                return false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length()-1;i++)
        {
            int val1 = s.charAt(i) -'0';
            int val2 = s.charAt(i+1) -'0';
            sb.append((val1 + val2) % 10);
        }
        return fun(sb.toString());
    }
}