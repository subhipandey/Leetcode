package max_number_of_ksum_pairs

class Solution1 {
    fun maxOperations(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>()
        var u = 0
        for (n in nums) {
            val s = map[k - n]
            if (s == null) {
                val r = map[n]
                if (r == null) {
                    map[n] = 1
                } else {
                    map[n] = r + 1
                }
            } else {
                if (s == 1) {
                    u++
                    map.remove(k - n)
                } else {
                    u++
                    map[k - n] = s - 1
                }
            }
        }
        return u
    }
}

fun main() {
    val solution = Solution1()
    val nums = intArrayOf(1, 2, 3, 4)
    val k = 5
    val result = solution.maxOperations(nums, k)
    println(result)
}
