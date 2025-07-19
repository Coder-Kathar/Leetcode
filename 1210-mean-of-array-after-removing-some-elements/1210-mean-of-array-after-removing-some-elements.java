class Solution {
    public double trimMean(int[] arr) {
        int times = (int) (arr.length * 0.05);
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int x : arr)
            list.add(x);
        for(int i=0;i<times;i++)
        {
            list.remove(0);
            list.remove(list.size()-1);
        }
        int sum = 0;
        for(Integer x : list)
            sum += x;
        return (double)sum / list.size();
    }
}