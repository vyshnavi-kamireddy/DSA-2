class Solution {
    public void insertionSort(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else break;
            }
        }
    }
}

 /*
           Time Complexity:
           Best Case    = O(N)      // Already sorted
           Average Case = O(N^2)
           Worst Case   = O(N^2)

           Space Complexity:
           SC = O(1)
*/


class Solution2 {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}