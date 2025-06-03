/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            
            if (s.charAt(start) != s.charAt(end)) {
                return isValidPalindrome(s, start, end - 1) || isValidPalindrome(s, start + 1, end);
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isValidPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// @lc code=end

