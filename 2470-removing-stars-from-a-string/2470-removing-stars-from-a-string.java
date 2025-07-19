class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '*')
                stack.pop();
            else
                stack.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        for(Character c : stack)
            ans.append(c);
        return ans.toString();
    }
}