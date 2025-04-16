/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    public List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePaths(root, new String(), new java.util.LinkedList<String>());
    }

    public List<String> binaryTreePaths(TreeNode root, String path, List<String> list) {
        if (root == null) {
            return list;
        }

        if (root.left == null && root.right == null) {
            path += String.valueOf(root.val);
            list.add(path);
            return list;
        }
        path += String.valueOf(root.val) + "->";
        list = binaryTreePaths(root.left, path, list);
        list = binaryTreePaths(root.right, path, list);
        return list;
    }
}
// @lc code=end

