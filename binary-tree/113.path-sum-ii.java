/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum, new java.util.LinkedList<>(), new java.util.LinkedList<>());
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> paths) {
        if (root == null) {
            return paths;
        }
        
        path.add(root.val);
        
        if (root.left == null && root.right == null) {
            int sum = getSum(path);
            
            if (sum == targetSum) {
                paths.add(new java.util.LinkedList<>(path));
            }
            
        }

        paths = pathSum(root.left, targetSum, path, paths);
        paths = pathSum(root.right, targetSum, path, paths);
        
        path.remove(path.size() - 1);
        
        return paths; 
    }

    public int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}
// @lc code=end

