class Solution {
    public static void swap(char[] ch, int st, int end)
    {
        while(st < end)
        {
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] ch = s.toCharArray();
        for(int i=0;i<n;i+=2*k)
        {
            swap(ch,i,Math.min(i+k-1,n-1));
        }
        return new String(ch);
    }
}