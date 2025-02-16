/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) { // O(n)
        
        int maxOnes = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                int countOnes = 0;

                while (i < nums.length && nums[i] == 1) {
                    countOnes++;
                    i++;
                }
                
                if (countOnes > maxOnes) {
                    maxOnes = countOnes;
                }
            }
        }


        return maxOnes;

    }
}
// @lc code=end

