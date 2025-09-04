class Solution {
    public int findClosest(int x, int y, int z) {
        int xz = Math.abs(x-z);
        int yz = Math.abs(y-z);
        if(xz == yz)
            return 0;
        if(Math.min(xz,yz) == xz)
            return 1;
        else
            return 2;
    }
}