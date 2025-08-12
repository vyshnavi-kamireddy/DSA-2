class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}


public class Deletion {

    public static Node arraytoLL(int[] arr)
    {
        if(arr.length==0) return null;
        Node head=new Node(arr[0],null);
        Node temp=head;
        for(int i=1;i<arr.length;i++)
        {
            Node newNode=new Node(arr[i],null);
            temp.next=newNode;
            temp=newNode;
        }
        return head;
    }

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

    public static Node deleteHead(Node head)
    {
        if(head==null || head.next==null) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        return head;
    }

    /* TC=O(1) SC=O(1) */

    public static Node deletetail(Node head)
    {
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null) temp=temp.next;
        temp.next=null;
        return head;
    }

     /* TC=O(N) SC=O(1) */

    public static Node deletekthele(Node head,int k)
    {
        if(head==null) return null;
        if(k==1)
        {
            Node temp=head;
            head=head.next;
            temp.next=null;
            return head;
        }
        Node temp=head;
        int count=1;
        while(temp.next!=null)
        {
            if(count==k-1)
            {
                temp.next=temp.next.next;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

     /* TC=O(N) SC=O(1) */

    public static Node Value(Node head,int val)
    {
        if(head==null) return head;
        if(head.data==val)
        {
            head=head.next;
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data==val)
            {
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

     /* TC=O(N) SC=O(1) */

    
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        Node head=arraytoLL(arr);
        Traverse(head);
        head=deleteHead(head);
        Traverse(head);
        head=deletetail(head);
        Traverse(head);
        head=deletekthele(head, 3);
        Traverse(head);
        head=Value(head, 30);
        Traverse(head);
    }
}
