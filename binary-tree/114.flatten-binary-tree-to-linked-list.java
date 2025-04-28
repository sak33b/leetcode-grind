/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
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
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode head = flattenTree(root);
        root.val = head.val;
        root.left = null;
        root.right = head.right;
    }

    public TreeNode flattenTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode head = new TreeNode(root.val);
        TreeNode left = flattenTree(root.left);
        TreeNode right = flattenTree(root.right);
        
        if (left == null) {
            head.right = right;
        } else if (right == null) {
            head.right = left;
        } else {
            head.right = append(left, right);
        }

        return head;
    }

    public TreeNode append(TreeNode head, TreeNode node) {
        if (head == null || node == null) return head;

        TreeNode tn = head;
        while (tn.right != null) {
            tn = tn.right;
        }
        tn.right = node;

        return head;
    }
}
// @lc code=end

