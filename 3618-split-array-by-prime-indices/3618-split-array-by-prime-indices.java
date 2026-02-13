class Solution {
    public long splitArray(int[] nums) {
        long sumA = 0;
        long sumB = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(i))
                sumA += nums[i];
            else
                sumB += nums[i];
        }
        return Math.abs(sumA - sumB);
    }
    private boolean isPrime(int n)
    {
        if(n <= 1)
            return false;
        if(n == 2)  return true;
        if(n % 2 == 0)  return false;
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}