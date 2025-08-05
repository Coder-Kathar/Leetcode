class Solution {
    public String convertToBase7(int num) {
        int temp = Math.abs(num);
        if(num == 0)
            return "0";
        StringBuilder ans = new StringBuilder();
        while(temp != 0)
        {
            ans.append(temp % 7);
            temp /= 7;
        }
        if(num > 0)
            return ans.reverse().toString(); 
        else
            return "-"+ (ans.reverse().toString());
    }
}