class Solution {
    public String replaceDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                int val = s.charAt(i) -'0';
                int chval = s.charAt(i-1) - 'a';
                char ch =(char) ((chval + val % 26) + 'a');
                ans.append(ch);
            }
            else
            {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}