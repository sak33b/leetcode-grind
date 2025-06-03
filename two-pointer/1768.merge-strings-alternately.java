/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        boolean flipper = true;
        int i = 0, j = 0;
        String merged = "";
        while (i < word1.length() || j < word2.length()) {
            char c;
            if (i == word1.length() && j < word2.length()) {
                c = word2.charAt(j++);
            } else if (j == word2.length() && i < word1.length()) {
                c = word1.charAt(i++);
            } else if (flipper) {
                c = word1.charAt(i++);
            } else {
                c = word2.charAt(j++);
            }
            merged += String.valueOf(c);
            flipper = !flipper;
        }
        return merged;
    }
}
// @lc code=end

