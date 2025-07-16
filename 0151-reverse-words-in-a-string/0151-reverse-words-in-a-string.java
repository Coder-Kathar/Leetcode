class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        String[] str = s.split("\\s+");
        for(String x : str)
        {
            ans.insert(0,x);
            ans.insert(0," ");
        }
        return ans.toString().trim();
    }
}