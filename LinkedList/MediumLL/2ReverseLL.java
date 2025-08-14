class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            temp.val=s.pop();
            temp=temp.next;
        }
        return head;
    }
}

/* TC=O(2N) SC=O(N) */

class Solution2 {
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode current=head;
        while(current!=null)
        {
            ListNode front=current.next;
            current.next=temp;
            temp=current;
            current=front;
        }
        return temp;
    }
}

/* TC=O(N) SC=O(1) */