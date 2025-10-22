class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;
        char c = s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(c != s.charAt(i))
            {
                count++;
                c = s.charAt(i);
            }
        }
        return count;
    }
}