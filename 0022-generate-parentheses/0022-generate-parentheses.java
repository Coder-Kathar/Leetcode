class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        generate(0,0,n,"");
        return res;
    }
    public void generate(int open, int close, int n, String ans)
    {
        if(ans.length() == n*2)
        {
            res.add(ans);
            return;
        }
        if(open < n)
        {
            generate(open+1, close, n, ans+"(");
        }
        if(close < open)
        {
            generate(open, close+1, n, ans+")");
        }
    }
}