class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> winOnly = new ArrayList<>();
        List<Integer> OneLose = new ArrayList<>();
        int arr1[] = new int[100001]; 
        int arr2[] = new int[100001];
        for(int i=0;i<matches.length;i++)
        {
            arr1[matches[i][0]]++;
        }
        for(int i=0;i<matches.length;i++)
        {
            arr2[matches[i][1]]++;
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] >=1 && arr2[i] == 0)
                winOnly.add(i);
            if(arr2[i] == 1)
                OneLose.add(i);
        } 
        res.add(winOnly);
        res.add(OneLose);
        return res;
    }
}