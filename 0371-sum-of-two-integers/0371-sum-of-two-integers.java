class Solution {
    public int getSum(int a, int b) {
        // XOR & AND(left shift) Approach
        while(b != 0)
        {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}