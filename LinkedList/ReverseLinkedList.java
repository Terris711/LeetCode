package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode first = null;
        ListNode current = head;

        while (current != null){
            ListNode temp = current.next;
            current.next = first;
            first = current;
            current = temp;
        }
        return first;
    }
}
