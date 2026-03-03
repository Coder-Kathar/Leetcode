class Solution {
    public char findKthBit(int n, int k) {
        String[] store = new String[n];
        store[0] = "0";
        for(int i=1;i<n;i++)
        {
            StringBuilder ans = new StringBuilder(store[i-1]);
            ans.append("1");
            ans.append(reverse(invert(store[i-1])));
            store[i] = ans.toString();
        }
        return store[n-1].charAt(k-1);
    }
    private static String invert(String x)
    {
        StringBuilder ans = new StringBuilder();
        for(char c : x.toCharArray())
        {
            if(c == '0')
                ans.append('1');
            else
                ans.append('0');
        }
        return ans.toString();
    }
    private static String reverse(String x)
    {
        StringBuilder ans = new StringBuilder(x);
        ans.reverse();
        return ans.toString();
    }
}