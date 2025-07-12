class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int maxlen = 0;
        while(j < s.length())
        {
            char c = s.charAt(j);
            if(!set.contains(c))
            {
                set.add(c);
                j++;
                maxlen = Math.max(maxlen, j-i);
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxlen;
    }
}