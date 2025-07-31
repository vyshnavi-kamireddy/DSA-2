class Solution {
    public void BruteSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

/* TC= O(N^2) SC=O(1) */