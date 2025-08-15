public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> s=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(s.contains(temp)) return temp;
            s.add(temp);
            temp=temp.next;
        }
        return null;
    }
}


/*  TC=O(N) SC=O(N) */


public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

/*  TC=O(N) SC=O(1) */