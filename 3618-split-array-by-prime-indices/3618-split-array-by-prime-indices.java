class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        boolean[] isPrime = new boolean[n];
        if(n > 2)
        {
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for(int i=2;i*i<n;i++)
            {
                if(isPrime[i])
                {
                    for(int j=i*i;j<n;j+=i)
                        isPrime[j] = false;
                }
            }
        }
        long sumA = 0;
        long sumB = 0;
        for(int i=0;i<n;i++)
        {
            if(isPrime[i])  sumA += nums[i];
            else    sumB += nums[i];
        }
        return Math.abs(sumA - sumB);
    }
}