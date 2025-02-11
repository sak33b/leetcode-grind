/*
 * @lc app=leetcode id=2807 lang=java
 *
 * [2807] Insert Greatest Common Divisors in Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode pointer = head;

        while (pointer.next != null) {

            int gcd = GCD(pointer.val, pointer.next.val);
            pointer.next = new ListNode(gcd, pointer.next);

            pointer = pointer.next.next;
        }

        return head;
    }

    public int GCD(int a, int b) {
        
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }
}
// @lc code=end

