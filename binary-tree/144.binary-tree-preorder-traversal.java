/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(root, new java.util.LinkedList());
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        list = preorderTraversal(root.left, list);
        list = preorderTraversal(root.right, list);
        return list;
    }
}
// @lc code=end

