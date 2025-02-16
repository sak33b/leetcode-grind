/*
 * @lc app=leetcode id=2181 lang=java
 *
 * [2181] Merge Nodes in Between Zeros
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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode previous = head;
        ListNode current = head;

        while(previous != null) {
            
            int sum = 0;

            while (current.next.val != 0) {
                sum += current.val;
                current = current.next;
            }

            previous.val = sum + current.val;
            current = current.next;

            if (current.next == null) {
                previous.next = null;
            } else {
                previous.next = current;
            }

            previous = previous.next;
        }

        return head;
    }
}
// @lc code=end
