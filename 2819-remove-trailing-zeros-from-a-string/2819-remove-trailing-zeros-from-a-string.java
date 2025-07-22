class Solution {
    public String removeTrailingZeros(String num) {
        int i=0;
        int j = num.length()-1;
        String ans = "";
        while(j >= i)
        {
            char c = num.charAt(j);
            if(c == '0')
                j--;
            else
            {
                ans = num.substring(i,j+1);
                break;
            }
        }
        return ans;
    }
}