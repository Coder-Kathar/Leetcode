class Solution {
    public static boolean isPrime(int n)
    {
        if(n == 1)  return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int firstind = -1;
        int lastind = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(nums[i]))
            {
                firstind = i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(isPrime(nums[i]))
            {
                lastind = i;
                break;
            }
        }
        return Math.abs(firstind - lastind);
    }
}