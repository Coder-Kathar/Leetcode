class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];

        int left = 0, right = 0, step = 0;

        // Find the step for index 0
        for(int i=0;i<n;i++)
        {
            if(boxes.charAt(i) == '1')
            {
                step += i;    // Maximum step need along with right side present ball count
                right++;
            }
        }
        ans[0] = step;
        
        // Begin from the first index
        for(int i=1;i<n;i++)
        {
            // Check the previous index has '1'
            if(boxes.charAt(i-1) == '1')
            {
                left++;
                right--;
            }
            ans[i] = ans[i-1] + left - right;
        }
        return ans;
    }
}