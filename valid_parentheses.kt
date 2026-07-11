https://leetcode.com/problems/valid-parentheses/description/


class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for(ch in s) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch)
            } else {

                if (stack.isEmpty()) {
                    return false
                }   

                val top = stack.pop()

                if(
                    (ch == ')' && top != '(' ) ||
                    (ch == '}' && top != '{' ) ||
                    (ch == ']' && top != '[' )
                ) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}
