class Solution {
    public int countPoints(String rings) {
        boolean[][] freq = new boolean[10][3];
        for(int i=0;i<rings.length();i+=2)
        {
            int ind = (rings.charAt(i+1)) - '0';
            char c = rings.charAt(i);
            switch(c)
            {
                case 'R':
                    freq[ind][0] = true;
                    break;
                case 'G':
                    freq[ind][1] = true;
                    break;
                default:
                    freq[ind][2] = true;
            }
        }
        int count = 0;
        for(boolean[] x : freq)
        {
            if(isAllTrue(x))
                count++;
        }
        return count;
    }
    private static boolean isAllTrue(boolean[] x)
        {
            return x[0] && x[1] && x[2];
        }
}