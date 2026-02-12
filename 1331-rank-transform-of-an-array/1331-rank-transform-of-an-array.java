class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr2[] = arr.clone();
        Arrays.sort(arr2);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int x : arr2)
        {
            if(!map.containsKey(x))
                map.put(x,rank++);
        }
        int ans[] = new int[arr.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}