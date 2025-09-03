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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> indmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            indmap.put(inorder[i],i);
        }
        return splitTree(postorder, indmap, postorder.length-1, 0, inorder.length-1);
    }
    public static TreeNode splitTree(int[] postorder, Map<Integer,Integer> indmap, int rootind, int left, int right)
    {
        // Base case
        if(left > right)
            return null;
        
        TreeNode root = new TreeNode(postorder[rootind]);

        int mid = indmap.get(postorder[rootind]);

        if(mid < right)
        {
            root.right = splitTree(postorder, indmap, rootind - 1, mid + 1, right);
        }

        if(left < mid)
        {
            root.left = splitTree(postorder, indmap, rootind - right + mid - 1, left, mid - 1);
        }
        
        return root;
    }
}