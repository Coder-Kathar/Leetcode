class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c >= '0' && c <= '9')
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
        {
            ans.append(stack.pop());
        }
        ans.reverse();
        return new String(ans);
    }
}