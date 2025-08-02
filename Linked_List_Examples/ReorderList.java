package Linked_List_Examples;

public class ReorderList {

    /* You are given the head of a singly linked-list. L0 → L1 → … → Ln - 1 → Ln
     * Reorder the list to be on the following form: L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
     * 
     * Input: head = [1,2,3,4]
     * Output: [1,4,2,3]
     * 
     * Input: head = [1,2,3,4,5]
     * Output: [1,5,2,4,3]
     */

     public static void reorderList(ListNode head) {
        // Fast and slow
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Save the second list, set to null the last node of first list
        ListNode aux = slow.next;
        slow.next = null;

        // Reverse the second list
        ListNode head2 = ReverseLinkedList.reverseList(aux);

        // Merge lists
        ListNode first = head;
        while (head2 != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = head2.next;
            first.next = head2;
            head2.next = tmp1;
            first = tmp1;
            head2 = tmp2;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println(head.toString());

        reorderList(head);
        System.out.println(head.toString());
    }
}
