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
}
