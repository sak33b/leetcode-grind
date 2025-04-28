/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }

        if (root == p && isChild(root, q)) {
            return root;
        } else if (root == q && isChild(root, p)) {
            return root;
        } else if (p.val < root.val && q.val > root.val) {
            return root;
        } else if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }

    public boolean isChild(TreeNode root, TreeNode node) {
        if (node == null) {
            return false;
        } else if (root == node) {
            return true;
        } else if (node.val < root.val) {
            return isChild(root.left, node);
        } else {
            return isChild(root.right, node);
        }
    }
}
// @lc code=end

