/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new java.util.LinkedList();
        int level = getMaxHeight(root);
        for (int i = 0; i < level; i++) {
            list.add(getNodeValuesAtLevel(root, i, 0, new java.util.LinkedList()));
        }
        return list;
    }
    
    public List<Integer> getNodeValuesAtLevel(TreeNode root, int level, int currentLevel, List<Integer> list) {
        if (currentLevel > level || root == null) {
            return list;
        }
        if (level == currentLevel) {
            list.add(root.val);
            return list;
        }
        list = getNodeValuesAtLevel(root.left, level, currentLevel + 1, list);
        list = getNodeValuesAtLevel(root.right, level, currentLevel + 1, list);
        return list;
    }

    public int getMaxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = getMaxHeight(root.left);
        int rightMax = getMaxHeight(root.right);

        return 1 + Math.max(leftMax, rightMax);
    }
}
// @lc code=end

