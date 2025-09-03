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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // use hashmap to store the index of inorder
        Map<Integer,Integer> indmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            indmap.put(inorder[i],i);
        }

        // split the tree for construction
        return splitTree(preorder, indmap, 0, 0, inorder.length - 1);
    }
    public static TreeNode splitTree(int[] preorder, Map<Integer,Integer> indmap, int rootind, int left, int right)
    {
        // Crete a answer Tree for Storing
        TreeNode root = new TreeNode(preorder[rootind]);

        // finding mid position using the indmap
        int mid = indmap.get(preorder[rootind]);

        // Create left side of Tree
        if(left < mid)
        {
            // To find the left root ind use this formula => (rootind + 1)
            root.left = splitTree(preorder, indmap, rootind + 1, left, mid - 1);
        }
        // Create right side of Tree
        if(mid < right)
        {
            // To find the right root ind use this formula => (rootind + mid - left + 1)
            root.right = splitTree(preorder, indmap, rootind + mid - left + 1, mid + 1, right);
        }
        return root;
    }
}