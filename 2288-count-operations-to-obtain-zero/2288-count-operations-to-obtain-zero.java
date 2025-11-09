class Solution {
    public int countOperations(int num1, int num2) {
        if(num1 == 0 || num2 == 0)
            return 0;
        if(num1 == num2)
            return 1;
        if(num1+1 == num2 || num1 == num2+1)
            return Math.max(num1,num2);
        int count = 0;
        while(num1 != 0 && num2 != 0)
        {
            if(num1 >= num2)
            {
                num1 -= num2;
            }
            else if(num2 >= num1)
            {
                num2 -= num1;
            }
            count++;
        }
        return count;
    }
}