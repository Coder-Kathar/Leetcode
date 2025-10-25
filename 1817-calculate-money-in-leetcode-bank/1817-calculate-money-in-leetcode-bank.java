class Solution {
    public int totalMoney(int n) {
        if(n <= 7)
            return conSum(n);
        int sum = 0;
        int i = 0;
        int stable = 7;
        while(n > 0)
        {
            if(n >= 7)
            {
                sum = sum + conSum(stable+i) - conSum(i);
            }
            else
            {
                sum = sum + conSum(n+i) - conSum(i);
            }
            i++;
            n = n - 7;
        }
        return sum;
    }
    private static int conSum(int n)
    {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
}