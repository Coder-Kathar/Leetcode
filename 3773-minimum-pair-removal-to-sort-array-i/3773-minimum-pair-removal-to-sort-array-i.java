class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int x : nums)
            list.add(x);

        int count = 0;
        while(!isSorted(list))
        {
            int minSum = Integer.MAX_VALUE;
            int minInd = -1;
            for(int i=0;i<list.size()-1;i++)
            {
                int sum = list.get(i) + list.get(i+1);
                if(sum < minSum)
                {
                    minSum = sum;
                    minInd = i;
                }

            }
            list.set(minInd, minSum);
            list.remove(minInd+1);
            count++;
        }
        return count;
    }
    private boolean isSorted(List<Integer> list)
    {
        int n = list.size();
        for(int i=0;i<n-1;i++)
        {
            if(list.get(i) > list.get(i+1))
                return false;
        }
        return true;
    }
}