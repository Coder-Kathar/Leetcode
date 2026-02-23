class Solution {
    public String largestNumber(int[] nums) {
        String[] numbers = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            numbers[i] = String.valueOf(nums[i]);
        }
        int n = numbers.length;
        Arrays.sort(numbers, (a,b) -> (b+a).compareTo(a+b));
        if(numbers[0].equals("0"))
            return "0";
        StringBuilder ans = new StringBuilder();
        for(String s : numbers)
            ans.append(s);
        return ans.toString();
    }
}