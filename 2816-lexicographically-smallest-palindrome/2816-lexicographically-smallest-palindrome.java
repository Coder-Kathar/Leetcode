class Solution {
    public String makeSmallestPalindrome(String s) {
        char ch[] = s.toCharArray();
        int i=0,j=ch.length-1;
        while(i < j)
        {
            if(ch[i] != ch[j])
            {
                char small = smallChar(ch[i],ch[j]);
                ch[i] = small;
                ch[j] = small;
            }
            i++;
            j--;
        }
        return new String(ch);
    }
    private static char smallChar(char a, char b)
    {
        return (a < b) ? a : b;
    }
}