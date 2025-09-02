class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        int sum = 0;
        for(int i=1;i<prefix.length;i++)
        {
            sum += gain[i-1];
            prefix[i] = sum;
        }
        int max = Integer.MIN_VALUE;
        for(int x : prefix)
        {
            if(x > max)
                max = x;
        }
        return max;
    }
}