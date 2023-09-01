package minimum_flips_to_make_OR

class Solution {
    fun minFlips(a: Int, b: Int, c: Int): Int {
        var sol = 0
        var a = a
        var b = b
        var c = c
        while (a != 0 || b != 0 || c != 0) {
            val a1 = a and 1
            val b1 = b and 1
            val c1 = c and 1
            if (a1 or b1 != c1) {
                if (a1 and b1 == 1) sol += 2 else sol++
            }
            a = a shr 1
            b = b shr 1
            c = c shr 1
        }
        return sol
    }
}
