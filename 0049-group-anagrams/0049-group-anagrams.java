class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            String freqStr = getFreqStr(s);
            if(map.containsKey(freqStr))
            {
                map.get(freqStr).add(s);
            }
            else
            {
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(freqStr,l);
            }
        }
        return new ArrayList<>(map.values());
    }
    private static String getFreqStr(String s)
    {
        int[] freq = new int[26];
        for(char c : s.toCharArray())
        {
            freq[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        char ch = 'a';
        for(int x : freq)
        {
            ans.append(ch);
            ans.append(x);
            ch++;
        }
        return ans.toString();
    }
}