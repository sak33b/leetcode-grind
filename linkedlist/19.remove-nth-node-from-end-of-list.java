/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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

    // Time Complexity: O(n), Space Complexity: O(1)

    public ListNode removeNthFromEnd(ListNode head, int n) { // O(n)

        if (head.next == null) {
            return null;
        }

        int toRemove = calculateSize(head) - n;

        if (toRemove == 0) {
            head = head.next;
            return head;
        }

        ListNode pointer = head;
        int i = 0;

        while(pointer.next != null) {

            if (i == toRemove - 1) {
                pointer.next = pointer.next.next;
                break;
            }

            i = i + 1;
            pointer = pointer.next;
        }

        return head;
    }

    public int calculateSize(ListNode head) { // O(n)
        
        int size = 0;
        
        for (ListNode n = head; n != null; n = n.next) {
            size++;
        
        }

        return size;
    }

}
// @lc code=end

