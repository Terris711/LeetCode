package Array;

public class reorderList {
    public void reorderList(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        ListNode previous = null;

        while(first != null && first.next != null){
            second = second.next;
            first = first.next.next;
        }

        ListNode curNode = second.next;
        second.next = null;
        while (curNode != null){
            ListNode nextNode = curNode.next;
            curNode.next = previous;
            previous = curNode;
            curNode = nextNode;
        }

        ListNode curNode1 = head;
        ListNode curNode2 = previous;
        while (curNode1 != null && curNode2 != null){
            ListNode pointer1 = curNode1.next;
            ListNode pointer2 = curNode2.next;

            curNode1.next = curNode2;
            curNode2.next = pointer1;

            curNode1 = pointer1;
            curNode2 = pointer2;

        }
    }
}
