class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

public class Insertion {

    public static Node ArraytoDLL(int[] arr)
    {
        if(arr.length==0) return null;
        Node head=new Node(arr[0],null,null);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node newNode=new Node(arr[i],null,temp);
            temp.next=newNode;
            temp=newNode;
        }
        return head;
    }

    /* TC=O(N) SC=O(1) */

    public static void Traverse(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    /* TC=O(N) SC=O(1) */

    public static Node insertHead(Node head,int val)
    {
        if(head==null) return new Node(val,null,null);
        Node newNode=new Node(val,head,null);
        head.prev=newNode;
        head=newNode;
        return head;
    }

    /* TC=O(1) SC=O(1) */

    public static Node insertTail(Node head,int val)
    {
        if(head==null) return new Node(val,null,null);
        if(head.next==null) return insertHead(head, val);
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        Node back=temp.prev;
        Node newNode=new Node(val,temp,back);
        back.next=newNode;
        temp.prev=newNode;
        return head;
    }

    /* TC=O(N) SC=O(1) */

    public static Node insertAtKthEle(Node head,int val,int k)
    {
        if(head==null) return head;
        if(k==1) return insertHead(head, val);
        Node temp=head;
        int count=1;
        while(temp!=null)
        {
            if(count==k) break;
            count++;
            temp=temp.next;
        }
        if(temp==null) return head;
        Node back=temp.prev;
        Node newNode=new Node(val,temp,back);
        temp.prev=newNode;
        back.next=newNode;
        return head;
    }

    /* TC=O(N) SC=O(1) */

    public static void insertNode(Node node,int val)
    {
        Node back=node.prev;
        Node newNode=new Node(val,node,back);
        back.next=newNode;
        node.prev=newNode;
    }

    /* TC=O(1) SC=O(1) */

    
    public static void main(String[] args)
    {
        int[] arr={10,20,30};
        Node head=ArraytoDLL(arr);
        Traverse(head);
        head=insertHead(head, 5);
        Traverse(head);
        head=insertTail(head, 45);
        Traverse(head);
        head=insertAtKthEle(head, 25, 4);
        Traverse(head);
        insertNode(head.next.next, 35);
        Traverse(head);
    }
}
