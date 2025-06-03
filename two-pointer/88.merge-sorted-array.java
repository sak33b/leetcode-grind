/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = nums1.length - 1;
        
        while (i >= 0 || j >= 0) {
            int next;
            if (i < 0 && j >= 0) {
                next = nums2[j--];
            } else if (j < 0 && i >= 0) {
                next = nums1[i--];
            } else if (nums1[i] > nums2[j]) {
                next = nums1[i--];
            } else {
                next = nums2[j--];
            }
            nums1[index--] = next;
        }
    }
}
// @lc code=end

