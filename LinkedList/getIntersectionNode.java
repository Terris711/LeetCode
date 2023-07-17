package LinkedList;

import java.util.HashSet;

public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hashSet = new HashSet<>();

        while(headA != null){
            hashSet.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if(hashSet.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;

        while( listA != listB){
            if (listA == null){
                listA = headB;
            } else {
                listA = listA.next;
            }

            if (listB == null){
                listB = headA;
            } else {
                listB = listB.next;
            }
        }
        return listA;
    }
}
