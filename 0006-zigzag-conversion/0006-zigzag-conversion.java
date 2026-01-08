class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows)
            return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<rows.length;i++)
        {
            rows[i] = new StringBuilder();
        }
        int r = 0;
        int dir = 1; // 1 -> Down & -1 -> Up
        for(char c : s.toCharArray())
        {
            rows[r].append(c);
            if(r == 0)
            {
                dir = 1;
            }
            else if(r == numRows - 1)
            {
                dir = -1;
            }
            r += dir;
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder x : rows)
        {
            ans.append(x);
        }
        return ans.toString();
    }
}