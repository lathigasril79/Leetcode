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
    List<Integer> l = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Traverse(root1);
        Traverse(root2);
        l.sort((a,b)->Integer.compare(a,b));
        return l;
    }
    void Traverse(TreeNode root)
    {
        if(root != null)
        {
                Traverse(root.left);
                l.add(root.val);
                Traverse(root.right);
        }
    }
}