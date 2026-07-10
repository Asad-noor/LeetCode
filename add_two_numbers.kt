problem link: https://leetcode.com/problems/add-two-numbers/description/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyhead = ListNode(0)
        var current = dummyhead

        var p = l1
        var q = l2

        var carry = 0

        while(p != null || q != null || carry != 0) {
            
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0

            val sum = x + y + carry

            carry = sum / 10

            current.next = ListNode(sum % 10)
            current = current.next!!

            p = p?.next
            q = q?.next
        }

        return dummyhead.next
    }
}
