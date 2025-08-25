class Solution {
    static HashMap<Integer,String> map = new HashMap<>();
    static
    {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        fun("",digits,ans);
        return ans;
    }
    public static void fun(String p, String up, List<String> ans)
    {
        if(up.isEmpty())
        {
            ans.add(p);
            return;
        }
        int dig = up.charAt(0) - '0';
        String str = map.get(dig);
        for(char ch : str.toCharArray())
        {
            fun(p+ch,up.substring(1),ans);
        }
    }
}