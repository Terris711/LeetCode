package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PairSum {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curNode = head;
        int n = 0;

        while(curNode != null){
            list.add(curNode.val);
            n++;
            curNode = curNode.next;
        }

        int mid = n/2;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= mid; i++){
            int sum = list.get(i) + list.get(n - i - 1);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public int pairSum(ListNode head) {
        ListNode half = head;
        ListNode end = head;

        //Find mid point
        while(end.next != null && end.next.next != null){
            half = half.next;
            end = end.next.next;
        }

        ListNode reverse = reverseLinkedList(half);
        int result = 0;
        while (reverse != null & head  != null){
            result = Math.max(result, reverse.val + head.val);
            reverse = reverse.next;
            head = head.next;
        }
        return result;
    }

    public ListNode reverseLinkedList(ListNode node){
        ListNode first = null;
        ListNode second = null;
        ListNode curr = node;

        while (curr != null){
            ListNode temp = curr.next;
            first = second;
            second = curr;
            second.next = first; //Why?
            curr = temp;
        }
        return second;
    }

}
