package merge_sorted_array

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val l = IntArray(m + n)
        var j = 0
        var i = 0
        var k = 0
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                l[k++] = nums1[i++]
            } else {
                l[k++] = nums2[j++]
            }
        }
        if (i == m) {
            for (i in j until n) {
                l[k++] = nums2[i]
            }
        } else {
            for (j in i until m) {
                l[k++] = nums1[j]
            }
        }
        for (j in 0 until m + n) {
            nums1[j] = l[j]
        }
    }
}
