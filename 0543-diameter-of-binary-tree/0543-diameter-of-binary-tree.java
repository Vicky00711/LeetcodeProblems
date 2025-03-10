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

     public static int levels(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(levels(root.left), levels(root.right));
    }
    public static int diameterOfBinaryTree(TreeNode root){
        if (root==null){
            return 0;
        }
        int firstNode= levels(root.left)+levels(root.right);
        int leftAllNodes=diameterOfBinaryTree(root.left);
        int rightAllNodes=diameterOfBinaryTree(root.right);

        return Math.max(firstNode, Math.max(leftAllNodes, rightAllNodes));



    }
}