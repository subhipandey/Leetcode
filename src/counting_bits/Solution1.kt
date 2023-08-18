package counting_bits

class Solution1 {
    fun countBits(n: Int): IntArray {
        val counts = IntArray(n + 1)

        for (i in 1..n) {
            counts[i] = if (i % 2 == 0) {
                counts[i / 2]
            } else {
                counts[i / 2] + 1
            }
        }

        return counts
    }
}

fun main() {
    val solution = Solution1()
    val n = 5
    val result = solution.countBits(n)
    println("Result: ${result.contentToString()}")
}
