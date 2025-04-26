/*
 * @lc app=leetcode id=1382 lang=java
 *
 * [1382] Balance a Binary Search Tree
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
    public TreeNode balanceBST(TreeNode root) {

        int nodeCount = getNodeCount(root);
        int[] inorder = new int[nodeCount];
        fillInorder(root, inorder, 0);
        return createBST(inorder, 0, nodeCount - 1);
    }

    public TreeNode createBST(int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        return new TreeNode(inorder[mid], createBST(inorder, start, mid - 1), createBST(inorder, mid + 1, end));
    }

    public int fillInorder(TreeNode root, int[] inorder, int index) {
        if (root == null) {
            return index;
        }
        index = fillInorder(root.left, inorder, index);
        inorder[index++] = root.val;
        index = fillInorder(root.right, inorder, index);

        return index;
    }

    public int getNodeCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + getNodeCount(root.left) + getNodeCount(root.right);
    }

}
// @lc code=end

