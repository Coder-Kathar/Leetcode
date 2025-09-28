class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            mindiff = Math.min(mindiff,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] - arr[i-1] == mindiff)
            {
                List<Integer> l = new ArrayList<>();
                l.add(arr[i-1]);
                l.add(arr[i]);
                ans.add(l);
            }
        }
        return ans;
    }
}