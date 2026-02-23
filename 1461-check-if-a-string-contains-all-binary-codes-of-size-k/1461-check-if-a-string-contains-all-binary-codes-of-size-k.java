class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            String val = s.substring(i,i+k);
            set.add(val);
        }
        return set.size() == (int) (Math.pow(2,k));
    }
}