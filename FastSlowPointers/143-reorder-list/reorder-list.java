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

    private ListNode rev(ListNode head){

        ListNode cur = head;
        ListNode prev = null;

        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;

    }

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = rev(slow.next);
        ListNode prev = null;

        slow.next = null;

        while(rev!=null && head!=null){
            ListNode next = head.next;
            head.next = rev;
            head = next;

            ListNode nextr = rev.next;
            rev.next = head;
            rev = nextr;
        }
        
    }
}