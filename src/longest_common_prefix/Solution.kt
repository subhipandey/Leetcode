package longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var answer = strs[0]
        for (str in strs) {
            if (str.length < answer.length) {
                answer = str
            }
        }
        var check = false
        while (answer != "") {
            check = true
            for (s in strs) {
                if (!s.startsWith(answer)) {
                    check = false
                    break
                }
            }
            if (check) return answer else answer = answer.substring(0, answer.length - 1)
        }
        return ""
    }
}