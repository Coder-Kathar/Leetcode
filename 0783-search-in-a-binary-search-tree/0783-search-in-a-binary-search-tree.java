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
    public static TreeNode newroot;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)    return null;
        if(root.val == val)
        {
            newroot = root;
            return newroot;
        }
        else if(val < root.val)
            root = searchBST(root.left,val);
        else if(val > root.val)
            root = searchBST(root.right,val);
        return root;
    }
}