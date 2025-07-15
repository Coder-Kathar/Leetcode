class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int x : candies)
        {
            if(x > max)
                max = x;
        }
        for(int x : candies)
        {
            ans.add((x+extraCandies) >= max);
        }
        return ans;
    }
}