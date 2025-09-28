class Solution {
    public int maxDepth(String s) {
        int maxdepth = 0;
        int curr = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                curr++;
                maxdepth = Math.max(maxdepth, curr);
            }
            else if(c == ')')
            {
                curr--;
            }
        }
        return maxdepth;
    }
}