class Solution {
    public String largestNumber(int[] nums) {
        String[] numbers = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            numbers[i] = String.valueOf(nums[i]);
        }
        int n = numbers.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if((numbers[j] + numbers[j+1]).compareTo(numbers[j+1] + numbers[j]) < 0)
                {
                    String temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        if(numbers[0].equals("0"))
            return "0";
        StringBuilder ans = new StringBuilder();
        for(String s : numbers)
            ans.append(s);
        return ans.toString();
    }
}