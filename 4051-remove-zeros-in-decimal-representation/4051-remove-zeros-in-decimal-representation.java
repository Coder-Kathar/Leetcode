class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        String ans = "";
        for(char c : s.toCharArray())
            {
                if(c != '0')
                    ans+=c;
            }
        return Long.parseLong(ans);
    }
}