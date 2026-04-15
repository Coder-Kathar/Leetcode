class Solution {
    public int countPoints(String rings) {
        StringBuilder[] sb = new StringBuilder[10];
        for (int i = 0; i < 10; i++)
        {
            sb[i] = new StringBuilder();
        }
        for(int i=0;i<rings.length();i+=2)
        {
            int ind = (rings.charAt(i+1))-'0';
            sb[ind].append(rings.charAt(i));
        }
        int count = 0;
        for(StringBuilder x : sb)
        {
            if(x.length() > 2 && unique(x) == 3)
                count++;
        }
        return count;
    }
    private static int unique(StringBuilder x)
    {
        Set<Character> s = new HashSet<>();
        for(int i=0;i<x.length();i++)
            s.add(x.charAt(i));
        return s.size();
    }
}