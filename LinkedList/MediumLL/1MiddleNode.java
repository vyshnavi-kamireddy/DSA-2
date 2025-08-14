class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int pos=count/2+1;
        temp=head;
        while(temp!=null)
        {
            pos--;
            if(pos==0) break;
            temp=temp.next;
        }
        return temp;
    }
}

/* TC=O(N+N/2) SC=O(1) */


class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

/* TC=O(N/2) SC=O(1) */