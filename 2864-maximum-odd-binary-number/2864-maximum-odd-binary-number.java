class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int count = 0;
        char[] c = new char[n];
        Arrays.fill(c,'0');
        for(char x : s.toCharArray())
        {
            if(x=='1')  count++;
        }
        if(count == 1)
        {
            c[n-1]='1';
            return new String(c);
        }
        c[n-1]='1';
        count-=1;
        int ind = 0;
        while(count > 0)
        {
            c[ind++] = '1';
            count--;
        }
        return new String(c);
    }
}