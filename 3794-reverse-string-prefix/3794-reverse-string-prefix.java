class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1)
            return s;
        return reverse(s,k);
    }
    private static String reverse(String s, int k)
    {
        char[] c = s.toCharArray();
        int left = 0;
        int right = k-1;
        while(left < right)
        {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
        return new String(c);
    }
}