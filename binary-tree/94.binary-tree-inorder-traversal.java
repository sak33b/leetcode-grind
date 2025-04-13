/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversal(root, new java.util.LinkedList());
    }

    public List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list = inorderTraversal(root.left, list);
        list.add(root.val);
        list = inorderTraversal(root.right, list);

        return list;
    }
}
// @lc code=end

