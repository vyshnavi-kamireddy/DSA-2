class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        insertion(1,arr);
    }
    public void insertion(int i,int[] arr)
    {
        if(i==arr.length) return;
        int j=i;
        while(j>0 && arr[j]<arr[j-1])
        {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertion(i+1,arr);
    }
}

/*
           Time Complexity:
           Best Case    = O(N)      // Already sorted
           Average Case = O(N^2)
           Worst Case   = O(N^2)

           Space Complexity:
           SC = O(n)
*/