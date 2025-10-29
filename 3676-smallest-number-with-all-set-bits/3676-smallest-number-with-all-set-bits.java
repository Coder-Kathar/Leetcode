class Solution {
    public int smallestNumber(int n) {
        int i=n;
        while(true)
        {
            if(isSetBit(i))
                return i;
            i++;
        }
        // return 0;
    }
    private static boolean isSetBit(int n)
    {
        while(n != 0)
        {
            if((n&1) == 0)
                return false;
            n >>= 1;
        }
        return true;
    }
}