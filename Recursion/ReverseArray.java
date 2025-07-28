class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        reverse(0,n-1,arr);
    }
    public void reverse(int i,int n,int arr[]){
        if(i>=n) return;
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
        reverse(i+1,n-1,arr);
    }
}

/* TC=O(N) SC=O(N) */