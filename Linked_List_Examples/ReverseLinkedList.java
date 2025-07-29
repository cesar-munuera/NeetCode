package Linked_List_Examples;

public class ReverseLinkedList {

    /* Given the head of a singly linked list, reverse the list, and return the reversed list.
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     */

    public static ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }


    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);

            if (current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversed = reverseList(head);
        printList(reversed);
    }

}
