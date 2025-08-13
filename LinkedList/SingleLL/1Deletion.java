class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node.next;
        node.val=temp.val;
        node.next=temp.next;
        temp.next=null;
    }
}

/* TC=O(1) SC=O(1) */