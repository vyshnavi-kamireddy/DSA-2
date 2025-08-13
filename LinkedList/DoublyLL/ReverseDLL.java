class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp.next!=null)
        {
            al.add(temp.data);
            temp=temp.next;
        }
        al.add(temp.data);
        int i=0;
        while(temp!=null)
        {
            temp.data=al.get(i);
            i++;
            temp=temp.prev;
        }
        return head;
    }
}

/* TC=O(2N) SC=O(N) */


class Solution2 {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode temp=head;
        Stack<Integer> s=new Stack<>();
        while(temp!=null)
        {
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            temp.data=s.pop();
            temp=temp.next;
        }
        return head;
    }
}

/* TC=O(2N) SC=O(N) */

class Solution3 {
    public DLLNode reverseDLL(DLLNode head) {
        if(head==null || head.next==null) return head;
        DLLNode temp=null;
        DLLNode current=head;
        while(current!=null)
        {
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        head=temp.prev;
        return head;
    }
}

/* TC=O(N) SC=O(1) */