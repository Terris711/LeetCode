package LinkedList;

public class MergerTwoLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 != null && list2 != null){
                //If list1 node is larger than list 2 ==> list 1 comes first
                if (list1.val < list2.val){
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                } else {
                    list2.next = mergeTwoLists(list1,list2.next);
                    return list2;
                }
            }
            if(list1 == null){
                return list2;
            } else {
                return list1;
            }
        }
    }
}

// Using recursive with O(n) Java


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode MergeTwoLists(ListNode list1, ListNode list2) {
        // Base case
        if (list1 != null && list2 != null) {
            // Using recursive
            if (list1.val < list2.val){
                list1.next = MergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = MergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null) return list2;
        else return list1;
    }
}

// O(n) using C# same approach with Java