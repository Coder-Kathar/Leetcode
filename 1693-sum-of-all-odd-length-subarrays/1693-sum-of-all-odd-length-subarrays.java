class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int win = arr.length;
        if(win % 2 == 0)
            win--;
        int totalSum = 0;
        while(win > 0)
        {
            for(int i=0;i<arr.length-win+1;i++)
            {
                int sum = 0;
                for(int j=i;j<i+win;j++)
                {
                    sum += arr[j];
                }
                totalSum += sum;
            }
            win -= 2;
        }
        return totalSum;
    }
}