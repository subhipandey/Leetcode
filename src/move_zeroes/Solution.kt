package move_zeroes

class Solution {
    fun moveZeroes(nums: IntArray) {
        var position = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[position] = nums[i]
                position++
            }
        }
        for (i in position until nums.size) {
            nums[i] = 0
        }
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(nums)
    println(nums.contentToString())
}
