class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> full = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        full.add(first);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev = full.get(i-1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++)
            {
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            full.add(curr);
        }
        return full;
    }
}