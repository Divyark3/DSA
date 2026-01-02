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
    public ListNode removeElements(ListNode head, int val) {

        ListNode ans = new ListNode(0, head);
        ListNode dum=ans;

        while(dum!=null ){

            while(dum.next!=null && dum.next.val == val){
                dum.next = dum.next.next;
            }

            dum = dum.next;
        }
            return ans.next;
    }
}