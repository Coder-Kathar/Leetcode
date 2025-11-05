class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while(n > 1)
        {
            Arrays.sort(stones);
            int f = stones[n-1];
            int s = stones[n-2];
            if(f == s)
            {
                n = n-2;
            }
            else
            {
                stones[n-2] = f-s;
                n-=1;
            }
        }
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return stones[0];
        }
    }
}