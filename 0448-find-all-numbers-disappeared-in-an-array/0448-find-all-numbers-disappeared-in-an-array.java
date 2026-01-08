class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++)
        {
            freq[nums[i]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(freq[i] == 0)
            {
                arr.add(i);
            }
        }
        return arr;
    }
}