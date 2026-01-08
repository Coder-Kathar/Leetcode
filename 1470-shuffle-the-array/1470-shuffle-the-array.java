class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        int ind = 0;
        int start = 0;
        int end = nums.length / 2;
        while(start < n || end < nums.length)
        {
            if(ind % 2 == 0)
            {
                arr[ind++] = nums[start];
                start++;
            }
            else
            {
                arr[ind++] = nums[end];
                end++;
            }
        }
        return arr;
    }
}