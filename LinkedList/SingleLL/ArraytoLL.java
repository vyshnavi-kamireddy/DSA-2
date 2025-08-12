class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
}

public class ArraytoLL {

    public static Node arraytoLL(int[] arr)
    {
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

    /*  TC=O(N) SC=O(1) */

    public static void Traverse(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    /*  TC=O(N) SC=O(1) */

    public static int LengthofLL(Node head)
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }

    /*  TC=O(N) SC=O(1) */

    public static int Search(Node head,int key)
    {
        Node temp=head;
        int flag=0;
        while(temp!=null)
        {
            if(temp.data==key) 
            {
                flag=1;
                break;
            }
            temp=temp.next;
        }
        return flag;
    }

    /* 

        BestCase=O(1)
        AverageCase=O(N)
        WorstCase=O(N)
        SC=O(1)
        
    */


    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50,70,90};
        Node head=arraytoLL(arr);
        Traverse(head);
        System.out.println(LengthofLL(head));
        System.out.println(Search(head, 70));
    }
}
