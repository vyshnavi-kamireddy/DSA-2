public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(s.contains(temp)) return true;
            s.add(temp);
            temp=temp.next;
        }
        return false;
    }
}

/*  TC=O(N) SC=O(N) */


public class Solution2 {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}


/*  TC=O(N) SC=O(1) */