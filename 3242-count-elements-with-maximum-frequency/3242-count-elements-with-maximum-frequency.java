class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[] = new int[101];
        for(int x : nums)
            freq[x]++;
        int max = Integer.MIN_VALUE;
        for(int x : freq)
        {
            if(x > max)
                max = x;
        }
        int count = 0;
        if(max == 1)
        {
            return nums.length;
        }
        for(int i : freq)
        {
            if(i == max)
                count += i;
        }
        return count;
    }
}