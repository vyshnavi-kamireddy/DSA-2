class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high) i++;
            while(arr[j]>=pivot && j>low) j--;
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}





// Randomization

class Solution2 {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivotIndex=low+(int)(Math.random()*(high-low+1));
        swap(arr,low,pivotIndex);
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high) i++;
            while(arr[j]>=pivot && j>low) j--;
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

//Median of Threee

class Solution3 {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        int mid=(low+high)/2;
        int pivotIndex=median(low,mid,high,arr);
        swap(arr,low,pivotIndex);
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<high) i++;
            while(arr[j]>=pivot && j>low) j--;
            if(i<j) swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int median(int a,int b,int c,int[] arr)
    {
        int x=arr[a];
        int y=arr[b];
        int z=arr[c];
        if((x-y)*(z-x)>=0) return a;
        else if((y-x)*(z-y)>=0) return b;
        else return c;
    }
}



 /* 
           Time Complexity:
           Best Case   = O(NlogN)
           Average Case= O(NlogN)
           Worst Case  = O(N^2)
           
           Space Complexity:
           Best Case   = O(logN)
           Average Case= O(logN)
           Worst Case  = O(N)
*/