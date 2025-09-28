class Solution {
    public int maxDepth(String s) {
        int maxdepth = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                stack.push(c);
                maxdepth = Math.max(maxdepth, stack.size());
            }
            else if(c == ')')
            {
                stack.pop();
            }
        }
        return maxdepth;
    }
}