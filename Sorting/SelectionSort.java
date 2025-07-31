class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}

/* 
           Time Complexity:
           Best Case    = O(N^2)
           Average Case = O(N^2)
           Worst Case   = O(N^2)

           Space Complexity:
           SC = O(1)
*/