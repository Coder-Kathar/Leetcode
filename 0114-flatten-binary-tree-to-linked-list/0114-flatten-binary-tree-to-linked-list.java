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
    public static void preorder(ArrayList<Integer> list, TreeNode root)
    {
        if(root != null)
        {
            list.add(root.val);
            preorder(list,root.left);
            preorder(list,root.right);
        }
    }
    public void flatten(TreeNode root) {
        if(root == null)    return;
        ArrayList<Integer> list = new ArrayList<>();
        preorder(list,root);
        root.left = null;
        root.right = null;
        int len = list.size();
        for(int i=1;i<len;i++)
        {
            root.right = new TreeNode(list.get(i));
            root = root.right;
        }
    }
}