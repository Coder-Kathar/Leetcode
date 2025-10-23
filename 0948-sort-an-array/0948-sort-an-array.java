class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
    private static void quickSort(int nums[], int low, int high)
    {
        if(low < high)
        {
            int pivotInd = partition(nums, low, high);
            quickSort(nums,low,pivotInd-1);
            quickSort(nums,pivotInd+1,high);
        }
    }
    private static int partition(int nums[], int low, int high)
    {
        int randInd = low + (int)(Math.random() * (high - low + 1));
        int pivot = nums[randInd];

        swap(nums,randInd,high);

        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(nums[j] < pivot)
            {
                i++;
                swap(nums,i,j);
            }
        }

        swap(nums,i+1,high);
        return i+1;
    }
    private static void swap(int nums[], int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}