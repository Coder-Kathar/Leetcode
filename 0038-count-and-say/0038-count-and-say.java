class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i=1;i<n;i++)
        {
            res = fun(res);
        }
        return res;
    }
    private static String fun(String res)
    {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<res.length();i++)
        {
            if(res.charAt(i) == res.charAt(i-1))
            {
                count++;
            }
            else
            {
                sb.append(count).append(res.charAt(i-1));
                count = 1;
            }
        }
        sb.append(count).append(res.charAt(res.length()-1));
        return sb.toString();
    }
}