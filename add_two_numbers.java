/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    String s = "";
    int j = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String s1 = getValue(l1);
        s = "";
        String s2 = getValue(l2);
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(sumUp(s1, s2));
        s = sumUp(s1, s2);
        ListNode node = null;
        j = 0;
        return getListNode(s, node);
        //return new ListNode(2);
    }
    
    private String sumUp(String s1, String s2) {
        int len = 0;
        int len2 = 0;
        String sum = "";
        int carry = 0;
        if(s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        len = s1.length();
        len2 = s2.length();
        len2--;

        int val = Character.getNumericValue(s2.charAt(len2));
        for(int i = len - 1; i >= 0; i--) {
            int tot = Character.getNumericValue(s1.charAt(i)) + val;
            tot += carry;
            carry = 0;
            
            if(tot > 9) {
                carry = 1;
                sum += String.valueOf(tot).charAt(1);
            } else {
                tot = tot + carry;
                carry = 0;
                sum  += String.valueOf(tot);
            }
            
            if(len2 > 0) {
                len2--;
                val = Character.getNumericValue(s2.charAt(len2));
            } else {
                val = 0;
            }
        }
        if(carry > 0) {
            sum += "1";
        }
        return sum;
    }
    
    private String getValue(ListNode node) {
        if(node != null) {
            if(node.next != null) {
                getValue(node.next);
                s += String.valueOf(node.val);
            } else {
                s += String.valueOf(node.val);
            }
        }
        return s;
    }
 
    private ListNode getListNode(String value, ListNode node) {
        if(j < value.length()) {
            int val = Character.getNumericValue(value.charAt(j));
            j++;
            //System.out.println(val);

            if(node == null) {
                node = new ListNode(val);
                getListNode(value, node);
            } else {
                node.next = new ListNode(val);
                getListNode(value, node.next);
            }
        }
    
        return node;
    }
}
