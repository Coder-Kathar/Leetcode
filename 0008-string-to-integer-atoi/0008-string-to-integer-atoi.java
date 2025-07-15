class Solution {
    public int myAtoi(String s) {
        long n = 0;
        s = s.trim();
        boolean neg = false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-')
                neg = true;
            else if (i == 0 && s.charAt(i) == '+')
                continue;
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                n = (n * 10) + (s.charAt(i) - '0');
            else
                break;
        
        if (neg) {
            if ((n * -1) < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

        } else {
            if (n > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        }
        return (int) (neg ? n * -1 : n);
    }
}