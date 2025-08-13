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
    static List<Integer> list;
    public static void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>();
        inorder(root);
        return list.size() > k ? list.get(k-1) : list.get(list.size()-1);
    }
}