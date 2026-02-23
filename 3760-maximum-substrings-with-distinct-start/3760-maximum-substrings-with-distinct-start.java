class Solution {
    public int maxDistinct(String s) {
        boolean[] freq = new boolean[26];
        int count = 0;
        for(char c : s.toCharArray())
        {
            if(!freq[c-'a'])
            {
                freq[c-'a'] = true;
                count++;
            }
        }
        return count;
    }
}