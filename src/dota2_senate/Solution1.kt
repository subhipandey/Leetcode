package dota2_senate

class Solution {
    fun predictPartyVictory(s: String): String {
        val n = s.length
        val ch = s.toCharArray()
        var td = 0
        var tr = 0
        for (i in 0 until n) {
            if (ch[i] == 'R') tr++
            else td++
        }
        var r = 0
        var d = 0
        while (tr > 0 && td > 0) {
            for (i in 0 until n) {
                if (ch[i] == '*') continue
                if (ch[i] == 'R') {
                    if (d == 0) {
                        r += 1
                    } else {
                        ch[i] = '*'
                        d--
                        tr--
                    }
                } else {
                    if (r == 0) {
                        d += 1
                    } else {
                        ch[i] = '*'
                        td--
                        r--
                    }
                }
            }
        }
        // println("$tr $td")
        return if (td <= 0) "Radiant" else "Dire"
    }
}