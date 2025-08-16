class Solution {
    public int findClosestNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums)
        {
            map.put(x, Math.abs(x));
        }
        ArrayList<Integer> l = new ArrayList<>();
        int mindist = Integer.MAX_VALUE;
        for(int x : map.keySet())
        {
            if(map.get(x) < mindist)
                mindist = map.get(x);
        }
        for(int x : map.keySet())
        {
            if(map.get(x) == mindist)
            {
                l.add(x);
            }
        }
        return Collections.max(l);
    }
}