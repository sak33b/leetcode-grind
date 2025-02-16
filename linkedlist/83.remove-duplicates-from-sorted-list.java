/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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

    public ListNode deleteDuplicates(ListNode head) { // O(n)

        if (head == null) {
            return head;
        }
        
        ListNode pointer = head;
        
        while (pointer.next != null) {
            
            if (pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
                continue;
            }

            pointer = pointer.next;
        }

        return head;
    }
}
// @lc code=end
