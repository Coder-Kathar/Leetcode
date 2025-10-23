class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(isOperator(tokens[i]))
            {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int ans = operation(num1,num2,tokens[i]);
                stack.push(ans);
            }
            else
            {
                int num = Integer.parseInt(tokens[i]);
                stack.push(num);
            }
        }
        return stack.peek();
    }
    private static int operation(int num1, int num2, String x)
    {
        int ans = 0;
        switch(x)
        {
            case "+":
                ans = num1 + num2;
                break;
            case "-":
                ans = num1 - num2;
                break;
            case "*":
                ans = num1 * num2;
                break;
            case "/":
                ans = num1 / num2;
                break;
        }
        return ans;
    }
    private static boolean isOperator(String x)
    {
        switch(x)
        {
            case "+":
                return true;
            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
        }
        return false;
    }
}