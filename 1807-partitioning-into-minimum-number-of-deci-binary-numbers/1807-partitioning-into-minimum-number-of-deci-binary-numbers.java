class Solution {
    public int minPartitions(String n) {
        int  l = 0;
        for(int i=9;i>0;i--)
        {
            if(n.contains(String.valueOf(i)))
            {
                l = i;
                break;
            }
        }
        return l;
    }
}