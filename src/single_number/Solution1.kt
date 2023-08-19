package single_number

class Solution1 {
    fun singleNumber(nums: IntArray): Int {
        var x = 0
        for (i in nums) {
            x = x xor i
        }
        return x
    }
}

fun main() {
    val solution = Solution1()
    val nums = intArrayOf(4, 1, 2, 1, 2)
    val result = solution.singleNumber(nums)
    println(result)
}
