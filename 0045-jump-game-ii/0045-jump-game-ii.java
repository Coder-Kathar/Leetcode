class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int l = 0, r = 0;
        while(r < nums.length-1)
        {
            int farthest = 0; // To find the larget distance cover at one jump
            for(int i=l;i<=r;i++) // that's why ranging from L -> R
            {
                farthest = Math.max(farthest, i+nums[i]);
            }
            l = r + 1; // update the next interval first element
            r = farthest; // update the interval last element
            jumps++;
        }
        return jumps;
    }
}