class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;
        int j = 0;
        while(j < s.length())
        {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.get(c) > 2)
            {
                char leftch = s.charAt(i);
                map.put(leftch, map.get(leftch) - 1);
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}