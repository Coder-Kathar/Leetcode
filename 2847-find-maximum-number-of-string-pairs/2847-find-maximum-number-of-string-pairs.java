class Solution {
    public static String reverse(String x)
    {
        StringBuilder ans = new StringBuilder(x);
        return ans.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Map<String,String> map = new HashMap<>();
        for(String x : words)
        {
            String ans = reverse(x);
            if(!x.equals(ans))
                map.put(x,ans);
        }
        for(String y : words)
        {
            if(map.containsValue(y))
                count++;
        }
        return count/2;
    }
}