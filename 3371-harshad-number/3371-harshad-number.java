class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int dsum = digSum(x);
        return x % dsum == 0 ? dsum : -1;    
    }
    private static int digSum(int x)
    {
        int sum = 0;
        while(x != 0)
        {
            sum += (x % 10);
            x /= 10;
        }
        return sum;
    }
}