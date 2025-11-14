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
    static int maxdepth;
    static int sum;
    public int deepestLeavesSum(TreeNode root) {
        maxdepth = 0;
        sum = 0;
        dfs(root,0);
        return sum;
    }
    public static void dfs(TreeNode root, int depth)
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
        {
            if(depth > maxdepth)
            {
                maxdepth = depth;
                sum = root.val;
            }
            else if(depth == maxdepth)
            {
                sum += root.val;
            }
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}