package unique_number_of_occurences

class Solution1 {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val unique = BooleanArray(2000)
        arr.sort()
        var occurrence = 0
        for (i in arr.indices) {
            occurrence++
            if (i == arr.size - 1) {
                if (!unique[occurrence]) {
                    unique[occurrence] = true
                    occurrence = 0
                } else {
                    return false
                }
            } else if (arr[i] != arr[i + 1]) {
                if (!unique[occurrence]) {
                    unique[occurrence] = true
                    occurrence = 0
                } else {
                    return false
                }
            }
        }
        return true
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val sol = Solution1()
            val arr = intArrayOf(1,2,2,1,1,3)
            println(sol.uniqueOccurrences(arr))
        }
    }
}
