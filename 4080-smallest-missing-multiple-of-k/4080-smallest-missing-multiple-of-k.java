class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        for(int x : nums)
            {
                if(x % k == 0)
                    l.add(x);
            }
        int i=k;
        while(true)
            {
                if(!l.contains(i))
                    break;
                i += k;
            }
        return i;
    }
}