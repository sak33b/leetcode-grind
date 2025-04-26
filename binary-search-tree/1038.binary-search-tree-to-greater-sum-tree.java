/*
 * @lc app=leetcode id=1038 lang=java
 *
 * [1038] Binary Search Tree to Greater Sum Tree
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
    public TreeNode bstToGst(TreeNode root) {
        List<Integer> inorderArray = inorder(root, new java.util.ArrayList<Integer>());
        return bstToGst(root, inorderArray);
    }

    public TreeNode bstToGst(TreeNode root, List<Integer> inorderArray) {
        if (root == null) {
            return null;
        }

        int index = inorderArray.indexOf(root.val);
        int sum = inorderArray.subList(index, inorderArray.size()).stream().mapToInt(Integer::intValue).sum();
        root.val = sum;

        bstToGst(root.left, inorderArray);
        bstToGst(root.right, inorderArray);

        return root;
    }

    public List<Integer> inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list = inorder(root.left, list);
        list.add(root.val);
        list = inorder(root.right, list);
        return list;
    }
} 
// @lc code=end

