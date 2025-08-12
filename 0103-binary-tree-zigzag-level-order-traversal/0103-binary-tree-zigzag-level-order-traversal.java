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
    List<List<Integer>> ans;
    public static void reverse(List<Integer> x)
    {
        int st = 0;
        int end = x.size()-1;
        while(st < end)
        {
            Integer temp = x.get(st);
            x.set(st,x.get(end));
            x.set(end,temp);
            st++;
            end--;
        }
    } 
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ans = new ArrayList<>();
        if(root == null)
            return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> in = new ArrayList<>();
            int len = q.size();
            for(int i=0;i<len;i++)
            {
                TreeNode curr = q.poll();
                in.add(curr.val);
                if(curr.left != null)   q.add(curr.left);
                if(curr.right != null)   q.add(curr.right);
            }
            ans.add(in);
        }
        int i = 0;
        for(List<Integer> x : ans)
        {
            if(i%2==1)
                reverse(x);
            i++;
        }
        return ans;
    }
}