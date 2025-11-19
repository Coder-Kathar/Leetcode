class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();)
        {
            int stInd = i;
            int endInd = s.lastIndexOf(s.charAt(stInd));
            for(int j = stInd; j < endInd; j++)
            {
                int nextCharInd = s.lastIndexOf(s.charAt(j));
                endInd = Math.max(endInd, nextCharInd);
            }
            ans.add(endInd - stInd + 1);
            i = endInd + 1;
        }
        return ans;
    }
}