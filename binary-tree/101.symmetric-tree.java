/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }
        if (!isSymmetric(left.left, right.right) || !isSymmetric(left.right, right.left)) {
            return false;
        }
        return left.val == right.val;
    }
}
// @lc code=end

