
class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}

/* TC=O(N) SC=O(1) */