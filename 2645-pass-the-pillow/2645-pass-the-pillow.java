class Solution {
    public int passThePillow(int n, int time) {
        int arr[] = new int[n + n - 2];
        int val = 1;
        for(int i=0;i<n;i++)
        {
            arr[i] = val;
            val++;
        }
        val--;
        for(int i=n;i<arr.length;i++)
        {
            arr[i] = --val;
        }
        System.out.println(Arrays.toString(arr));
        return arr[time % arr.length];
    }
}