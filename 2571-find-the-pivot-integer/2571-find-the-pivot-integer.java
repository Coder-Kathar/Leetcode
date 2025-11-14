class Solution {
    public int pivotInteger(int n) {
        int val = (int) Math.sqrt((n * (n+1)) / 2);
        return val * val == (n*(n+1))/2 ? val : -1;
    }
}