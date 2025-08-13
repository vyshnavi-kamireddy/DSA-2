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

public class Deletion {
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

    public static Node deleteHead(Node head)
    {
        if(head==null || head.next==null) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        head.prev=null;
        return head;
    }

    /* TC=O(1) SC=O(1) */

    public static Node deleteTail(Node head)
    {
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        Node back=temp.prev;
        temp.prev=null;
        back.next=null;
        return head;
    }

    /* TC=O(N) SC=O(1) */

    public static Node deletekthEle(Node head,int k)
    {
        if(head==null) return null;
        Node temp=head;
        int count=1;
        while(temp!=null)
        {
            if(count==k) break;
            count++;
            temp=temp.next;
        }
        if(temp==null) return head;
        Node front=temp.next;
        Node back=temp.prev;
        if(front==null && back==null) return null;
        else if(front==null) return deleteTail(head);
        else if(back==null) return deleteHead(head);
        back.next=front;
        front.prev=back;
        temp.prev=null;
        temp.next=null;
        return head;
    }

     /* TC=O(N) SC=O(1) */

    public static void deleteNode(Node node)
    {
        Node back=node.prev;
        Node front=node.next;
        if(front==null)
        {
            back.next=null;
            node.prev=null;
            return;
        }
        back.next=front;
        front.prev=back;
        node.next=null;
        node.prev=null;
    }

    /* TC=O(1) SC=O(1) */

    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50,60};
        Node head=ArraytoDLL(arr);
        Traverse(head);
        head=deleteHead(head);
        Traverse(head);
        head=deleteTail(head);
        Traverse(head);
        head=deletekthEle(head, 1);
        Traverse(head);
        deleteNode(head.next.next);
        Traverse(head);
    }

}
