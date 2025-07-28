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

/* TC=O(2^n) SC=O(N) */

class Solutiontwo {
    public int fib(int n) {
        int[] memo=new int[n+1];
        return fibonacci(n,memo);
    }
    public int fibonacci(int n,int[] memo){
        if(n==0 || n==1) return n;
        if(memo[n]!=0) return memo[n];
        return memo[n]=fibonacci(n-1,memo)+fibonacci(n-2,memo);
    }
}

/* TC=O(n) SC=O(N) */
