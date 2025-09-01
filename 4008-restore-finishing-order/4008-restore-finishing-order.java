class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        List<Integer> f = new ArrayList<>();
        for(int x : friends)
            f.add(x);
        int ind = 0;
        for(int x : order)
        {
            if(f.contains(x))
                ans[ind++] = x;
        }
        return ans;
    }
}