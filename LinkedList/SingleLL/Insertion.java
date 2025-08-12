class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}
public class Insertion {

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

    public static Node InsertatHead(Node head,int val)
    {
        if(head==null) return new Node(val,null);
        Node temp=new Node(val,head);
        head=temp;
        return head;
    }

    /* TC=O(1) SC=O(1) */

    public static Node InsertAtTail(Node head,int val)
    {
        if(head==null) return new Node(val,null);
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        Node newNode=new Node(val,null);
        temp.next=newNode;
        return head;
    }

    /* TC=O(N) SC=O(1) */

    public static Node InsertAtKthEle(Node head,int k,int val)
    {
        if(head==null)
        {
            if(k==1) return new Node(val,null);
            else return head;
        }
        if(k==1)
        {
            Node newNode=new Node(val,head);
            head=newNode;
            return head;
        }
        Node temp=head;
        int count=1;
        while(temp!=null)
        {
            if(count==k-1)
            {
                Node newNode=new Node(val,temp.next);
                temp.next=newNode;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

    /* TC=O(N) SC=O(1) */

    public static Node Value(Node head,int val,int key)
    {
        if(head==null) return head;
        if(head.data==key)
        {
            Node newNode=new Node(val,head);
            head=newNode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data==key)
            {
                Node newNode=new Node(val,temp.next);
                temp.next=newNode;
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
        head=InsertatHead(head, 5);
        Traverse(head);
        head=InsertAtTail(head, 60);
        Traverse(head);
        head=InsertAtKthEle(head, 4, 25);
        Traverse(head);
        head=Value(head, 15, 20);
        Traverse(head);
    }
}
