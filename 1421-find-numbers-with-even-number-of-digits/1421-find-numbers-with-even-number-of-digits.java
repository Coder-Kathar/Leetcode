class Solution {
    public static boolean digcount(int x)
    {
        int dig = 0;
        while(x != 0)
        {
            dig++;
            x/=10;
        }
        return (dig%2==0);
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int x : nums)
        {
            if(digcount(x)) count++;
        }
        return count;
    }
}