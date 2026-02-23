class Solution {
    public boolean scoreBalance(String s) {
        int totalSum = 0;
        for(char c:s.toCharArray())
        {
            int val = c-'a'+1;
            totalSum += val;
        }
        System.out.println(totalSum);
        int currSum = 0;
        for(char c : s.toCharArray())
        {
            int val = c-'a'+1;
            currSum += val;
            totalSum -= val;
            if(currSum == totalSum)
                return true;
        }
        return false;
    }
}