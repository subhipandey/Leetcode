package is_subsequence

class Solution1 {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length == 0) return true
        var s_pointer = 0
        for (i in 0 until t.length) {
            if (t[i] == s[s_pointer]) {
                s_pointer++
                if (s_pointer == s.length) return true
            }
        }
        return false
    }
}

fun main() {
    val solution = Solution1()
    val s = "abc"
    val t = "ahbgdc"
    val result = solution.isSubsequence(s, t)
    println(result)
}
