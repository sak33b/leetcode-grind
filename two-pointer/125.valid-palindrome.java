/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char i = toLowerCase(s.charAt(start));
            char j = toLowerCase(s.charAt(end));

            if (isAlphaNumeric(i) && isAlphaNumeric(j)) {
                if (i != j) return false;
                start++;
                end--;
            }
            if (!isAlphaNumeric(i)) {
                start++;
            }
            if (!isAlphaNumeric(j)) {
                end--;
            }
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + ('a' - 'A'));
        }
        return c;
    }
}
// @lc code=end

