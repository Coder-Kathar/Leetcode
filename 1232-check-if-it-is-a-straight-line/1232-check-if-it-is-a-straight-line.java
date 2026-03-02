class Solution {
    public boolean checkStraightLine(int[][] coor) {
        int x1 = coor[0][0];
        int y1 = coor[0][1];
        int x2 = coor[1][0];
        int y2 = coor[1][1];

        for(int i=2;i<coor.length;i++)
        {
            int x3 = coor[i][0];
            int y3 = coor[i][1];
            if(((y2-y1)*(x3-x1)) != ((y3-y1)*(x2-x1)))
                return false;
        }
        return true;
    }
}