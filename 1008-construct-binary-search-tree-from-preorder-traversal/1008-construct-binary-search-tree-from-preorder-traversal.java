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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
       for(int i=0;i<preorder.length;i++)
       root = InsertNode(root,preorder[i]);

       return root;
    }
    TreeNode InsertNode(TreeNode root, int key)
    {
        if(root == null)
        {
        root = new TreeNode(key);
        return root;
        }
        else if(root.val > key)
        root.left = InsertNode(root.left,key);
        else if(root.val < key)
        root.right = InsertNode(root.right,key);
        else
        return null; 
        return root;
    }
}