class Solution {
    public int numberOfChild(int n, int k) {
        int arr[] = new int[n + n - 2];
        int val = 0;
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
        return arr[k % arr.length];
    }
}