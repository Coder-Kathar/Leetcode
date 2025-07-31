class Solution {
    public static int minimumVal(int nums[])
    {
        int small = Integer.MAX_VALUE;
        for(int x : nums)
        {
            if(x != 0 && x < small)
                small = x;
        }
        return small;
    }
    public int minimumOperations(int[] nums) {
        int count = 0;
        while(true)
        {
            int val = minimumVal(nums);
            if(val == Integer.MAX_VALUE)
                break;
            int arr[] = nums;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] > 0)
                    arr[i] -= val;
            }
            count++;
            nums = arr;
        }
        return count;
    }
}