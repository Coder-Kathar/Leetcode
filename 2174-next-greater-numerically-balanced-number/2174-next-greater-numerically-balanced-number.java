class Solution {
    public int nextBeautifulNumber(int n) {
        int ans = n+1;
        while(true)
        {
            if(isEqual(ans))
                break;
            ans++;
        }
        return ans;
    }
    private static boolean isEqual(int num)
    {
        int digits[] = new int[10];
        while(num != 0)
        {
            digits[num%10]++;
            if(digits[num%10] > (num%10))
                return false;
            num /= 10;
        }
        for(int i=0;i<digits.length;i++)
        {
            if(digits[i] > 0 && digits[i] != i)
                return false;
        }
        return true;
    }
}