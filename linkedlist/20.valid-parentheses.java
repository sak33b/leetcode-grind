/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {
        LinkedList<String> stack = new LinkedList<>();

        for (char ch : s.toCharArray()) {

            String c = String.valueOf(ch);

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (stack.peek().equals("(") && c.equals(")")) {
                stack.pop();
            } else if (stack.peek().equals("{") && c.equals("}")) {
                stack.pop();
            } else if (stack.peek().equals("[") && c.equals("]")) {
                stack.pop();
            } else {
                stack.push(c);
            }


        }

        return stack.isEmpty();
    }
}
// @lc code=end

