class Solution {
    public int maxProduct(int n) {
        int pro = 1;
        int count = 2;
        int freq[] = new int[10];
        while(n != 0)
        {
            freq[n%10]++;
            n /= 10;
        }
        for(int i=freq.length - 1; i >= 0;i--)
        {
            int num = freq[i];
            while(num > 0 && count > 0)
            {
                pro = pro * i;
                count--;
                num--;
            }
        }
        return pro;
    }
}