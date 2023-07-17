package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class isPalindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();
        ListNode value = head;

        while(value != null){
            array.add(value.val);
            value = value.next;
        }

        int front = 0;
        int rear = array.size() - 1;
        while (front < rear){
            if(!array.get(front).equals(array.get(rear))){
                return false;
            }
            front++;
            rear--;
        }
        return true;
    }
}
