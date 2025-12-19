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

    private ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode cur = head;

        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // if(fast!=null){
        //     slow = slow.next;
        // }

        ListNode rev = reverse(slow.next);

        slow.next = null;

        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
        
    }
}