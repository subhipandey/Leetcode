package maximum_number_of_vowel_in_a_substring

fun main() {
    val solution = Solution()
    val s = "abciiidef"
    val k = 3
    val result = solution.maxVowels(s, k)
    println(result)
}

class Solution {
    fun maxVowels(s: String, k: Int): Int {
        var count = 0
        for (i in 0 until k) {
            if (isVowel(s[i])) {
                count++
            }
        }
        var max = count
        for (i in k until s.length) {
            if (isVowel(s[i])) {
                count++
            }
            if (isVowel(s[i - k])) {
                count--
            }
            max = Math.max(max, count)
        }
        return max
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }
}
