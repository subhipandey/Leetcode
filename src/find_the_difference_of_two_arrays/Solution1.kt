package find_the_difference_of_two_arrays

class Solution1 {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val list = ArrayList<List<Int>>()
        val array1 = HashSet<Int>()
        val array2 = HashSet<Int>()
        for (num in nums1) array1.add(num)
        for (num in nums2) array2.add(num)
        for (num in nums1) {
            if (array2.contains(num)) {
                array1.remove(num)
                array2.remove(num)
            }
        }
        list.add(ArrayList(array1))
        list.add(ArrayList(array2))
        return list
    }
}

fun main() {
    val solution = Solution1()
    val nums1 = intArrayOf(4, 9, 5)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)
    val result = solution.findDifference(nums1, nums2)
    println(result)
}
