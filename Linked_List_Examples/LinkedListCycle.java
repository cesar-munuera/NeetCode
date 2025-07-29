package Linked_List_Examples;

public class LinkedListCycle {

    /* Given head, the head of a linked list, determine if the linked list has a cycle in it.
     * Return true if there is a cycle in the linked list.
     * 
     * Example: 1->2->3->4
     *             ^-----'
     */

    public static boolean hasCycle(ListNode head) {

        /* The idea is to have a slow pointer, and another faster one.
         * The slow one goes step by step. The fastest one goes by 2 steps.
         * If the fastest meets null, means that it has no cycle.
         * If both meets each other, means it has a cycle.
         */

        ListNode p1 = head;
        ListNode p2 = head;

        while (p2!=null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println(hasCycle(n1));
    }

}
