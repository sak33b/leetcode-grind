/*
 * @lc app=leetcode id=1669 lang=java
 *
 * [1669] Merge In Between Linked Lists
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

    // Time Complexity: O(n), Space Complexity O(1)

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode nodeA = null;

        int index = 0;
        ListNode pointer = list1;

        while (index < b + 1) {

            if (index == a - 1) {
                nodeA = pointer;
            }

            pointer = pointer.next;
            index++;
        }

        ListNode nodeB = pointer;

        nodeA.next = list2;
        
        pointer = list2;

        while (pointer.next != null) {
            pointer = pointer.next;
        }

        pointer.next = nodeB;


        return list1;
    }
}
// @lc code=end

