class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        bubble(0,arr);
    }
    void bubble(int i,int[] arr)
    {
        boolean swapped=false;
        if(i==arr.length-1) return;
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
        if(!swapped) return;
        bubble(i+1,arr);
    }
}



 /* 
           Time Complexity:
           Best Case   = O(N)
           Average Case= O(N^2)
           Worst Case  = O(N^2)
           
           Space Complexity:
           SC = O(N)
*/