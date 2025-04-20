/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        } 
        if (nums.length == 2) {
            return new TreeNode(nums[1], new TreeNode(nums[0]), null);
        }
        int mid = nums.length / 2;
        int[] left = java.util.Arrays.copyOfRange(nums, 0, mid);
        int[] right = java.util.Arrays.copyOfRange(nums, mid + 1, nums.length);

        return new TreeNode(nums[mid], sortedArrayToBST(left), sortedArrayToBST(right));
    }
}
// @lc code=end

