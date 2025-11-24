class Solution {
    public long sumAndMultiply(int n) {
        long shrink_num = shrink(n);
        long sum = sumOfn(shrink_num);
        long ans = shrink_num * sum;
        return ans;
    }
    private static long sumOfn(long n)
    {
        long sum = 0;
        while(n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    private static long shrink(int n)
    {
        long num = 0;
        while(n != 0)
        {
            int dig = n % 10;
            if(dig != 0)
                num = num * 10 + dig;
            n /= 10;
        }
        num = reverse(num);
        return num;
    }
    private static long reverse(long num)
    {
        long rev = 0;
        while(num != 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}