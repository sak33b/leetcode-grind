/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
 */

// @lc code=start
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
    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversal(root, new java.util.LinkedList());
    }

    public List<Integer> postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        List<Integer> left = postorderTraversal(root.left, list);
        List<Integer> right = postorderTraversal(root.right, left);
        
        right.add(root.val);
        return right;
    }
}
// @lc code=end

