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
        int[] inorder = new int[nodeCount(root)];
        populate(inorder, root, new int[] {0});
        return balanceBST(inorder);
    }

    public TreeNode balanceBST(int[] inorder) {
        int length = inorder.length;
        
        if (length == 0) {
            return null;
        } else if (length == 1) {
            return new TreeNode(inorder[0]);
        } else if (length == 2) {
            return new TreeNode(inorder[1], new TreeNode(inorder[0]), null);
        }

        int mid = length / 2;
        int[] left = java.util.Arrays.copyOfRange(inorder, 0, mid);
        int[] right = java.util.Arrays.copyOfRange(inorder, mid + 1, length);

        return new TreeNode(inorder[mid], balanceBST(left), balanceBST(right));
    }

    public void populate(int[] array, TreeNode root, int[] i) {
        if (root == null) {
            return;
        }
        populate(array, root.left, i);
        array[i[0]++] = root.val;
        populate(array, root.right, i);
    }

    public int nodeCount(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + nodeCount(root.left) + nodeCount(root.right);
    }
}
// @lc code=end

