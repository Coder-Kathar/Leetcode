class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[] > a1 = new ArrayList<>();
        int n = intervals.length;
        int i=0;
        while(i<n && intervals[i][1] < newInterval[0])
        {
            a1.add(intervals[i]);
            i++;
        }
        while(i<n && newInterval[1] >= intervals[i][0])
        {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        a1.add(newInterval);
        while(i<n)
        {
            a1.add(intervals[i]);
            i++;
        }
        int[][] res = new int[a1.size()][2];
        for(i=0;i<a1.size();i++)
        {
            res[i] = a1.get(i);
        }
        return res;
    }
}