class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        String[] arr = s.split("\\|");
        for(int i=0;i<arr.length;i+=2)
        {
            count += astricCount(arr[i]);
        }
        return count;
    }
    private static int astricCount(String x)
    {
        int count = 0;
        for(char c : x.toCharArray())
        {
            if(c == '*')
                count++;
        }
        return count;
    }
}