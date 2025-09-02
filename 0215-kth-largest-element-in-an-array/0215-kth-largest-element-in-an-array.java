class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : nums)
        {
            max.add(x);
        }
        for(int i=0;i<k-1;i++)
        {
            max.poll();
        }
        return max.peek();
    }
}