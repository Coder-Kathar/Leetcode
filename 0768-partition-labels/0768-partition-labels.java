class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int st = 0;
        int end = 0;
        for(int i=0;i<s.length();i++)
        {
            end = Math.max(end, freq[s.charAt(i) - 'a']);
            if(end == i)
            {
                ans.add(end - st + 1);
                st = end + 1;
            }
        }
        return ans;
    }
}