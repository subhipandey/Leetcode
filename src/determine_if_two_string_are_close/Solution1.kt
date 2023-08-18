package determine_if_two_string_are_close

class Solution1 {
    fun closeStrings(w1: String, w2: String): Boolean {
        if (w1.length != w2.length) return false
        val feq1 = IntArray(26)
        val feq2 = IntArray(26)
        for (i in w1.toCharArray()) feq1[i - 'a']++
        for (i in w2.toCharArray()) feq2[i - 'a']++
        for (i in 0..25) {
            if (feq1[i] == 0 && feq2[i] != 0 || feq2[i] == 0 && feq1[i] != 0) return false
        }
        feq1.sort()
        feq2.sort()
        for (i in 0..25) {
            if (feq1[i] != feq2[i]) return false
        }
        return true
    }

    fun main() {
        val sol = Solution1()
        println(sol.closeStrings("abc", "bca"))
        println(sol.closeStrings("a", "aa"))
    }
}
