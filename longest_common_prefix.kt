https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()
        var i = 0
        var s = ""
        val len = strs.size

        while(i < strs[0].length) {
            if(strs[0][i] == strs[len - 1][i]) {
                s += strs[0][i]
            } else {
                break
            }
            i++
        }
        return s
    }
}
