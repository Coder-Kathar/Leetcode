class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] lProd=new int[nums.length];
        int[] rProd=new int[nums.length];
        lProd[0] =1;
        rProd[nums.length-1]=1;
        
        for(int i=1;i<nums.length;i++){
            lProd[i]=lProd[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rProd[i]=rProd[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=lProd[i]*rProd[i];
        }

        return answer;
    }
}