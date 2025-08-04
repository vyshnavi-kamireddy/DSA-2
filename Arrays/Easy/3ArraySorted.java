class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}

/*  TC=O(N) SC=O(1) */