package reverse_the_linked_list;

public class Solution123 {
    public static void main(String[] args) {
        // Create a linked list
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);

        // Print the original linked list
        System.out.println("Original linked list: ");
        printList(head);

        // Reverse the linked list
        head = reverseList(head);

        // Print the reversed linked list
        System.out.println("Reversed linked list: ");
        printList(head);
    }

    public static ListNode2 reverseList(ListNode2 head) {
        ListNode2 next = null;
        ListNode2 prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void printList(ListNode2 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
    }
}
