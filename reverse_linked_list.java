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
    public ListNode reverseList(ListNode head) {
        ListNode headCur = null;
        ListNode temp = null;
        ListNode newHead = head;
        List<Integer> list = new ArrayList<Integer>();
        while(head != null) {
            if(headCur == null) {
                headCur = head;
                temp = headCur;
                head = head.next;
                list.add(temp.val);
            } else {
                temp.next = head;
                temp = temp.next;
                head = head.next;
                list.add(temp.val);
            }
        }
        headCur = null;
        temp = null;
        int i = list.size() - 1;
        while(newHead != null) {
            if(headCur == null) {
                headCur = newHead;
                temp = headCur;
                temp.val = list.get(i);
                newHead = newHead.next;
            } else {
                temp.next = newHead;
                temp = temp.next;
                temp.val = list.get(i);
                newHead = newHead.next;
            }
            i--;
        }
        return headCur;
    }
}
