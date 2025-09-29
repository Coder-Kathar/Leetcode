class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];
        for(int i : nums1)  arr1[i]++;
        for(int i : nums2)  arr2[i]++;

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] > 0 && arr2[i] > 0)
            {
                int min = Math.min(arr1[i], arr2[i]);
                for(int j =0;j<min;j++)
                    list.add(i);
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}