/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
class Solution24 {
    public ListNode swapPairs(ListNode head) {
      if (head == null || head.next == null) {
          return head;
      }
      ListNode next = head.next;
      head.next = swapPairs(next.next);
      next.next =head;
      return next;

    }
}
// @lc code=end

