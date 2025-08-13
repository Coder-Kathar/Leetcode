/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode converting(int left,int right, int[] nums)
    {
        if(left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode newnode = new TreeNode(nums[mid]);
        newnode.left = converting(left,mid-1,nums);
        newnode.right = converting(mid+1,right,nums);
        return newnode;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return converting(0,nums.length-1,nums);
    }
}