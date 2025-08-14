class Solution {
    public int countGoodSubstrings(String s) {
        int k = 3;
        int count = 0;
        for(int i=0;i<s.length()-k+1;i++)
        {
            Set<Character> set = new HashSet<>();
            for(int j=i;j<i+k;j++)
            {
                set.add(s.charAt(j));
            }
            if(set.size() == 3)
                count++;
        }
        return count;
    }
}