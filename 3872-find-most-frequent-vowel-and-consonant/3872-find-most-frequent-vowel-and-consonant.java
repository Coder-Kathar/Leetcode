class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        for(char c : s.toCharArray())
            freq[c - 'a']++;
        int maxVow = 0, maxCon = 0;
        for(int i=0;i<26;i++)
        {
            char c = (char) (i+'a');
            if("aeiou".indexOf(c) >= 0)
                maxVow = Math.max(maxVow,freq[c-'a']);
            else
                maxCon = Math.max(maxCon,freq[c-'a']);
        }
        return maxVow + maxCon;
    }
}