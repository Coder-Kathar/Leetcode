class Solution {
    public String largestGoodInteger(String num) {
        char max = ' ';
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2))
            {
                char c = num.charAt(i);
                if(c > max)
                    max = c;
            }
        }
        StringBuilder ans = new StringBuilder();
        ans.append(max).append(max).append(max);
        return max == ' ' ? "" : ans.toString();
    }
}