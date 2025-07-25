class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split("\\s+");
        String[] str_arr = new String[arr.length];
        for(String x : arr)
        {
            int ind = x.charAt(x.length()-1) - '0';
            str_arr[ind-1] = x.substring(0,x.length()-1);
        }
        StringBuilder ans = new StringBuilder();
        for(String y : str_arr)
        {
            ans.append(y).append(" ");
        }
        return ans.toString().trim();
    }
}