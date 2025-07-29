package Linked_List_Examples;

public class MergeTwoSortedLists {

    /* You are given the heads of two sorted linked lists list1 and list2.
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     * Return the head of the merged linked list.
     * 
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     */

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode initial = new ListNode(0);
        ListNode aux = initial;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                aux.next = list1;
                list1 = list1.next;
            } else {
                aux.next = list2;
                list2 = list2.next;
            }
            aux = aux.next;
        }

        if(list1 !=null){
            aux.next = list1;
        } else {
            aux.next = list2;
        }

        return initial.next;
    }


    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);

        ListNode reversed = mergeTwoLists(head1, head2);
        System.out.println(reversed.toString());
    }
}
