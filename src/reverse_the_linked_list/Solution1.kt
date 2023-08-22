package reverse_the_linked_list

fun main() {
    val solution = Solution()
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    var reversedList = solution.reverseList(head)
    while (reversedList != null) {
        print("${reversedList.`val`} ")
        reversedList = reversedList.next
    }
}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        var next: ListNode?

        while (curr != null) {
            next = curr.next

            curr.next = prev

            prev = curr

            curr = next
        }
        var newHead = prev

        return newHead
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
