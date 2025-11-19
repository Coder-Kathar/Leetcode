class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> l = new ArrayList<>();
        for(int x : nums)
            l.add(x);
        while(l.contains(original))
        {
            original *= 2;
        }
        return original;
    }
}