// Last updated: 09/07/2026, 09:55:34
import java.util.*;

class Solution {
    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        // store values
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(list);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i=0;i<list.size();i++){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}