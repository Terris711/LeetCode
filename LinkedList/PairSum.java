package LinkedList;

import java.util.ArrayList;

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
}
