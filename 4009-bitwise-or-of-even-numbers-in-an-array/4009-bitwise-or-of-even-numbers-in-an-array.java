class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int sum = 0;
        for(int x : nums){
            if(x % 2 == 0){
                sum |= x;
            }
        }
        return sum;
    }
}